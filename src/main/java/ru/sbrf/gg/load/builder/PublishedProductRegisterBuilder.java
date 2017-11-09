
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedProductRegister;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedProductRegisterBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedProductRegister r = new PublishedProductRegister();
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

     @Override public int compare(Object first, Object second) {
         PublishedProductRegister f = (PublishedProductRegister)first;
         PublishedProductRegister s = (PublishedProductRegister)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.type_DPL_id, s.type_DPL_id) != 0) return CompareUtils.compare(f.type_DPL_id, s.type_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.state_DPL_id, s.state_DPL_id) != 0) return CompareUtils.compare(f.state_DPL_id, s.state_DPL_id);
if (CompareUtils.compare(f.registerNumber, s.registerNumber) != 0) return CompareUtils.compare(f.registerNumber, s.registerNumber);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.assets_DPL_collectField==null ? null : f.assets_DPL_collectField.toString(), s.assets_DPL_collectField==null ? null : s.assets_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.assets_DPL_collectField==null ? null : f.assets_DPL_collectField.toString(), s.assets_DPL_collectField==null ? null : s.assets_DPL_collectField.toString());
if (CompareUtils.compare(f.measure_DPL_id, s.measure_DPL_id) != 0) return CompareUtils.compare(f.measure_DPL_id, s.measure_DPL_id);
if (CompareUtils.compare(f.curBalances_DPL_collectField==null ? null : f.curBalances_DPL_collectField.toString(), s.curBalances_DPL_collectField==null ? null : s.curBalances_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.curBalances_DPL_collectField==null ? null : f.curBalances_DPL_collectField.toString(), s.curBalances_DPL_collectField==null ? null : s.curBalances_DPL_collectField.toString());
if (CompareUtils.compare(f.avalBalances_DPL_collectField==null ? null : f.avalBalances_DPL_collectField.toString(), s.avalBalances_DPL_collectField==null ? null : s.avalBalances_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.avalBalances_DPL_collectField==null ? null : f.avalBalances_DPL_collectField.toString(), s.avalBalances_DPL_collectField==null ? null : s.avalBalances_DPL_collectField.toString());
if (CompareUtils.compare(f.registerRecs_DPL_collectField==null ? null : f.registerRecs_DPL_collectField.toString(), s.registerRecs_DPL_collectField==null ? null : s.registerRecs_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.registerRecs_DPL_collectField==null ? null : f.registerRecs_DPL_collectField.toString(), s.registerRecs_DPL_collectField==null ? null : s.registerRecs_DPL_collectField.toString());
if (CompareUtils.compare(f.curValue, s.curValue) != 0) return CompareUtils.compare(f.curValue, s.curValue);
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.parentRegister_DPL_id, s.parentRegister_DPL_id) != 0) return CompareUtils.compare(f.parentRegister_DPL_id, s.parentRegister_DPL_id);
if (CompareUtils.compare(f.subRegisters_DPL_collectField==null ? null : f.subRegisters_DPL_collectField.toString(), s.subRegisters_DPL_collectField==null ? null : s.subRegisters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.subRegisters_DPL_collectField==null ? null : f.subRegisters_DPL_collectField.toString(), s.subRegisters_DPL_collectField==null ? null : s.subRegisters_DPL_collectField.toString());
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.reason_DPL_id, s.reason_DPL_id) != 0) return CompareUtils.compare(f.reason_DPL_id, s.reason_DPL_id);
if (CompareUtils.compare(f.lastAvailRegBal_DPL_id, s.lastAvailRegBal_DPL_id) != 0) return CompareUtils.compare(f.lastAvailRegBal_DPL_id, s.lastAvailRegBal_DPL_id);
if (CompareUtils.compare(f.lastCurRegBal_DPL_id, s.lastCurRegBal_DPL_id) != 0) return CompareUtils.compare(f.lastCurRegBal_DPL_id, s.lastCurRegBal_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);
if (CompareUtils.compare(f.lastMoveNum, s.lastMoveNum) != 0) return CompareUtils.compare(f.lastMoveNum, s.lastMoveNum);

         return 0;
     }
 }
            
