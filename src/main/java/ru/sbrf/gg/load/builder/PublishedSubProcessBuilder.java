
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedSubProcessBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedSubProcess r = new com.sbt.cdm.api.model.published.instance.PublishedSubProcess();
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
 }
            
