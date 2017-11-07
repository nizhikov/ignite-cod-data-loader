
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedContractBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedContract r = new com.sbt.cdm.api.model.published.instance.PublishedContract();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.owner_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.products_DPL_collectField = DelimetedStringParser.strBuilder(5, line, indexes);
r.number = DelimetedStringParser.str(6, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.code = DelimetedStringParser.str(8, line, indexes);
r.name = DelimetedStringParser.str(9, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.signatories_DPL_collectField = DelimetedStringParser.strBuilder(12, line, indexes);
r.lawConditions_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.printForm_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.addContracts_DPL_collectField = DelimetedStringParser.strBuilder(15, line, indexes);
r.beginDate = DelimetedStringParser.date(16, line, indexes);
r.endDate = DelimetedStringParser.date(17, line, indexes);
r.closeDate = DelimetedStringParser.date(18, line, indexes);
r.actualOperation_DPL_id = DelimetedStringParser._long(19, line, indexes);
r.relatedContracts_DPL_collectField = DelimetedStringParser.strBuilder(20, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(21, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(22, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(24, line, indexes);

         return r;
     }
 }
            
