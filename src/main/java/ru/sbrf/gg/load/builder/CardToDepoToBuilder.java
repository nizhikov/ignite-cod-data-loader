
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class CardToDepoToBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.CardToDepoTo r = new com.sbt.cdm.model.extension.deposit.CardToDepoTo();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.productParty_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.prcntBranchno = DelimetedStringParser._long(4, line, indexes);
r.prcntCardto = DelimetedStringParser.str(5, line, indexes);
r.prcntClerk = DelimetedStringParser._long(6, line, indexes);
r.prcntDay = DelimetedStringParser.date(7, line, indexes);
r.prcntDepoto = DelimetedStringParser.str(8, line, indexes);
r.prcntTb = DelimetedStringParser._long(9, line, indexes);
r.prcntJrnno = DelimetedStringParser._long(10, line, indexes);
r.prcntOffice = DelimetedStringParser._long(11, line, indexes);
r.prcntState = DelimetedStringParser._long(12, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(13, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(14, line, indexes);

         return r;
     }
 }
            
