package ru.sbrf.gg.load

import java.lang.reflect.Field

import ru.sbt.kmdtransform._

/**
  */
case class TableInfo(key: Class[_], value: Class[_], cacheName: String, fileMask: String) {
    var id: (Field, Int, String, TransformType) = _
    var partitionId: (Field, Int, String, TransformType) = _
    var rootId: (Field, Int, String, TransformType) = _

    var valueFields: Array[(Field, Int, String, TransformType)] = _

    {
        id = value.getFields.find(_.isAnnotationPresent(classOf[IdField])).map(fieldInfo).get
        partitionId  = value.getFields.find(_.isAnnotationPresent(classOf[PartField])).map(fieldInfo).get
        rootId  = value.getFields.find(_.isAnnotationPresent(classOf[RootField])).map(fieldInfo).get

        valueFields = value.getFields.filter(f ⇒ f.isAnnotationPresent(classOf[InitOrder])).map(fieldInfo)
    }

    def fieldInfo(f: Field): (Field, Int, String, TransformType) =
        (
            f,
            f.getAnnotation(classOf[InitOrder]).value().toInt - 1,
            if (f.isAnnotationPresent(classOf[Default])) f.getAnnotation(classOf[Default]).value() else null,
            f.getAnnotation(classOf[DataType]).value()
        )
}

case class FieldInfo(field: Field, order: Int, _type: TransformType, default: String = "") {
}
