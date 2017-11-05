package ru.sbrf.gg.load.builder

import java.lang.reflect.Field

import ru.sbrf.gg.load.TableInfo
import ru.sbt.kmdtransform.TransformType

/**
  */
class ReflectionBuilder extends ObjectBuilder {
    def build(line: Array[String], tableInfo: TableInfo): Any = {
        val result = tableInfo.value.newInstance

        tableInfo.valueFields.foreach { f ⇒ f._1.set(result, fieldValue(line, f)) }

        result
    }

    def fieldValue(line: Array[String], field: (Field, Int, String, TransformType)): Any = {
        var fieldValueStr = line(field._2)

        if (fieldValueStr == null || fieldValueStr == "")
            fieldValueStr = field._3

        field._4.fromStr(fieldValueStr)
    }
}
