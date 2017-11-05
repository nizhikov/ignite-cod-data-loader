
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class HsCertificateBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.HsCertificate()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.docInst_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.addnumber = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.area = BIGDECIMAL.fromStr(line(5)).asInstanceOf[java.math.BigDecimal]
r.authority = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.bankaccount = STRING.fromStr(line(7)).asInstanceOf[java.lang.String]
r.bankbic = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.bankname = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.docdate = DATE_TIME.fromStr(line(10)).asInstanceOf[java.util.Date]
r.docnumber = STRING.fromStr(line(11)).asInstanceOf[java.lang.String]
r.docoriginator = STRING.fromStr(line(12)).asInstanceOf[java.lang.String]
r.execdate = DATE_TIME.fromStr(line(13)).asInstanceOf[java.util.Date]
r.execorder = STRING.fromStr(line(14)).asInstanceOf[java.lang.String]
r.f190number = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.office = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.fnumber = LONG.fromStr(line(17)).asInstanceOf[java.lang.Long]
r.tb = LONG.fromStr(line(18)).asInstanceOf[java.lang.Long]
r.isChecked = LONG.fromStr(line(19)).asInstanceOf[java.lang.Long]
r.hscertificateKbk = STRING.fromStr(line(20)).asInstanceOf[java.lang.String]
r.kpp = STRING.fromStr(line(21)).asInstanceOf[java.lang.String]
r.hscertificateOktmo = STRING.fromStr(line(22)).asInstanceOf[java.lang.String]
r.branchno = LONG.fromStr(line(23)).asInstanceOf[java.lang.Long]
r.paymentSum = BIGDECIMAL.fromStr(line(24)).asInstanceOf[java.math.BigDecimal]
r.purpose = STRING.fromStr(line(25)).asInstanceOf[java.lang.String]
r.recAccount = STRING.fromStr(line(26)).asInstanceOf[java.lang.String]
r.recInn = STRING.fromStr(line(27)).asInstanceOf[java.lang.String]
r.recName = STRING.fromStr(line(28)).asInstanceOf[java.lang.String]
r.recType = LONG.fromStr(line(29)).asInstanceOf[java.lang.Long]
r.ssCode = LONG.fromStr(line(30)).asInstanceOf[java.lang.Long]
r.state = LONG.fromStr(line(31)).asInstanceOf[java.lang.Long]
r.town = STRING.fromStr(line(32)).asInstanceOf[java.lang.String]
r.hscertificateYip = STRING.fromStr(line(33)).asInstanceOf[java.lang.String]
r.hsAgreement_DPL_id = LONG.fromStr(line(34)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(36)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(37)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
