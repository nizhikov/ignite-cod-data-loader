
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedAccessTool;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedAccessToolBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedAccessTool r = new PublishedAccessTool();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.sberBook_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.plasticCard_DPL_id = DelimetedStringParser._long(6, line, indexes);
r.accessToolType_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(8, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(9, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(11, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedAccessTool f = (PublishedAccessTool)first;
         PublishedAccessTool s = (PublishedAccessTool)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.sberBook_DPL_id, s.sberBook_DPL_id) != 0) return CompareUtils.compare(f.sberBook_DPL_id, s.sberBook_DPL_id);
if (CompareUtils.compare(f.plasticCard_DPL_id, s.plasticCard_DPL_id) != 0) return CompareUtils.compare(f.plasticCard_DPL_id, s.plasticCard_DPL_id);
if (CompareUtils.compare(f.accessToolType_DPL_id, s.accessToolType_DPL_id) != 0) return CompareUtils.compare(f.accessToolType_DPL_id, s.accessToolType_DPL_id);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
