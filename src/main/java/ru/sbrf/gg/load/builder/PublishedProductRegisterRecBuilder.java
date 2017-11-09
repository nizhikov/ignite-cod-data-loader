
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedProductRegisterRec;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedProductRegisterRecBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedProductRegisterRec r = new PublishedProductRegisterRec();
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

     @Override public int compare(Object first, Object second) {
         PublishedProductRegisterRec f = (PublishedProductRegisterRec)first;
         PublishedProductRegisterRec s = (PublishedProductRegisterRec)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.register_DPL_id, s.register_DPL_id) != 0) return CompareUtils.compare(f.register_DPL_id, s.register_DPL_id);
if (CompareUtils.compare(f.operation_DPL_id, s.operation_DPL_id) != 0) return CompareUtils.compare(f.operation_DPL_id, s.operation_DPL_id);
if (CompareUtils.compare(f.date, s.date) != 0) return CompareUtils.compare(f.date, s.date);
if (CompareUtils.compare(f.restIn, s.restIn) != 0) return CompareUtils.compare(f.restIn, s.restIn);
if (CompareUtils.compare(f.restOut, s.restOut) != 0) return CompareUtils.compare(f.restOut, s.restOut);
if (CompareUtils.compare(f.turnIn, s.turnIn) != 0) return CompareUtils.compare(f.turnIn, s.turnIn);
if (CompareUtils.compare(f.turnOut, s.turnOut) != 0) return CompareUtils.compare(f.turnOut, s.turnOut);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.type_DPL_id, s.type_DPL_id) != 0) return CompareUtils.compare(f.type_DPL_id, s.type_DPL_id);
if (CompareUtils.compare(f.curBalance, s.curBalance) != 0) return CompareUtils.compare(f.curBalance, s.curBalance);
if (CompareUtils.compare(f.availBalance, s.availBalance) != 0) return CompareUtils.compare(f.availBalance, s.availBalance);
if (CompareUtils.compare(f.amount, s.amount) != 0) return CompareUtils.compare(f.amount, s.amount);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);
if (CompareUtils.compare(f.num, s.num) != 0) return CompareUtils.compare(f.num, s.num);

         return 0;
     }
 }
            
