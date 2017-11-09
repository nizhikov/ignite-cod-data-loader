
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.CardServiceDebt;

 import ru.sbt.kmdtransform.TransformType.*;

 public class CardServiceDebtBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         CardServiceDebt r = new CardServiceDebt();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operation_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.cardservicedebtDay = DelimetedStringParser.date(4, line, indexes);
r.cardservicedebtTxkind = DelimetedStringParser._long(5, line, indexes);
r.cardservicedebtDebtcash = DelimetedStringParser.bigDecimal(6, line, indexes);
r.cardservicedebtPaycash = DelimetedStringParser.bigDecimal(7, line, indexes);
r.cardservicedebtCancelcash = DelimetedStringParser.bigDecimal(8, line, indexes);
r.cardservicedebtReturncash = DelimetedStringParser.bigDecimal(9, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(12, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         CardServiceDebt f = (CardServiceDebt)first;
         CardServiceDebt s = (CardServiceDebt)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operation_DPL_id, s.operation_DPL_id) != 0) return CompareUtils.compare(f.operation_DPL_id, s.operation_DPL_id);
if (CompareUtils.compare(f.cardservicedebtDay, s.cardservicedebtDay) != 0) return CompareUtils.compare(f.cardservicedebtDay, s.cardservicedebtDay);
if (CompareUtils.compare(f.cardservicedebtTxkind, s.cardservicedebtTxkind) != 0) return CompareUtils.compare(f.cardservicedebtTxkind, s.cardservicedebtTxkind);
if (CompareUtils.compare(f.cardservicedebtDebtcash, s.cardservicedebtDebtcash) != 0) return CompareUtils.compare(f.cardservicedebtDebtcash, s.cardservicedebtDebtcash);
if (CompareUtils.compare(f.cardservicedebtPaycash, s.cardservicedebtPaycash) != 0) return CompareUtils.compare(f.cardservicedebtPaycash, s.cardservicedebtPaycash);
if (CompareUtils.compare(f.cardservicedebtCancelcash, s.cardservicedebtCancelcash) != 0) return CompareUtils.compare(f.cardservicedebtCancelcash, s.cardservicedebtCancelcash);
if (CompareUtils.compare(f.cardservicedebtReturncash, s.cardservicedebtReturncash) != 0) return CompareUtils.compare(f.cardservicedebtReturncash, s.cardservicedebtReturncash);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
