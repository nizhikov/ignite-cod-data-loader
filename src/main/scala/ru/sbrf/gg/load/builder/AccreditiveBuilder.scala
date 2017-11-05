
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class AccreditiveBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.Accreditive()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.docInst_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.accreditivePayDocNo = STRING.fromStr(line(4)).asInstanceOf[java.lang.String]
r.accreditivePayDocDate = DATE_TIME.fromStr(line(5)).asInstanceOf[java.util.Date]
r.accreditivePayerAccount = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.accreditivePayeeAccount = STRING.fromStr(line(7)).asInstanceOf[java.lang.String]
r.accreditiveAccrSum = BIGDECIMAL.fromStr(line(8)).asInstanceOf[java.math.BigDecimal]
r.accreditivePlClosedate = DATE_TIME.fromStr(line(9)).asInstanceOf[java.util.Date]
r.accreditiveActClosedate = DATE_TIME.fromStr(line(10)).asInstanceOf[java.util.Date]
r.accreditiveDepositAccount = STRING.fromStr(line(11)).asInstanceOf[java.lang.String]
r.accreditiveOffBalAccount = STRING.fromStr(line(12)).asInstanceOf[java.lang.String]
r.accreditiveStatus = INTEGER.fromStr(line(13)).asInstanceOf[java.lang.Integer]
r.accreditiveLetterNo = STRING.fromStr(line(14)).asInstanceOf[java.lang.String]
r.accreditiveBranch = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.accreditiveOffice = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.accreditiveCreateDate = DATE_TIME.fromStr(line(17)).asInstanceOf[java.util.Date]
r.accreditiveReserveId = LONG.fromStr(line(18)).asInstanceOf[java.lang.Long]
r.accreditivePurpose = STRING.fromStr(line(19)).asInstanceOf[java.lang.String]
r.accreditivePaymentDoc = STRING.fromStr(line(20)).asInstanceOf[java.lang.String]
r.accreditivePaymentCond = STRING.fromStr(line(21)).asInstanceOf[java.lang.String]
r.accreditiveAddCond = STRING.fromStr(line(22)).asInstanceOf[java.lang.String]
r.accreditiveAccreditiveType = INTEGER.fromStr(line(23)).asInstanceOf[java.lang.Integer]
r.accreditivePayeeName = STRING.fromStr(line(24)).asInstanceOf[java.lang.String]
r.accreditivePayeeInn = STRING.fromStr(line(25)).asInstanceOf[java.lang.String]
r.accreditiveGarageAddress = STRING.fromStr(line(26)).asInstanceOf[java.lang.String]
r.accreditiveContractNumber = STRING.fromStr(line(27)).asInstanceOf[java.lang.String]
r.accreditiveContractDate = DATE_TIME.fromStr(line(28)).asInstanceOf[java.util.Date]
r.accreditivePayeeKpp = STRING.fromStr(line(29)).asInstanceOf[java.lang.String]
r.accreditiveProlongationDate = DATE_TIME.fromStr(line(30)).asInstanceOf[java.util.Date]
r.accreditiveCoverageType = INTEGER.fromStr(line(31)).asInstanceOf[java.lang.Integer]
r.accreditivePaymentDocNew = STRING.fromStr(line(32)).asInstanceOf[java.lang.String]
r.accreditiveIsActual = INTEGER.fromStr(line(33)).asInstanceOf[java.lang.Integer]
r.accreditiveChangeDate = DATE_TIME.fromStr(line(34)).asInstanceOf[java.util.Date]
r.category_DPL_id = LONG.fromStr(line(35)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(36)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
