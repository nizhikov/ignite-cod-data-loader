
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedContractBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedContract()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.owner_DPL_id = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.products_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(5)).asInstanceOf[java.lang.StringBuilder]
r.number = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.type_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.status_DPL_id = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.signatories_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(12)).asInstanceOf[java.lang.StringBuilder]
r.lawConditions_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(13)).asInstanceOf[java.lang.StringBuilder]
r.printForm_DPL_id = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.addContracts_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(15)).asInstanceOf[java.lang.StringBuilder]
r.beginDate = DATE_TIME.fromStr(line(16)).asInstanceOf[java.util.Date]
r.endDate = DATE_TIME.fromStr(line(17)).asInstanceOf[java.util.Date]
r.closeDate = DATE_TIME.fromStr(line(18)).asInstanceOf[java.util.Date]
r.actualOperation_DPL_id = LONG.fromStr(line(19)).asInstanceOf[java.lang.Long]
r.relatedContracts_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(20)).asInstanceOf[java.lang.StringBuilder]
r.parameters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(21)).asInstanceOf[java.lang.StringBuilder]
r.category_DPL_id = LONG.fromStr(line(22)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(24)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
