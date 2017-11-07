
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedPerformedServiceBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedPerformedService r = new com.sbt.cdm.api.model.published.instance.PublishedPerformedService();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.code = DelimetedStringParser.str(5, line, indexes);
r.name = DelimetedStringParser.str(6, line, indexes);
r.owner_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.parties_DPL_collectField = DelimetedStringParser.strBuilder(8, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(9, line, indexes);
r.subProcess_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.custService_DPL_id = DelimetedStringParser._long(12, line, indexes);
r.performedOperations_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.serviceRegisters_DPL_collectField = DelimetedStringParser.strBuilder(14, line, indexes);
r.beginDate = DelimetedStringParser.date(15, line, indexes);
r.endDate = DelimetedStringParser.date(16, line, indexes);
r.createdRequests_DPL_collectField = DelimetedStringParser.strBuilder(17, line, indexes);
r.documents_DPL_collectField = DelimetedStringParser.strBuilder(18, line, indexes);
r.serviceAccessTools_DPL_collectField = DelimetedStringParser.strBuilder(19, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(20, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(21, line, indexes);
r.transactionTags = DelimetedStringParser.str(22, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(25, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(26, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(27, line, indexes);

         return r;
     }
 }
            
