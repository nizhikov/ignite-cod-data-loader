
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PinPKBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.PinPK()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.operationRun_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.pinpkAuthDay = DATE_TIME.fromStr(line(4)).asInstanceOf[java.util.Date]
r.pinpkAuthcode = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.pinpkCardno = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.pinpkClientFio = STRING.fromStr(line(7)).asInstanceOf[java.lang.String]
r.pinpkExpDate = DATE_TIME.fromStr(line(8)).asInstanceOf[java.util.Date]
r.pinpkTb = LONG.fromStr(line(9)).asInstanceOf[java.lang.Long]
r.pinpkOpday = DATE_TIME.fromStr(line(10)).asInstanceOf[java.util.Date]
r.pinpkOpno = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.pinpkPaymasterClerk = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]
r.pinpkPaymasterDay = DATE_TIME.fromStr(line(13)).asInstanceOf[java.util.Date]
r.pinpkPaymasterFio = STRING.fromStr(line(14)).asInstanceOf[java.lang.String]
r.pinpkValidClerk = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.pinpkValidDay = DATE_TIME.fromStr(line(16)).asInstanceOf[java.util.Date]
r.pinpkValidFio = STRING.fromStr(line(17)).asInstanceOf[java.lang.String]
r.pinpkDcard = STRING.fromStr(line(18)).asInstanceOf[java.lang.String]
r.pinpk_deposit = COMPOSEKEY.fromStr(line(19)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(20)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(21)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
