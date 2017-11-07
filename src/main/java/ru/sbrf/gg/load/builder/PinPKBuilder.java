
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PinPKBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.PinPK r = new com.sbt.cdm.model.extension.deposit.PinPK();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operationRun_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.pinpkAuthDay = DelimetedStringParser.date(4, line, indexes);
r.pinpkAuthcode = DelimetedStringParser.str(5, line, indexes);
r.pinpkCardno = DelimetedStringParser.str(6, line, indexes);
r.pinpkClientFio = DelimetedStringParser.str(7, line, indexes);
r.pinpkExpDate = DelimetedStringParser.date(8, line, indexes);
r.pinpkTb = DelimetedStringParser._long(9, line, indexes);
r.pinpkOpday = DelimetedStringParser.date(10, line, indexes);
r.pinpkOpno = DelimetedStringParser._long(11, line, indexes);
r.pinpkPaymasterClerk = DelimetedStringParser._long(12, line, indexes);
r.pinpkPaymasterDay = DelimetedStringParser.date(13, line, indexes);
r.pinpkPaymasterFio = DelimetedStringParser.str(14, line, indexes);
r.pinpkValidClerk = DelimetedStringParser._long(15, line, indexes);
r.pinpkValidDay = DelimetedStringParser.date(16, line, indexes);
r.pinpkValidFio = DelimetedStringParser.str(17, line, indexes);
r.pinpkDcard = DelimetedStringParser.str(18, line, indexes);
r.pinpk_deposit = DelimetedStringParser._long(19, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(20, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(21, line, indexes);

         return r;
     }
 }
            
