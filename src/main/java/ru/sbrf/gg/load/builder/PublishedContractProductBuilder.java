
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedContractProductBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedContractProduct r = new com.sbt.cdm.api.model.published.instance.PublishedContractProduct();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.code = DelimetedStringParser.str(6, line, indexes);
r.productRoleType_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.name = DelimetedStringParser.str(8, line, indexes);
r.lawConditions_DPL_collectField = DelimetedStringParser.strBuilder(9, line, indexes);
r.printForm_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(12, line, indexes);

         return r;
     }
 }
            
