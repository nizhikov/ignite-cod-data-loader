
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedProductRegisterBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedProductRegister()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.type_DPL_id = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.status_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.state_DPL_id = LONG.fromStr(line(8)).asInstanceOf[java.lang.Long]
r.registerNumber = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.product_DPL_id = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.assets_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(11)).asInstanceOf[java.lang.StringBuilder]
r.measure_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]
r.curBalances_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(14)).asInstanceOf[java.lang.StringBuilder]
r.avalBalances_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(14)).asInstanceOf[java.lang.StringBuilder]
r.registerRecs_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(14)).asInstanceOf[java.lang.StringBuilder]
r.curValue = BIGDECIMAL.fromStr(line(16)).asInstanceOf[java.math.BigDecimal]
r.beginDate = DATE_TIME.fromStr(line(17)).asInstanceOf[java.util.Date]
r.endDate = DATE_TIME.fromStr(line(18)).asInstanceOf[java.util.Date]
r.parentRegister_DPL_id = LONG.fromStr(line(19)).asInstanceOf[java.lang.Long]
r.subRegisters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(20)).asInstanceOf[java.lang.StringBuilder]
r.parameters_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(21)).asInstanceOf[java.lang.StringBuilder]
r.category_DPL_id = LONG.fromStr(line(22)).asInstanceOf[java.lang.Long]
r.reason_DPL_id = LONG.fromStr(line(23)).asInstanceOf[java.lang.Long]
r.lastAvailRegBal_DPL_id = LONG.fromStr(line(24)).asInstanceOf[java.lang.Long]
r.lastCurRegBal_DPL_id = LONG.fromStr(line(25)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(27)).asInstanceOf[java.lang.Long]
r.lastMoveNum = LONG.fromStr(line(28)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
