
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedProductParty;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedProductPartyBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedProductParty r = new PublishedProductParty();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.templObjId = DelimetedStringParser._long(3, line, indexes);
r.description_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.owner_DPL_id = DelimetedStringParser._long(6, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.code = DelimetedStringParser.str(8, line, indexes);
r.name = DelimetedStringParser.str(9, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(11, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(12, line, indexes);
r.registers_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.custServices_DPL_collectField = DelimetedStringParser.strBuilder(14, line, indexes);
r.planServices_DPL_collectField = DelimetedStringParser.strBuilder(15, line, indexes);
r.performedServices_DPL_collectField = DelimetedStringParser.strBuilder(16, line, indexes);
r.performedOperations_DPL_collectField = DelimetedStringParser.strBuilder(17, line, indexes);
r.accessTools_DPL_collectField = DelimetedStringParser.strBuilder(18, line, indexes);
r.searchIdentifier_DPL_collectField = DelimetedStringParser.strBuilder(19, line, indexes);
r.indicators_DPL_collectField = DelimetedStringParser.strBuilder(20, line, indexes);
r.tariffList_DPL_id = DelimetedStringParser._long(21, line, indexes);
r.beginDate = DelimetedStringParser.date(22, line, indexes);
r.endDate = DelimetedStringParser.date(23, line, indexes);
r.endFactDate = DelimetedStringParser.date(24, line, indexes);
r.productPartyRoles_DPL_collectField = DelimetedStringParser.strBuilder(25, line, indexes);
r.relatedProducts_DPL_collectField = DelimetedStringParser.strBuilder(26, line, indexes);
r.comment = DelimetedStringParser.str(27, line, indexes);
r.assets_DPL_collectField = DelimetedStringParser.strBuilder(28, line, indexes);
r.division_DPL_id = DelimetedStringParser._long(29, line, indexes);
r.version_DPL_id = DelimetedStringParser._long(30, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(31, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(32, line, indexes);
r.reason_DPL_id = DelimetedStringParser._long(33, line, indexes);
r.documents_DPL_collectField = DelimetedStringParser.strBuilder(34, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(35, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedProductParty f = (PublishedProductParty)first;
         PublishedProductParty s = (PublishedProductParty)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.templObjId, s.templObjId) != 0) return CompareUtils.compare(f.templObjId, s.templObjId);
if (CompareUtils.compare(f.description_DPL_id, s.description_DPL_id) != 0) return CompareUtils.compare(f.description_DPL_id, s.description_DPL_id);
if (CompareUtils.compare(f.owner_DPL_id, s.owner_DPL_id) != 0) return CompareUtils.compare(f.owner_DPL_id, s.owner_DPL_id);
if (CompareUtils.compare(f.type_DPL_id, s.type_DPL_id) != 0) return CompareUtils.compare(f.type_DPL_id, s.type_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString());
if (CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id) != 0) return CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id);
if (CompareUtils.compare(f.registers_DPL_collectField==null ? null : f.registers_DPL_collectField.toString(), s.registers_DPL_collectField==null ? null : s.registers_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.registers_DPL_collectField==null ? null : f.registers_DPL_collectField.toString(), s.registers_DPL_collectField==null ? null : s.registers_DPL_collectField.toString());
if (CompareUtils.compare(f.custServices_DPL_collectField==null ? null : f.custServices_DPL_collectField.toString(), s.custServices_DPL_collectField==null ? null : s.custServices_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.custServices_DPL_collectField==null ? null : f.custServices_DPL_collectField.toString(), s.custServices_DPL_collectField==null ? null : s.custServices_DPL_collectField.toString());
if (CompareUtils.compare(f.planServices_DPL_collectField==null ? null : f.planServices_DPL_collectField.toString(), s.planServices_DPL_collectField==null ? null : s.planServices_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.planServices_DPL_collectField==null ? null : f.planServices_DPL_collectField.toString(), s.planServices_DPL_collectField==null ? null : s.planServices_DPL_collectField.toString());
if (CompareUtils.compare(f.performedServices_DPL_collectField==null ? null : f.performedServices_DPL_collectField.toString(), s.performedServices_DPL_collectField==null ? null : s.performedServices_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.performedServices_DPL_collectField==null ? null : f.performedServices_DPL_collectField.toString(), s.performedServices_DPL_collectField==null ? null : s.performedServices_DPL_collectField.toString());
if (CompareUtils.compare(f.performedOperations_DPL_collectField==null ? null : f.performedOperations_DPL_collectField.toString(), s.performedOperations_DPL_collectField==null ? null : s.performedOperations_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.performedOperations_DPL_collectField==null ? null : f.performedOperations_DPL_collectField.toString(), s.performedOperations_DPL_collectField==null ? null : s.performedOperations_DPL_collectField.toString());
if (CompareUtils.compare(f.accessTools_DPL_collectField==null ? null : f.accessTools_DPL_collectField.toString(), s.accessTools_DPL_collectField==null ? null : s.accessTools_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.accessTools_DPL_collectField==null ? null : f.accessTools_DPL_collectField.toString(), s.accessTools_DPL_collectField==null ? null : s.accessTools_DPL_collectField.toString());
if (CompareUtils.compare(f.searchIdentifier_DPL_collectField==null ? null : f.searchIdentifier_DPL_collectField.toString(), s.searchIdentifier_DPL_collectField==null ? null : s.searchIdentifier_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.searchIdentifier_DPL_collectField==null ? null : f.searchIdentifier_DPL_collectField.toString(), s.searchIdentifier_DPL_collectField==null ? null : s.searchIdentifier_DPL_collectField.toString());
if (CompareUtils.compare(f.indicators_DPL_collectField==null ? null : f.indicators_DPL_collectField.toString(), s.indicators_DPL_collectField==null ? null : s.indicators_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.indicators_DPL_collectField==null ? null : f.indicators_DPL_collectField.toString(), s.indicators_DPL_collectField==null ? null : s.indicators_DPL_collectField.toString());
if (CompareUtils.compare(f.tariffList_DPL_id, s.tariffList_DPL_id) != 0) return CompareUtils.compare(f.tariffList_DPL_id, s.tariffList_DPL_id);
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.endFactDate, s.endFactDate) != 0) return CompareUtils.compare(f.endFactDate, s.endFactDate);
if (CompareUtils.compare(f.productPartyRoles_DPL_collectField==null ? null : f.productPartyRoles_DPL_collectField.toString(), s.productPartyRoles_DPL_collectField==null ? null : s.productPartyRoles_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.productPartyRoles_DPL_collectField==null ? null : f.productPartyRoles_DPL_collectField.toString(), s.productPartyRoles_DPL_collectField==null ? null : s.productPartyRoles_DPL_collectField.toString());
if (CompareUtils.compare(f.relatedProducts_DPL_collectField==null ? null : f.relatedProducts_DPL_collectField.toString(), s.relatedProducts_DPL_collectField==null ? null : s.relatedProducts_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.relatedProducts_DPL_collectField==null ? null : f.relatedProducts_DPL_collectField.toString(), s.relatedProducts_DPL_collectField==null ? null : s.relatedProducts_DPL_collectField.toString());
if (CompareUtils.compare(f.comment, s.comment) != 0) return CompareUtils.compare(f.comment, s.comment);
if (CompareUtils.compare(f.assets_DPL_collectField==null ? null : f.assets_DPL_collectField.toString(), s.assets_DPL_collectField==null ? null : s.assets_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.assets_DPL_collectField==null ? null : f.assets_DPL_collectField.toString(), s.assets_DPL_collectField==null ? null : s.assets_DPL_collectField.toString());
if (CompareUtils.compare(f.division_DPL_id, s.division_DPL_id) != 0) return CompareUtils.compare(f.division_DPL_id, s.division_DPL_id);
if (CompareUtils.compare(f.version_DPL_id, s.version_DPL_id) != 0) return CompareUtils.compare(f.version_DPL_id, s.version_DPL_id);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.reason_DPL_id, s.reason_DPL_id) != 0) return CompareUtils.compare(f.reason_DPL_id, s.reason_DPL_id);
if (CompareUtils.compare(f.documents_DPL_collectField==null ? null : f.documents_DPL_collectField.toString(), s.documents_DPL_collectField==null ? null : s.documents_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.documents_DPL_collectField==null ? null : f.documents_DPL_collectField.toString(), s.documents_DPL_collectField==null ? null : s.documents_DPL_collectField.toString());
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
