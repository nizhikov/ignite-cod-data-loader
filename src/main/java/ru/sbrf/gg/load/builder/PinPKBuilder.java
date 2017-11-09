
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.PinPK;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PinPKBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PinPK r = new PinPK();
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

     @Override public int compare(Object first, Object second) {
         PinPK f = (PinPK)first;
         PinPK s = (PinPK)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id) != 0) return CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id);
if (CompareUtils.compare(f.pinpkAuthDay, s.pinpkAuthDay) != 0) return CompareUtils.compare(f.pinpkAuthDay, s.pinpkAuthDay);
if (CompareUtils.compare(f.pinpkAuthcode, s.pinpkAuthcode) != 0) return CompareUtils.compare(f.pinpkAuthcode, s.pinpkAuthcode);
if (CompareUtils.compare(f.pinpkCardno, s.pinpkCardno) != 0) return CompareUtils.compare(f.pinpkCardno, s.pinpkCardno);
if (CompareUtils.compare(f.pinpkClientFio, s.pinpkClientFio) != 0) return CompareUtils.compare(f.pinpkClientFio, s.pinpkClientFio);
if (CompareUtils.compare(f.pinpkExpDate, s.pinpkExpDate) != 0) return CompareUtils.compare(f.pinpkExpDate, s.pinpkExpDate);
if (CompareUtils.compare(f.pinpkTb, s.pinpkTb) != 0) return CompareUtils.compare(f.pinpkTb, s.pinpkTb);
if (CompareUtils.compare(f.pinpkOpday, s.pinpkOpday) != 0) return CompareUtils.compare(f.pinpkOpday, s.pinpkOpday);
if (CompareUtils.compare(f.pinpkOpno, s.pinpkOpno) != 0) return CompareUtils.compare(f.pinpkOpno, s.pinpkOpno);
if (CompareUtils.compare(f.pinpkPaymasterClerk, s.pinpkPaymasterClerk) != 0) return CompareUtils.compare(f.pinpkPaymasterClerk, s.pinpkPaymasterClerk);
if (CompareUtils.compare(f.pinpkPaymasterDay, s.pinpkPaymasterDay) != 0) return CompareUtils.compare(f.pinpkPaymasterDay, s.pinpkPaymasterDay);
if (CompareUtils.compare(f.pinpkPaymasterFio, s.pinpkPaymasterFio) != 0) return CompareUtils.compare(f.pinpkPaymasterFio, s.pinpkPaymasterFio);
if (CompareUtils.compare(f.pinpkValidClerk, s.pinpkValidClerk) != 0) return CompareUtils.compare(f.pinpkValidClerk, s.pinpkValidClerk);
if (CompareUtils.compare(f.pinpkValidDay, s.pinpkValidDay) != 0) return CompareUtils.compare(f.pinpkValidDay, s.pinpkValidDay);
if (CompareUtils.compare(f.pinpkValidFio, s.pinpkValidFio) != 0) return CompareUtils.compare(f.pinpkValidFio, s.pinpkValidFio);
if (CompareUtils.compare(f.pinpkDcard, s.pinpkDcard) != 0) return CompareUtils.compare(f.pinpkDcard, s.pinpkDcard);
if (CompareUtils.compare(f.pinpk_deposit, s.pinpk_deposit) != 0) return CompareUtils.compare(f.pinpk_deposit, s.pinpk_deposit);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
