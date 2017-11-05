
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedPerformedServiceBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedPerformedService()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.type_DPL_id = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.owner_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.parties_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(8)).asInstanceOf[java.lang.StringBuilder]
r.product_DPL_id = LONG.fromStr(line(9)).asInstanceOf[java.lang.Long]
r.subProcess_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.custService_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]
r.performedOperations_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(13)).asInstanceOf[java.lang.StringBuilder]
r.serviceRegisters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(14)).asInstanceOf[java.lang.StringBuilder]
r.beginDate = DATE_TIME.fromStr(line(15)).asInstanceOf[java.util.Date]
r.endDate = DATE_TIME.fromStr(line(16)).asInstanceOf[java.util.Date]
r.createdRequests_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(17)).asInstanceOf[java.lang.StringBuilder]
r.documents_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(18)).asInstanceOf[java.lang.StringBuilder]
r.serviceAccessTools_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(19)).asInstanceOf[java.lang.StringBuilder]
r.status_DPL_id = LONG.fromStr(line(20)).asInstanceOf[java.lang.Long]
r.states_DPL_collectField = CSL_DICTS.fromStr(line(21)).asInstanceOf[java.lang.StringBuilder]
r.transactionTags = STRING.fromStr(line(22)).asInstanceOf[java.lang.String]
r.parameters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(25)).asInstanceOf[java.lang.StringBuilder]
r.category_DPL_id = LONG.fromStr(line(26)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(27)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
