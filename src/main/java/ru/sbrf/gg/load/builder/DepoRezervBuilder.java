
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.DepoRezerv;

 import ru.sbt.kmdtransform.TransformType.*;

 public class DepoRezervBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         DepoRezerv r = new DepoRezerv();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operationRun_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.deporezerv_branchno = DelimetedStringParser._long(4, line, indexes);
r.deporezervClerk = DelimetedStringParser._long(5, line, indexes);
r.deporezervDayfact = DelimetedStringParser.date(6, line, indexes);
r.deporezervDayrezerv = DelimetedStringParser.date(7, line, indexes);
r.deporezerv_tb = DelimetedStringParser._long(8, line, indexes);
r.deporezervInitiator = DelimetedStringParser.str(9, line, indexes);
r.deporezervJrnno = DelimetedStringParser._long(10, line, indexes);
r.deporezerv_office = DelimetedStringParser._long(11, line, indexes);
r.deporezervOpcashrezerv = DelimetedStringParser.bigDecimal(12, line, indexes);
r.deporezervRezervid = DelimetedStringParser._long(13, line, indexes);
r.deporezervState = DelimetedStringParser._long(14, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(15, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(16, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         DepoRezerv f = (DepoRezerv)first;
         DepoRezerv s = (DepoRezerv)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id) != 0) return CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id);
if (CompareUtils.compare(f.deporezerv_branchno, s.deporezerv_branchno) != 0) return CompareUtils.compare(f.deporezerv_branchno, s.deporezerv_branchno);
if (CompareUtils.compare(f.deporezervClerk, s.deporezervClerk) != 0) return CompareUtils.compare(f.deporezervClerk, s.deporezervClerk);
if (CompareUtils.compare(f.deporezervDayfact, s.deporezervDayfact) != 0) return CompareUtils.compare(f.deporezervDayfact, s.deporezervDayfact);
if (CompareUtils.compare(f.deporezervDayrezerv, s.deporezervDayrezerv) != 0) return CompareUtils.compare(f.deporezervDayrezerv, s.deporezervDayrezerv);
if (CompareUtils.compare(f.deporezerv_tb, s.deporezerv_tb) != 0) return CompareUtils.compare(f.deporezerv_tb, s.deporezerv_tb);
if (CompareUtils.compare(f.deporezervInitiator, s.deporezervInitiator) != 0) return CompareUtils.compare(f.deporezervInitiator, s.deporezervInitiator);
if (CompareUtils.compare(f.deporezervJrnno, s.deporezervJrnno) != 0) return CompareUtils.compare(f.deporezervJrnno, s.deporezervJrnno);
if (CompareUtils.compare(f.deporezerv_office, s.deporezerv_office) != 0) return CompareUtils.compare(f.deporezerv_office, s.deporezerv_office);
if (CompareUtils.compare(f.deporezervOpcashrezerv, s.deporezervOpcashrezerv) != 0) return CompareUtils.compare(f.deporezervOpcashrezerv, s.deporezervOpcashrezerv);
if (CompareUtils.compare(f.deporezervRezervid, s.deporezervRezervid) != 0) return CompareUtils.compare(f.deporezervRezervid, s.deporezervRezervid);
if (CompareUtils.compare(f.deporezervState, s.deporezervState) != 0) return CompareUtils.compare(f.deporezervState, s.deporezervState);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
