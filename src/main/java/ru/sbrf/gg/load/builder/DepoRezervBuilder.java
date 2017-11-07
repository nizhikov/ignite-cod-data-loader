
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class DepoRezervBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.DepoRezerv r = new com.sbt.cdm.model.extension.deposit.DepoRezerv();
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
 }
            
