
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedSberBookBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedSberBook r = new com.sbt.cdm.api.model.published.instance.PublishedSberBook();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.accessToolType_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.code = DelimetedStringParser.str(6, line, indexes);
r.name = DelimetedStringParser.str(7, line, indexes);
r.dateRelease = DelimetedStringParser.date(8, line, indexes);
r.beginDate = DelimetedStringParser.date(9, line, indexes);
r.endDate = DelimetedStringParser.date(10, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(12, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.numberMask = DelimetedStringParser.str(14, line, indexes);
r.dupsBookNum = DelimetedStringParser._int(15, line, indexes);
r.lineNum = DelimetedStringParser._int(16, line, indexes);
r.unseenOpCnt = DelimetedStringParser._int(17, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(18, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(19, line, indexes);

         return r;
     }
 }
            
