
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedPerformedService;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedPerformedServiceBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedPerformedService r = new PublishedPerformedService();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.code = DelimetedStringParser.str(5, line, indexes);
r.name = DelimetedStringParser.str(6, line, indexes);
r.owner_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.parties_DPL_collectField = DelimetedStringParser.strBuilder(8, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(9, line, indexes);
r.subProcess_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.custService_DPL_id = DelimetedStringParser._long(12, line, indexes);
r.performedOperations_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.serviceRegisters_DPL_collectField = DelimetedStringParser.strBuilder(14, line, indexes);
r.beginDate = DelimetedStringParser.date(15, line, indexes);
r.endDate = DelimetedStringParser.date(16, line, indexes);
r.createdRequests_DPL_collectField = DelimetedStringParser.strBuilder(17, line, indexes);
r.documents_DPL_collectField = DelimetedStringParser.strBuilder(18, line, indexes);
r.serviceAccessTools_DPL_collectField = DelimetedStringParser.strBuilder(19, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(20, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(21, line, indexes);
r.transactionTags = DelimetedStringParser.str(22, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(25, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(26, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(27, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedPerformedService f = (PublishedPerformedService)first;
         PublishedPerformedService s = (PublishedPerformedService)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.type_DPL_id, s.type_DPL_id) != 0) return CompareUtils.compare(f.type_DPL_id, s.type_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.owner_DPL_id, s.owner_DPL_id) != 0) return CompareUtils.compare(f.owner_DPL_id, s.owner_DPL_id);
if (CompareUtils.compare(f.parties_DPL_collectField==null ? null : f.parties_DPL_collectField.toString(), s.parties_DPL_collectField==null ? null : s.parties_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parties_DPL_collectField==null ? null : f.parties_DPL_collectField.toString(), s.parties_DPL_collectField==null ? null : s.parties_DPL_collectField.toString());
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.subProcess_DPL_id, s.subProcess_DPL_id) != 0) return CompareUtils.compare(f.subProcess_DPL_id, s.subProcess_DPL_id);
if (CompareUtils.compare(f.custService_DPL_id, s.custService_DPL_id) != 0) return CompareUtils.compare(f.custService_DPL_id, s.custService_DPL_id);
if (CompareUtils.compare(f.performedOperations_DPL_collectField==null ? null : f.performedOperations_DPL_collectField.toString(), s.performedOperations_DPL_collectField==null ? null : s.performedOperations_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.performedOperations_DPL_collectField==null ? null : f.performedOperations_DPL_collectField.toString(), s.performedOperations_DPL_collectField==null ? null : s.performedOperations_DPL_collectField.toString());
if (CompareUtils.compare(f.serviceRegisters_DPL_collectField==null ? null : f.serviceRegisters_DPL_collectField.toString(), s.serviceRegisters_DPL_collectField==null ? null : s.serviceRegisters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.serviceRegisters_DPL_collectField==null ? null : f.serviceRegisters_DPL_collectField.toString(), s.serviceRegisters_DPL_collectField==null ? null : s.serviceRegisters_DPL_collectField.toString());
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.createdRequests_DPL_collectField==null ? null : f.createdRequests_DPL_collectField.toString(), s.createdRequests_DPL_collectField==null ? null : s.createdRequests_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.createdRequests_DPL_collectField==null ? null : f.createdRequests_DPL_collectField.toString(), s.createdRequests_DPL_collectField==null ? null : s.createdRequests_DPL_collectField.toString());
if (CompareUtils.compare(f.documents_DPL_collectField==null ? null : f.documents_DPL_collectField.toString(), s.documents_DPL_collectField==null ? null : s.documents_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.documents_DPL_collectField==null ? null : f.documents_DPL_collectField.toString(), s.documents_DPL_collectField==null ? null : s.documents_DPL_collectField.toString());
if (CompareUtils.compare(f.serviceAccessTools_DPL_collectField==null ? null : f.serviceAccessTools_DPL_collectField.toString(), s.serviceAccessTools_DPL_collectField==null ? null : s.serviceAccessTools_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.serviceAccessTools_DPL_collectField==null ? null : f.serviceAccessTools_DPL_collectField.toString(), s.serviceAccessTools_DPL_collectField==null ? null : s.serviceAccessTools_DPL_collectField.toString());
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString());
if (CompareUtils.compare(f.transactionTags, s.transactionTags) != 0) return CompareUtils.compare(f.transactionTags, s.transactionTags);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
