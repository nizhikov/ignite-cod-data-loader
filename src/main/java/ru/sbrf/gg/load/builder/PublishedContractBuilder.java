
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedContract;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedContractBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedContract r = new PublishedContract();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.owner_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.products_DPL_collectField = DelimetedStringParser.strBuilder(5, line, indexes);
r.number = DelimetedStringParser.str(6, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.code = DelimetedStringParser.str(8, line, indexes);
r.name = DelimetedStringParser.str(9, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.signatories_DPL_collectField = DelimetedStringParser.strBuilder(12, line, indexes);
r.lawConditions_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.printForm_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.addContracts_DPL_collectField = DelimetedStringParser.strBuilder(15, line, indexes);
r.beginDate = DelimetedStringParser.date(16, line, indexes);
r.endDate = DelimetedStringParser.date(17, line, indexes);
r.closeDate = DelimetedStringParser.date(18, line, indexes);
r.actualOperation_DPL_id = DelimetedStringParser._long(19, line, indexes);
r.relatedContracts_DPL_collectField = DelimetedStringParser.strBuilder(20, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(21, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(22, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(24, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedContract f = (PublishedContract)first;
         PublishedContract s = (PublishedContract)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.owner_DPL_id, s.owner_DPL_id) != 0) return CompareUtils.compare(f.owner_DPL_id, s.owner_DPL_id);
if (CompareUtils.compare(f.products_DPL_collectField==null ? null : f.products_DPL_collectField.toString(), s.products_DPL_collectField==null ? null : s.products_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.products_DPL_collectField==null ? null : f.products_DPL_collectField.toString(), s.products_DPL_collectField==null ? null : s.products_DPL_collectField.toString());
if (CompareUtils.compare(f.number, s.number) != 0) return CompareUtils.compare(f.number, s.number);
if (CompareUtils.compare(f.type_DPL_id, s.type_DPL_id) != 0) return CompareUtils.compare(f.type_DPL_id, s.type_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.signatories_DPL_collectField==null ? null : f.signatories_DPL_collectField.toString(), s.signatories_DPL_collectField==null ? null : s.signatories_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.signatories_DPL_collectField==null ? null : f.signatories_DPL_collectField.toString(), s.signatories_DPL_collectField==null ? null : s.signatories_DPL_collectField.toString());
if (CompareUtils.compare(f.lawConditions_DPL_collectField==null ? null : f.lawConditions_DPL_collectField.toString(), s.lawConditions_DPL_collectField==null ? null : s.lawConditions_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.lawConditions_DPL_collectField==null ? null : f.lawConditions_DPL_collectField.toString(), s.lawConditions_DPL_collectField==null ? null : s.lawConditions_DPL_collectField.toString());
if (CompareUtils.compare(f.printForm_DPL_id, s.printForm_DPL_id) != 0) return CompareUtils.compare(f.printForm_DPL_id, s.printForm_DPL_id);
if (CompareUtils.compare(f.addContracts_DPL_collectField==null ? null : f.addContracts_DPL_collectField.toString(), s.addContracts_DPL_collectField==null ? null : s.addContracts_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.addContracts_DPL_collectField==null ? null : f.addContracts_DPL_collectField.toString(), s.addContracts_DPL_collectField==null ? null : s.addContracts_DPL_collectField.toString());
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.closeDate, s.closeDate) != 0) return CompareUtils.compare(f.closeDate, s.closeDate);
if (CompareUtils.compare(f.actualOperation_DPL_id, s.actualOperation_DPL_id) != 0) return CompareUtils.compare(f.actualOperation_DPL_id, s.actualOperation_DPL_id);
if (CompareUtils.compare(f.relatedContracts_DPL_collectField==null ? null : f.relatedContracts_DPL_collectField.toString(), s.relatedContracts_DPL_collectField==null ? null : s.relatedContracts_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.relatedContracts_DPL_collectField==null ? null : f.relatedContracts_DPL_collectField.toString(), s.relatedContracts_DPL_collectField==null ? null : s.relatedContracts_DPL_collectField.toString());
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
