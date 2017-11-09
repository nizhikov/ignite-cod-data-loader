
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedSubProcess;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedSubProcessBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedSubProcess r = new PublishedSubProcess();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(1, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.code = DelimetedStringParser.str(4, line, indexes);
r.name = DelimetedStringParser.str(5, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(6, line, indexes);
r.beginDate = DelimetedStringParser.date(7, line, indexes);
r.endDate = DelimetedStringParser.date(8, line, indexes);
r.operations_DPL_collectField = DelimetedStringParser.strBuilder(9, line, indexes);
r.appModule_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(11, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedSubProcess f = (PublishedSubProcess)first;
         PublishedSubProcess s = (PublishedSubProcess)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.operations_DPL_collectField==null ? null : f.operations_DPL_collectField.toString(), s.operations_DPL_collectField==null ? null : s.operations_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.operations_DPL_collectField==null ? null : f.operations_DPL_collectField.toString(), s.operations_DPL_collectField==null ? null : s.operations_DPL_collectField.toString());
if (CompareUtils.compare(f.appModule_DPL_id, s.appModule_DPL_id) != 0) return CompareUtils.compare(f.appModule_DPL_id, s.appModule_DPL_id);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());

         return 0;
     }
 }
            
