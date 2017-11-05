package ru.sbrf.gg.load

import java.io.{File, PrintWriter}

import com.sbt.dpl.gridgain.AffinityParticleKey
import ru.sbt.kmdtransform.TransformType

/**
  */
class GenerateBuilderClasses(dataRoot: String) {
    def generate() = {
        val fileIterator = if (new File(dataRoot).isDirectory)
            directoryIterator(dataRoot)
        else
            zipIterator(dataRoot)


        val tables = fileIterator.filter(_._1.contains('_')).map(file ⇒ file._1.substring(0, file._1.lastIndexOf('_'))).toSet
        val mapCode = tables.map { t ⇒
            val tableInfo = findTableInfo(t)
            val className = generate4Table(tableInfo)

            s"\t\tclassOf[${tableInfo.value.getName}] -> new $className()"
        }

        val file = new File(s"./src/main/scala/ru/sbrf/gg/load/builder/package.scala")

        println(s"Writing $file")
        val output = new PrintWriter(file)

        output.println(
            s"""
              | package ru.sbrf.gg.load
              |
              | package object builder {
              |     val value2builder = Map[Class[_], ObjectBuilder](
              |         classOf[${classOf[AffinityParticleKey].getName}] -> new AffinityParticleKeyBuilder(),
              |         ${mapCode.mkString(",\n")}
              |     )
              | }
            """.stripMargin)
        output.close()
    }

    def generate4Table(tableInfo: TableInfo): String  = {
        val className = s"${tableInfo.value.getSimpleName}Builder"

        val fieldsSetters = tableInfo.valueFields.sortBy(_._2).map { f ⇒
            val name = if (f._1.getName == "type")
                "`type`" else f._1.getName

            s"r.$name = ${f._4.name()}.fromStr(line(${f._2})).asInstanceOf[${f._1.getType.getName}]"
        }

        val file = new File(s"./src/main/scala/ru/sbrf/gg/load/builder/$className.scala")
        println(s"Writing $file")
        val output = new PrintWriter(file)

        output.println(
            s"""
              | package ru.sbrf.gg.load.builder
              |
              | import ru.sbrf.gg.load.TableInfo
              | import ${classOf[TransformType].getName}._
              |
              | class $className extends ObjectBuilder {
              |     def build(line: Array[String], tableInfo: TableInfo): Any = {
              |         val r = new ${tableInfo.value.getName}()
              |
              |         ${fieldsSetters.mkString("\n")}
              |
              |         r
              |     }
              | }
            """.stripMargin)
        output.close()

        className
    }
}
