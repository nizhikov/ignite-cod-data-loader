
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedContractLinkBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedContractLink()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(4)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.contract_DPL_id = LONG.fromStr(line(6)).asInstanceOf[java.lang.Long]
r.relatedRole_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(8)).asInstanceOf[java.lang.Long]
r.сloseDate = DATE_TIME.fromStr(line(9)).asInstanceOf[java.util.Date]
r.endDate = DATE_TIME.fromStr(line(10)).asInstanceOf[java.util.Date]
r.partition_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
