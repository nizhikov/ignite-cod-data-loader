
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.DepoRelation;

 import ru.sbt.kmdtransform.TransformType.*;

 public class DepoRelationBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         DepoRelation r = new DepoRelation();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operationRun_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.deporelation_branchno = DelimetedStringParser._long(4, line, indexes);
r.deporelationDateChange = DelimetedStringParser.date(5, line, indexes);
r.deporelationFio = DelimetedStringParser.str(6, line, indexes);
r.deporelationFlagKred = DelimetedStringParser._long(7, line, indexes);
r.deporelation_tb = DelimetedStringParser._long(8, line, indexes);
r.deporelation_office = DelimetedStringParser._long(9, line, indexes);
r.deporelationTypeRec = DelimetedStringParser._long(10, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(12, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         DepoRelation f = (DepoRelation)first;
         DepoRelation s = (DepoRelation)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id) != 0) return CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id);
if (CompareUtils.compare(f.deporelation_branchno, s.deporelation_branchno) != 0) return CompareUtils.compare(f.deporelation_branchno, s.deporelation_branchno);
if (CompareUtils.compare(f.deporelationDateChange, s.deporelationDateChange) != 0) return CompareUtils.compare(f.deporelationDateChange, s.deporelationDateChange);
if (CompareUtils.compare(f.deporelationFio, s.deporelationFio) != 0) return CompareUtils.compare(f.deporelationFio, s.deporelationFio);
if (CompareUtils.compare(f.deporelationFlagKred, s.deporelationFlagKred) != 0) return CompareUtils.compare(f.deporelationFlagKred, s.deporelationFlagKred);
if (CompareUtils.compare(f.deporelation_tb, s.deporelation_tb) != 0) return CompareUtils.compare(f.deporelation_tb, s.deporelation_tb);
if (CompareUtils.compare(f.deporelation_office, s.deporelation_office) != 0) return CompareUtils.compare(f.deporelation_office, s.deporelation_office);
if (CompareUtils.compare(f.deporelationTypeRec, s.deporelationTypeRec) != 0) return CompareUtils.compare(f.deporelationTypeRec, s.deporelationTypeRec);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
