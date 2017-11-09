
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.OperDepoBuild;

 import ru.sbt.kmdtransform.TransformType.*;

 public class OperDepoBuildBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         OperDepoBuild r = new OperDepoBuild();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operation_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.costObj = DelimetedStringParser.bigDecimal(4, line, indexes);
r.idObj = DelimetedStringParser._long(6, line, indexes);
r.isActual = DelimetedStringParser._long(7, line, indexes);
r.numberArea = DelimetedStringParser._long(8, line, indexes);
r.numberPact = DelimetedStringParser.str(9, line, indexes);
r.period = DelimetedStringParser.date(10, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(12, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         OperDepoBuild f = (OperDepoBuild)first;
         OperDepoBuild s = (OperDepoBuild)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operation_DPL_id, s.operation_DPL_id) != 0) return CompareUtils.compare(f.operation_DPL_id, s.operation_DPL_id);
if (CompareUtils.compare(f.costObj, s.costObj) != 0) return CompareUtils.compare(f.costObj, s.costObj);
if (CompareUtils.compare(f.idObj, s.idObj) != 0) return CompareUtils.compare(f.idObj, s.idObj);
if (CompareUtils.compare(f.isActual, s.isActual) != 0) return CompareUtils.compare(f.isActual, s.isActual);
if (CompareUtils.compare(f.numberArea, s.numberArea) != 0) return CompareUtils.compare(f.numberArea, s.numberArea);
if (CompareUtils.compare(f.numberPact, s.numberPact) != 0) return CompareUtils.compare(f.numberPact, s.numberPact);
if (CompareUtils.compare(f.period, s.period) != 0) return CompareUtils.compare(f.period, s.period);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
