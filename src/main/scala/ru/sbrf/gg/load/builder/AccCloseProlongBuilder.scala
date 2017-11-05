
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class AccCloseProlongBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.AccCloseProlong()

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
r.prcntClerkFio = STRING.fromStr(line(12)).asInstanceOf[java.lang.String]
r.category_DPL_id = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.prcntIsactual = INTEGER.fromStr(line(14)).asInstanceOf[java.lang.Integer]
r.prcntTbChange = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.prcntBranchnoChange = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.prcntOfficeChange = LONG.fromStr(line(17)).asInstanceOf[java.lang.Long]
r.prcntDayChange = DATE_TIME.fromStr(line(18)).asInstanceOf[java.util.Date]
r.partition_DPL_id = LONG.fromStr(line(19)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
