
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedProductPartyRoleInst;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedProductPartyRoleInstBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedProductPartyRoleInst r = new PublishedProductPartyRoleInst();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.code = DelimetedStringParser.str(5, line, indexes);
r.name = DelimetedStringParser.str(6, line, indexes);
r.party_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(8, line, indexes);
r.productPartyRoleType_DPL_id = DelimetedStringParser._long(9, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(11, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedProductPartyRoleInst f = (PublishedProductPartyRoleInst)first;
         PublishedProductPartyRoleInst s = (PublishedProductPartyRoleInst)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.party_DPL_id, s.party_DPL_id) != 0) return CompareUtils.compare(f.party_DPL_id, s.party_DPL_id);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.productPartyRoleType_DPL_id, s.productPartyRoleType_DPL_id) != 0) return CompareUtils.compare(f.productPartyRoleType_DPL_id, s.productPartyRoleType_DPL_id);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
