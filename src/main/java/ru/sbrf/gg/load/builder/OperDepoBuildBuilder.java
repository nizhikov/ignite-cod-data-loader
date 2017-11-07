
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class OperDepoBuildBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.OperDepoBuild r = new com.sbt.cdm.model.extension.deposit.OperDepoBuild();
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
 }
            
