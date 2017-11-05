
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class HistSBookNoBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.HistSBookNo()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.operationRun_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.sbookBalance = BIGDECIMAL.fromStr(line(4)).asInstanceOf[java.math.BigDecimal]
r.sbook_branchno = LONG.fromStr(line(5)).asInstanceOf[java.lang.Long]
r.sbookCancelClerk = LONG.fromStr(line(6)).asInstanceOf[java.lang.Long]
r.sbookCancelDate = DATE_TIME.fromStr(line(7)).asInstanceOf[java.util.Date]
r.sbookCancelFirstnameClerk = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.sbookCancelSecondnameClerk = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.sbookCancelSurnameClerk = STRING.fromStr(line(10)).asInstanceOf[java.lang.String]
r.sbookDateClose = DATE_TIME.fromStr(line(11)).asInstanceOf[java.util.Date]
r.sbookDeclarationBranchno = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]
r.sbookDeclarationClerk = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.sbookDeclarationDateLost = DATE_TIME.fromStr(line(14)).asInstanceOf[java.util.Date]
r.sbookDeclarationFirstname = STRING.fromStr(line(15)).asInstanceOf[java.lang.String]
r.sbookDeclarationKind = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.sbookDeclarationNo = STRING.fromStr(line(17)).asInstanceOf[java.lang.String]
r.sbookDeclarationOffice = LONG.fromStr(line(18)).asInstanceOf[java.lang.Long]
r.sbookDeclarationSecondname = STRING.fromStr(line(19)).asInstanceOf[java.lang.String]
r.sbookDeclarationSurname = STRING.fromStr(line(20)).asInstanceOf[java.lang.String]
r.sbookDeclarationValid = LONG.fromStr(line(21)).asInstanceOf[java.lang.Long]
r.sbookDocumentkind = LONG.fromStr(line(22)).asInstanceOf[java.lang.Long]
r.sbookDubleClerk = LONG.fromStr(line(23)).asInstanceOf[java.lang.Long]
r.sbookDubleDate = DATE_TIME.fromStr(line(24)).asInstanceOf[java.util.Date]
r.sbookDubleFirstnameClerk = STRING.fromStr(line(25)).asInstanceOf[java.lang.String]
r.sbookDubleSecondnameClerk = STRING.fromStr(line(26)).asInstanceOf[java.lang.String]
r.sbookDubleSurnameClerk = STRING.fromStr(line(27)).asInstanceOf[java.lang.String]
r.sbookKind = LONG.fromStr(line(28)).asInstanceOf[java.lang.Long]
r.sbookNo = STRING.fromStr(line(29)).asInstanceOf[java.lang.String]
r.sbookPrintableno = STRING.fromStr(line(30)).asInstanceOf[java.lang.String]
r.sbookPrintablenoNew = STRING.fromStr(line(31)).asInstanceOf[java.lang.String]
r.sbookSbookno = STRING.fromStr(line(32)).asInstanceOf[java.lang.String]
r.sbookSbooknoDuble = STRING.fromStr(line(33)).asInstanceOf[java.lang.String]
r.sbookSeries = STRING.fromStr(line(34)).asInstanceOf[java.lang.String]
r.category_DPL_id = LONG.fromStr(line(35)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(36)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
