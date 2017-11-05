
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedProductPartyBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedProductParty()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.templObjId = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.description_DPL_id = LONG.fromStr(line(5)).asInstanceOf[java.lang.Long]
r.owner_DPL_id = LONG.fromStr(line(6)).asInstanceOf[java.lang.Long]
r.type_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.status_DPL_id = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.states_DPL_collectField = CSL_DICTS.fromStr(line(11)).asInstanceOf[java.lang.StringBuilder]
r.contract_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]
r.registers_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(13)).asInstanceOf[java.lang.StringBuilder]
r.custServices_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(14)).asInstanceOf[java.lang.StringBuilder]
r.planServices_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(15)).asInstanceOf[java.lang.StringBuilder]
r.performedServices_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(16)).asInstanceOf[java.lang.StringBuilder]
r.performedOperations_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(17)).asInstanceOf[java.lang.StringBuilder]
r.accessTools_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(18)).asInstanceOf[java.lang.StringBuilder]
r.searchIdentifier_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(19)).asInstanceOf[java.lang.StringBuilder]
r.indicators_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(20)).asInstanceOf[java.lang.StringBuilder]
r.tariffList_DPL_id = LONG.fromStr(line(21)).asInstanceOf[java.lang.Long]
r.beginDate = DATE_TIME.fromStr(line(22)).asInstanceOf[java.util.Date]
r.endDate = DATE_TIME.fromStr(line(23)).asInstanceOf[java.util.Date]
r.endFactDate = DATE_TIME.fromStr(line(24)).asInstanceOf[java.util.Date]
r.productPartyRoles_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(25)).asInstanceOf[java.lang.StringBuilder]
r.relatedProducts_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(26)).asInstanceOf[java.lang.StringBuilder]
r.comment = STRING.fromStr(line(27)).asInstanceOf[java.lang.String]
r.assets_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(28)).asInstanceOf[java.lang.StringBuilder]
r.division_DPL_id = LONG.fromStr(line(29)).asInstanceOf[java.lang.Long]
r.version_DPL_id = LONG.fromStr(line(30)).asInstanceOf[java.lang.Long]
r.parameters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(31)).asInstanceOf[java.lang.StringBuilder]
r.category_DPL_id = LONG.fromStr(line(32)).asInstanceOf[java.lang.Long]
r.reason_DPL_id = LONG.fromStr(line(33)).asInstanceOf[java.lang.Long]
r.documents_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(34)).asInstanceOf[java.lang.StringBuilder]
r.partition_DPL_id = LONG.fromStr(line(35)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
