package ru.sbrf.gg.load

import java.io.{File, PrintWriter}

import com.sbt.dpl.gridgain.AffinityParticleKey
import ru.sbt.kmdtransform.TransformType
import ru.sbt.kmdtransform.TransformType._

import scala.collection.JavaConversions._

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

            s"\t\tbuilders.put(${tableInfo.value.getName}.class, new $className());"
        }

        val file = new File(s"./src/main/java/ru/sbrf/gg/load/builder/Builders.java")

        println(s"Writing $file")
        val output = new PrintWriter(file)

        output.println(
            s"""
              | package ru.sbrf.gg.load.builder;
              |
              | import java.util.Map;
              | import java.util.HashMap;
              |
              | public class Builders {
              |     public static Map<Class<?>, ObjectBuilder> builders = new HashMap<>();
              |     static {
              |         builders.put(com.sbt.dpl.gridgain.AffinityParticleKey.class, new AffinityParticleKeyBuilder());
              |         ${mapCode.mkString("\n")}
              |     }
              | }
            """.stripMargin)
        output.close()
    }

    def generate4Table(tableInfo: TableInfo): String  = {
        val className = s"${tableInfo.value.getSimpleName}Builder"

        val fieldsSetters = tableInfo.valueFields.sortBy(_._2).map { f ⇒
            val name = f._1.getName

            f._4 match {
                case LONG ⇒
                    s"r.$name = DelimetedStringParser._long(${f._2}, line, indexes);"
                case INTEGER ⇒
                    s"r.$name = DelimetedStringParser._int(${f._2}, line, indexes);"
                case BIGDECIMAL ⇒
                    s"r.$name = DelimetedStringParser.bigDecimal(${f._2}, line, indexes);"
                case DATE_TIME ⇒
                    s"r.$name = DelimetedStringParser.date(${f._2}, line, indexes);"
                case STRING ⇒
                    s"r.$name = DelimetedStringParser.str(${f._2}, line, indexes);"
                case CSL_AFFINITYPARTICLES ⇒
                    s"r.$name = DelimetedStringParser.strBuilder(${f._2}, line, indexes);"
                case CSL_DICTS ⇒
                    s"r.$name = DelimetedStringParser.strBuilder(${f._2}, line, indexes);"
                case BOOLEAN ⇒
                    s"r.$name = DelimetedStringParser.bool(${f._2}, line, indexes);"
                case COMPOSEKEY ⇒
                    s"r.$name = DelimetedStringParser._long(${f._2}, line, indexes);"
                case ROOT ⇒
                    s"r.$name = (${f._1.getType.getName})${f._4.name()}.fromStr(DelimetedStringParser.str(${f._2}, line, indexes));"
                case PARTITION ⇒
                    s"r.$name = (${f._1.getType.getName})${f._4.name()}.fromStr(DelimetedStringParser.str(${f._2}, line, indexes));"
                case CSL_PARTICLES ⇒
                    s"r.$name = (${f._1.getType.getName})${f._4.name()}.fromStr(DelimetedStringParser.str(${f._2}, line, indexes));"
                case OBJ_TYPE ⇒
                    s"r.$name = (${f._1.getType.getName})${f._4.name()}.fromStr(DelimetedStringParser.str(${f._2}, line, indexes));"
            }
        }

        val fieldsComparators = tableInfo.valueFields.sortBy(_._2).map { f ⇒
            val name = f._1.getName

            val regularCompare = () ⇒ s"if (CompareUtils.compare(f.$name, s.$name) != 0) return CompareUtils.compare(f.$name, s.$name);"

            val strBuilderCompare = () ⇒ s"if (CompareUtils.compare(f.$name==null ? null : f.$name.toString(), s.$name==null ? null : s.$name.toString()) != 0) " +
                    s"return CompareUtils.compare(f.$name==null ? null : f.$name.toString(), s.$name==null ? null : s.$name.toString());"

            f._4 match {
                case LONG ⇒ regularCompare()
                case INTEGER ⇒ regularCompare()
                case BIGDECIMAL ⇒ regularCompare()
                case DATE_TIME ⇒ regularCompare()
                case STRING ⇒ regularCompare()
                case BOOLEAN ⇒ regularCompare()
                case COMPOSEKEY ⇒ regularCompare()
                case ROOT ⇒ regularCompare()
                case PARTITION ⇒ regularCompare()
                case CSL_PARTICLES ⇒ regularCompare()
                case OBJ_TYPE ⇒ regularCompare()
                case CSL_AFFINITYPARTICLES ⇒ strBuilderCompare()
                case CSL_DICTS ⇒ strBuilderCompare()
            }
        }

        new File(s"./src/main/java/ru/sbrf/gg/load/builder/").mkdirs()
        val file = new File(s"./src/main/java/ru/sbrf/gg/load/builder/$className.java")

        println(s"Writing $file")
        val output = new PrintWriter(file)

        output.println(
            s"""
              | package ru.sbrf.gg.load.builder;
              |
              | import ru.sbrf.gg.load.TableInfo;
              | import com.sbt.DelimetedStringParser;
              | import com.sbt.CompareUtils;
              | import ru.sbrf.gg.load.builder.ObjectBuilder;
              | import ${tableInfo.value.getName};
              |
              | import ${classOf[TransformType].getName}.*;
              |
              | public class $className implements ObjectBuilder {
              |     @Override public Object build(String line, TableInfo tableInfo) {
              |         ${tableInfo.value.getSimpleName} r = new ${tableInfo.value.getSimpleName}();
              |         int[] indexes = new int[]{0, 0, line.length()};
              |
              |         ${fieldsSetters.mkString("\n")}
              |
              |         return r;
              |     }
              |
              |     @Override public int compare(Object first, Object second) {
              |         ${tableInfo.value.getSimpleName} f = (${tableInfo.value.getSimpleName})first;
              |         ${tableInfo.value.getSimpleName} s = (${tableInfo.value.getSimpleName})second;
              |
              |         ${fieldsComparators.mkString("\n")}
              |
              |         return 0;
              |     }
              | }
            """.stripMargin)
        output.close()

        className
    }
}
