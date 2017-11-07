
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedPlasticCardBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedPlasticCard r = new com.sbt.cdm.api.model.published.instance.PublishedPlasticCard();
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
r.numberMask = DelimetedStringParser.str(13, line, indexes);
r.plasticCardType_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.wAYProd_DPL_id = DelimetedStringParser._long(15, line, indexes);
r.ipsCode = DelimetedStringParser.str(16, line, indexes);
r.iPSParty_DPL_id = DelimetedStringParser._long(17, line, indexes);
r.marketPlace_DPL_id = DelimetedStringParser._long(18, line, indexes);
r.chipApplication_DPL_id = DelimetedStringParser._long(19, line, indexes);
r.embossName = DelimetedStringParser.str(20, line, indexes);
r.cardOwner_DPL_id = DelimetedStringParser._long(21, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(24, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(25, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(26, line, indexes);

         return r;
     }
 }
            
