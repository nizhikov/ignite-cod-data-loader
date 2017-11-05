
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class CardServiceDebtBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.CardServiceDebt()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.operation_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.cardservicedebtDay = DATE_TIME.fromStr(line(4)).asInstanceOf[java.util.Date]
r.cardservicedebtTxkind = LONG.fromStr(line(5)).asInstanceOf[java.lang.Long]
r.cardservicedebtDebtcash = BIGDECIMAL.fromStr(line(6)).asInstanceOf[java.math.BigDecimal]
r.cardservicedebtPaycash = BIGDECIMAL.fromStr(line(7)).asInstanceOf[java.math.BigDecimal]
r.cardservicedebtCancelcash = BIGDECIMAL.fromStr(line(8)).asInstanceOf[java.math.BigDecimal]
r.cardservicedebtReturncash = BIGDECIMAL.fromStr(line(9)).asInstanceOf[java.math.BigDecimal]
r.category_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
