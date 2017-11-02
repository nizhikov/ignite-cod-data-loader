package ru.sbrf.gg.load

import java.lang.reflect.Field

import ru.sbt.kmdtransform.TransformType

/**
  */
case class TableInfo(key: Class[_], value: Class[_], cacheName: String, fileMask: String) {
}

case class FieldInfo(field: Field, order: Int, _type: TransformType, default: String = "") {
}
