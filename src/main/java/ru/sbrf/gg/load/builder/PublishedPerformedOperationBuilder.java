
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedPerformedOperation;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedPerformedOperationBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedPerformedOperation r = new PublishedPerformedOperation();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.code = DelimetedStringParser.str(6, line, indexes);
r.name = DelimetedStringParser.str(7, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(8, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(9, line, indexes);
r.service_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.client_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(12, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(13, line, indexes);
r.register_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.beginDate = DelimetedStringParser.date(15, line, indexes);
r.endDate = DelimetedStringParser.date(16, line, indexes);
r.division_DPL_id = DelimetedStringParser._long(17, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(18, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(19, line, indexes);
r.registerRec_DPL_collectField = DelimetedStringParser.strBuilder(20, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(21, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedPerformedOperation f = (PublishedPerformedOperation)first;
         PublishedPerformedOperation s = (PublishedPerformedOperation)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.type_DPL_id, s.type_DPL_id) != 0) return CompareUtils.compare(f.type_DPL_id, s.type_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString());
if (CompareUtils.compare(f.service_DPL_id, s.service_DPL_id) != 0) return CompareUtils.compare(f.service_DPL_id, s.service_DPL_id);
if (CompareUtils.compare(f.client_DPL_id, s.client_DPL_id) != 0) return CompareUtils.compare(f.client_DPL_id, s.client_DPL_id);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id) != 0) return CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id);
if (CompareUtils.compare(f.register_DPL_id, s.register_DPL_id) != 0) return CompareUtils.compare(f.register_DPL_id, s.register_DPL_id);
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.division_DPL_id, s.division_DPL_id) != 0) return CompareUtils.compare(f.division_DPL_id, s.division_DPL_id);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.registerRec_DPL_collectField==null ? null : f.registerRec_DPL_collectField.toString(), s.registerRec_DPL_collectField==null ? null : s.registerRec_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.registerRec_DPL_collectField==null ? null : f.registerRec_DPL_collectField.toString(), s.registerRec_DPL_collectField==null ? null : s.registerRec_DPL_collectField.toString());
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
