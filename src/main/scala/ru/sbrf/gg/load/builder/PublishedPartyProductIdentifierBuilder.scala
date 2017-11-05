
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedPartyProductIdentifierBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedPartyProductIdentifier()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.product_DPL_id = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.identifierType = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.code = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(7)).asInstanceOf[java.lang.String]
r.beginDate = DATE_TIME.fromStr(line(8)).asInstanceOf[java.util.Date]
r.value = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.category_DPL_id = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
