
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedProductRegisterRecBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedProductRegisterRec()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(4)).asInstanceOf[java.lang.String]
r.name = STRING.fromStr(line(5)).asInstanceOf[java.lang.String]
r.register_DPL_id = LONG.fromStr(line(6)).asInstanceOf[java.lang.Long]
r.operation_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.date = DATE_TIME.fromStr(line(8)).asInstanceOf[java.util.Date]
r.restIn = BIGDECIMAL.fromStr(line(9)).asInstanceOf[java.math.BigDecimal]
r.restOut = BIGDECIMAL.fromStr(line(10)).asInstanceOf[java.math.BigDecimal]
r.turnIn = BIGDECIMAL.fromStr(line(11)).asInstanceOf[java.math.BigDecimal]
r.turnOut = BIGDECIMAL.fromStr(line(12)).asInstanceOf[java.math.BigDecimal]
r.category_DPL_id = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.type_DPL_id = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.curBalance = BIGDECIMAL.fromStr(line(15)).asInstanceOf[java.math.BigDecimal]
r.availBalance = BIGDECIMAL.fromStr(line(16)).asInstanceOf[java.math.BigDecimal]
r.amount = BIGDECIMAL.fromStr(line(17)).asInstanceOf[java.math.BigDecimal]
r.partition_DPL_id = LONG.fromStr(line(18)).asInstanceOf[java.lang.Long]
r.num = LONG.fromStr(line(19)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
