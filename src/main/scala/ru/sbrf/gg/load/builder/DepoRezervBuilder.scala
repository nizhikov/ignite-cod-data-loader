
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class DepoRezervBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.DepoRezerv()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.operationRun_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.deporezerv_branchno = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.deporezervClerk = LONG.fromStr(line(5)).asInstanceOf[java.lang.Long]
r.deporezervDayfact = DATE_TIME.fromStr(line(6)).asInstanceOf[java.util.Date]
r.deporezervDayrezerv = DATE_TIME.fromStr(line(7)).asInstanceOf[java.util.Date]
r.deporezerv_tb = LONG.fromStr(line(8)).asInstanceOf[java.lang.Long]
r.deporezervInitiator = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.deporezervJrnno = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.deporezerv_office = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.deporezervOpcashrezerv = BIGDECIMAL.fromStr(line(12)).asInstanceOf[java.math.BigDecimal]
r.deporezervRezervid = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.deporezervState = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
