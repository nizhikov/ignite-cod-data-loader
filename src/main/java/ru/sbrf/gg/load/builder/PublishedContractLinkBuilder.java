
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedContractLink;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedContractLinkBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedContractLink r = new PublishedContractLink();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.code = DelimetedStringParser.str(4, line, indexes);
r.name = DelimetedStringParser.str(5, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(6, line, indexes);
r.relatedRole_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(8, line, indexes);
r.сloseDate = DelimetedStringParser.date(9, line, indexes);
r.endDate = DelimetedStringParser.date(10, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(11, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedContractLink f = (PublishedContractLink)first;
         PublishedContractLink s = (PublishedContractLink)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id) != 0) return CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id);
if (CompareUtils.compare(f.relatedRole_DPL_id, s.relatedRole_DPL_id) != 0) return CompareUtils.compare(f.relatedRole_DPL_id, s.relatedRole_DPL_id);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.сloseDate, s.сloseDate) != 0) return CompareUtils.compare(f.сloseDate, s.сloseDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
