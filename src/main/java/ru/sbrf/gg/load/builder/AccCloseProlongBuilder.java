
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class AccCloseProlongBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.AccCloseProlong r = new com.sbt.cdm.model.extension.deposit.AccCloseProlong();
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
r.prcntClerkFio = DelimetedStringParser.str(12, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(13, line, indexes);
r.prcntIsactual = DelimetedStringParser._int(14, line, indexes);
r.prcntTbChange = DelimetedStringParser._long(15, line, indexes);
r.prcntBranchnoChange = DelimetedStringParser._long(16, line, indexes);
r.prcntOfficeChange = DelimetedStringParser._long(17, line, indexes);
r.prcntDayChange = DelimetedStringParser.date(18, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(19, line, indexes);

         return r;
     }
 }
            
