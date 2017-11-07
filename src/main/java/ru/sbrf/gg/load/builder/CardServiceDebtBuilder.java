
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class CardServiceDebtBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.CardServiceDebt r = new com.sbt.cdm.model.extension.deposit.CardServiceDebt();
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
 }
            
