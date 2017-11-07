
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedContractLinkBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedContractLink r = new com.sbt.cdm.api.model.published.instance.PublishedContractLink();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.code = DelimetedStringParser.str(4, line, indexes);
r.name = DelimetedStringParser.str(5, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(6, line, indexes);
r.relatedRole_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(8, line, indexes);
r.сloseDate = DelimetedStringParser.date(9, line, indexes);
r.endDate = DelimetedStringParser.date(10, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(11, line, indexes);

         return r;
     }
 }
            
