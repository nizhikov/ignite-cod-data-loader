
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class MbvEventsBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.MbvEvents()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.operationRun_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.mbveventsBalance = BIGDECIMAL.fromStr(line(4)).asInstanceOf[java.math.BigDecimal]
r.mbveventsBirthdayNew = DATE_TIME.fromStr(line(5)).asInstanceOf[java.util.Date]
r.mbveventsBirthdayOld = DATE_TIME.fromStr(line(6)).asInstanceOf[java.util.Date]
r.mbvevents_branchno = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.mbveventsCreatetime = DATE_TIME.fromStr(line(8)).asInstanceOf[java.util.Date]
r.mbveventsCurrency = LONG.fromStr(line(9)).asInstanceOf[java.lang.Long]
r.mbveventsDbranchno = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.mbveventsDoffice = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.mbveventsExceedsum = BIGDECIMAL.fromStr(line(12)).asInstanceOf[java.math.BigDecimal]
r.mbveventsExternalkind = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.mbveventsFnumber = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.mbveventsHiststate = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.mbveventsIdocAccH2Major = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.mbveventsIdocAccH2Minor = LONG.fromStr(line(17)).asInstanceOf[java.lang.Long]
r.mbveventsIsarrested = LONG.fromStr(line(18)).asInstanceOf[java.lang.Long]
r.mbveventsIsbankservcomm = LONG.fromStr(line(19)).asInstanceOf[java.lang.Long]
r.mbveventsIsdulchanged = LONG.fromStr(line(20)).asInstanceOf[java.lang.Long]
r.mbveventsIsf190 = LONG.fromStr(line(21)).asInstanceOf[java.lang.Long]
r.mbveventsIsinterestchanged = LONG.fromStr(line(22)).asInstanceOf[java.lang.Long]
r.mbveventsIsopened = LONG.fromStr(line(23)).asInstanceOf[java.lang.Long]
r.mbveventsIspermchanged = LONG.fromStr(line(24)).asInstanceOf[java.lang.Long]
r.mbveventsIssvbookdupl = LONG.fromStr(line(25)).asInstanceOf[java.lang.Long]
r.mbveventsIsterminated = LONG.fromStr(line(26)).asInstanceOf[java.lang.Long]
r.mbveventsIsthirdpartytype = LONG.fromStr(line(27)).asInstanceOf[java.lang.Long]
r.mbveventsIsudbochanged = LONG.fromStr(line(28)).asInstanceOf[java.lang.Long]
r.mbveventsJrnno = LONG.fromStr(line(29)).asInstanceOf[java.lang.Long]
r.mbvevents_office = LONG.fromStr(line(30)).asInstanceOf[java.lang.Long]
r.mbveventsOldprcntrate = BIGDECIMAL.fromStr(line(31)).asInstanceOf[java.math.BigDecimal]
r.mbveventsOpcash = BIGDECIMAL.fromStr(line(32)).asInstanceOf[java.math.BigDecimal]
r.mbveventsOpno = LONG.fromStr(line(33)).asInstanceOf[java.lang.Long]
r.mbveventsPersonNew = LONG.fromStr(line(34)).asInstanceOf[java.lang.Long]
r.mbveventsPersonOld = LONG.fromStr(line(35)).asInstanceOf[java.lang.Long]
r.mbveventsPrcntrate = BIGDECIMAL.fromStr(line(36)).asInstanceOf[java.math.BigDecimal]
r.mbveventsQcno = LONG.fromStr(line(37)).asInstanceOf[java.lang.Long]
r.mbveventsSscode = LONG.fromStr(line(38)).asInstanceOf[java.lang.Long]
r.mbveventsState = LONG.fromStr(line(39)).asInstanceOf[java.lang.Long]
r.mbveventsTransday = DATE_TIME.fromStr(line(40)).asInstanceOf[java.util.Date]
r.mbveventsTurncode = LONG.fromStr(line(41)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(42)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(43)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
