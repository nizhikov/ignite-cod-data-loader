
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedContractProduct;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedContractProductBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedContractProduct r = new PublishedContractProduct();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.code = DelimetedStringParser.str(6, line, indexes);
r.productRoleType_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.name = DelimetedStringParser.str(8, line, indexes);
r.lawConditions_DPL_collectField = DelimetedStringParser.strBuilder(9, line, indexes);
r.printForm_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(12, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedContractProduct f = (PublishedContractProduct)first;
         PublishedContractProduct s = (PublishedContractProduct)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id) != 0) return CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.productRoleType_DPL_id, s.productRoleType_DPL_id) != 0) return CompareUtils.compare(f.productRoleType_DPL_id, s.productRoleType_DPL_id);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.lawConditions_DPL_collectField==null ? null : f.lawConditions_DPL_collectField.toString(), s.lawConditions_DPL_collectField==null ? null : s.lawConditions_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.lawConditions_DPL_collectField==null ? null : f.lawConditions_DPL_collectField.toString(), s.lawConditions_DPL_collectField==null ? null : s.lawConditions_DPL_collectField.toString());
if (CompareUtils.compare(f.printForm_DPL_id, s.printForm_DPL_id) != 0) return CompareUtils.compare(f.printForm_DPL_id, s.printForm_DPL_id);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
