
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedProductRegisterBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedProductRegister r = new com.sbt.cdm.api.model.published.instance.PublishedProductRegister();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.code = DelimetedStringParser.str(5, line, indexes);
r.name = DelimetedStringParser.str(6, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.state_DPL_id = DelimetedStringParser._long(8, line, indexes);
r.registerNumber = DelimetedStringParser.str(9, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.assets_DPL_collectField = DelimetedStringParser.strBuilder(11, line, indexes);
r.measure_DPL_id = DelimetedStringParser._long(12, line, indexes);
r.curBalances_DPL_collectField = DelimetedStringParser.strBuilder(14, line, indexes);
r.avalBalances_DPL_collectField = DelimetedStringParser.strBuilder(14, line, indexes);
r.registerRecs_DPL_collectField = DelimetedStringParser.strBuilder(14, line, indexes);
r.curValue = DelimetedStringParser.bigDecimal(16, line, indexes);
r.beginDate = DelimetedStringParser.date(17, line, indexes);
r.endDate = DelimetedStringParser.date(18, line, indexes);
r.parentRegister_DPL_id = DelimetedStringParser._long(19, line, indexes);
r.subRegisters_DPL_collectField = DelimetedStringParser.strBuilder(20, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(21, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(22, line, indexes);
r.reason_DPL_id = DelimetedStringParser._long(23, line, indexes);
r.lastAvailRegBal_DPL_id = DelimetedStringParser._long(24, line, indexes);
r.lastCurRegBal_DPL_id = DelimetedStringParser._long(25, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(27, line, indexes);
r.lastMoveNum = DelimetedStringParser._long(28, line, indexes);

         return r;
     }
 }
            
