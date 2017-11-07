
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedProductRegisterRecBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedProductRegisterRec r = new com.sbt.cdm.api.model.published.instance.PublishedProductRegisterRec();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.code = DelimetedStringParser.str(4, line, indexes);
r.name = DelimetedStringParser.str(5, line, indexes);
r.register_DPL_id = DelimetedStringParser._long(6, line, indexes);
r.operation_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.date = DelimetedStringParser.date(8, line, indexes);
r.restIn = DelimetedStringParser.bigDecimal(9, line, indexes);
r.restOut = DelimetedStringParser.bigDecimal(10, line, indexes);
r.turnIn = DelimetedStringParser.bigDecimal(11, line, indexes);
r.turnOut = DelimetedStringParser.bigDecimal(12, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(13, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.curBalance = DelimetedStringParser.bigDecimal(15, line, indexes);
r.availBalance = DelimetedStringParser.bigDecimal(16, line, indexes);
r.amount = DelimetedStringParser.bigDecimal(17, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(18, line, indexes);
r.num = DelimetedStringParser._long(19, line, indexes);

         return r;
     }
 }
            
