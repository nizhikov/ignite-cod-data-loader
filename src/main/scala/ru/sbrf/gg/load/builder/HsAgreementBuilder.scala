
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class HsAgreementBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.HsAgreement()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.docInst_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.agreementSum = BIGDECIMAL.fromStr(line(4)).asInstanceOf[java.math.BigDecimal]
r.area = BIGDECIMAL.fromStr(line(5)).asInstanceOf[java.math.BigDecimal]
r.certificateBy = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.certificateDate = DATE_TIME.fromStr(line(7)).asInstanceOf[java.util.Date]
r.certificateNo = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.town = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.category_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
