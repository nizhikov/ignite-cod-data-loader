
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class OperDepoBuildBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.OperDepoBuild()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.operation_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.costObj = BIGDECIMAL.fromStr(line(4)).asInstanceOf[java.math.BigDecimal]
r.idObj = LONG.fromStr(line(6)).asInstanceOf[java.lang.Long]
r.isActual = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.numberArea = LONG.fromStr(line(8)).asInstanceOf[java.lang.Long]
r.numberPact = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.period = DATE_TIME.fromStr(line(10)).asInstanceOf[java.util.Date]
r.category_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
