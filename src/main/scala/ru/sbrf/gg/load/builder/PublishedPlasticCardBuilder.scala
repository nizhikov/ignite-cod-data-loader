
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedPlasticCardBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedPlasticCard()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.product_DPL_id = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.accessToolType_DPL_id = LONG.fromStr(line(5)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(7)).asInstanceOf[java.lang.String]
r.dateRelease = DATE_TIME.fromStr(line(8)).asInstanceOf[java.util.Date]
r.beginDate = DATE_TIME.fromStr(line(9)).asInstanceOf[java.util.Date]
r.endDate = DATE_TIME.fromStr(line(10)).asInstanceOf[java.util.Date]
r.status_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.states_DPL_collectField = CSL_DICTS.fromStr(line(12)).asInstanceOf[java.lang.StringBuilder]
r.numberMask = STRING.fromStr(line(13)).asInstanceOf[java.lang.String]
r.plasticCardType_DPL_id = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.wAYProd_DPL_id = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.ipsCode = STRING.fromStr(line(16)).asInstanceOf[java.lang.String]
r.iPSParty_DPL_id = LONG.fromStr(line(17)).asInstanceOf[java.lang.Long]
r.marketPlace_DPL_id = LONG.fromStr(line(18)).asInstanceOf[java.lang.Long]
r.chipApplication_DPL_id = LONG.fromStr(line(19)).asInstanceOf[java.lang.Long]
r.embossName = STRING.fromStr(line(20)).asInstanceOf[java.lang.String]
r.cardOwner_DPL_id = LONG.fromStr(line(21)).asInstanceOf[java.lang.Long]
r.parameters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(24)).asInstanceOf[java.lang.StringBuilder]
r.category_DPL_id = LONG.fromStr(line(25)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(26)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
