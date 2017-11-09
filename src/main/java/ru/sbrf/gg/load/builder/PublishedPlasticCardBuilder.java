
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedPlasticCard;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedPlasticCardBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedPlasticCard r = new PublishedPlasticCard();
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

     @Override public int compare(Object first, Object second) {
         PublishedPlasticCard f = (PublishedPlasticCard)first;
         PublishedPlasticCard s = (PublishedPlasticCard)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.accessToolType_DPL_id, s.accessToolType_DPL_id) != 0) return CompareUtils.compare(f.accessToolType_DPL_id, s.accessToolType_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.dateRelease, s.dateRelease) != 0) return CompareUtils.compare(f.dateRelease, s.dateRelease);
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString());
if (CompareUtils.compare(f.numberMask, s.numberMask) != 0) return CompareUtils.compare(f.numberMask, s.numberMask);
if (CompareUtils.compare(f.plasticCardType_DPL_id, s.plasticCardType_DPL_id) != 0) return CompareUtils.compare(f.plasticCardType_DPL_id, s.plasticCardType_DPL_id);
if (CompareUtils.compare(f.wAYProd_DPL_id, s.wAYProd_DPL_id) != 0) return CompareUtils.compare(f.wAYProd_DPL_id, s.wAYProd_DPL_id);
if (CompareUtils.compare(f.ipsCode, s.ipsCode) != 0) return CompareUtils.compare(f.ipsCode, s.ipsCode);
if (CompareUtils.compare(f.iPSParty_DPL_id, s.iPSParty_DPL_id) != 0) return CompareUtils.compare(f.iPSParty_DPL_id, s.iPSParty_DPL_id);
if (CompareUtils.compare(f.marketPlace_DPL_id, s.marketPlace_DPL_id) != 0) return CompareUtils.compare(f.marketPlace_DPL_id, s.marketPlace_DPL_id);
if (CompareUtils.compare(f.chipApplication_DPL_id, s.chipApplication_DPL_id) != 0) return CompareUtils.compare(f.chipApplication_DPL_id, s.chipApplication_DPL_id);
if (CompareUtils.compare(f.embossName, s.embossName) != 0) return CompareUtils.compare(f.embossName, s.embossName);
if (CompareUtils.compare(f.cardOwner_DPL_id, s.cardOwner_DPL_id) != 0) return CompareUtils.compare(f.cardOwner_DPL_id, s.cardOwner_DPL_id);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
