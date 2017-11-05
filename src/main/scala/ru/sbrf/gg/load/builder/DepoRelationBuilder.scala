
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class DepoRelationBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.DepoRelation()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.operationRun_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.deporelation_branchno = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.deporelationDateChange = DATE_TIME.fromStr(line(5)).asInstanceOf[java.util.Date]
r.deporelationFio = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.deporelationFlagKred = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.deporelation_tb = LONG.fromStr(line(8)).asInstanceOf[java.lang.Long]
r.deporelation_office = LONG.fromStr(line(9)).asInstanceOf[java.lang.Long]
r.deporelationTypeRec = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
