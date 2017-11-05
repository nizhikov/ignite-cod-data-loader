
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedDocumentBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedDocument()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.type_DPL_id = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.client_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.docNum = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.createDate = DATE_TIME.fromStr(line(9)).asInstanceOf[java.util.Date]
r.receiveDate = DATE_TIME.fromStr(line(10)).asInstanceOf[java.util.Date]
r.parameters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(11)).asInstanceOf[java.lang.StringBuilder]
r.issuing = STRING.fromStr(line(12)).asInstanceOf[java.lang.String]
r.docScan = STRING.fromStr(line(13)).asInstanceOf[java.lang.String]
r.docForm_DPL_id = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.status_DPL_id = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(17)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
