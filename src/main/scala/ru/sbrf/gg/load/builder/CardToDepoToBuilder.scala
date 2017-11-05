
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class CardToDepoToBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.CardToDepoTo()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.productParty_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.prcntBranchno = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.prcntCardto = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.prcntClerk = LONG.fromStr(line(6)).asInstanceOf[java.lang.Long]
r.prcntDay = DATE_TIME.fromStr(line(7)).asInstanceOf[java.util.Date]
r.prcntDepoto = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.prcntTb = LONG.fromStr(line(9)).asInstanceOf[java.lang.Long]
r.prcntJrnno = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.prcntOffice = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.prcntState = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
