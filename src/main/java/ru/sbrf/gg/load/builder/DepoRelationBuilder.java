
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class DepoRelationBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.DepoRelation r = new com.sbt.cdm.model.extension.deposit.DepoRelation();
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
 }
            
