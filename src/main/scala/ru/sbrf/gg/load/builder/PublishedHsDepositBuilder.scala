
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedHsDepositBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.extension.PublishedHsDeposit()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.contract_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.agrSeries = STRING.fromStr(line(4)).asInstanceOf[java.lang.String]
r.agreements = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.authority = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.hsdeposit_tb = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.otherAccount = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.procCount = LONG.fromStr(line(9)).asInstanceOf[java.lang.Long]
r.state = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.subsidyAmount = BIGDECIMAL.fromStr(line(11)).asInstanceOf[java.math.BigDecimal]
r.subsidyAmountUsd = BIGDECIMAL.fromStr(line(12)).asInstanceOf[java.math.BigDecimal]
r.`type` = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.otherAccountBranch = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.otherAccountOffice = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.product_DPL_id = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(17)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(18)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
