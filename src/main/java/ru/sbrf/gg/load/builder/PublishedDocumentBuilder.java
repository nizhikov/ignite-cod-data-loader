
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedDocumentBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedDocument r = new com.sbt.cdm.api.model.published.instance.PublishedDocument();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.code = DelimetedStringParser.str(5, line, indexes);
r.name = DelimetedStringParser.str(6, line, indexes);
r.client_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.docNum = DelimetedStringParser.str(8, line, indexes);
r.createDate = DelimetedStringParser.date(9, line, indexes);
r.receiveDate = DelimetedStringParser.date(10, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(11, line, indexes);
r.issuing = DelimetedStringParser.str(12, line, indexes);
r.docScan = DelimetedStringParser.str(13, line, indexes);
r.docForm_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(15, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(16, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(17, line, indexes);

         return r;
     }
 }
            
