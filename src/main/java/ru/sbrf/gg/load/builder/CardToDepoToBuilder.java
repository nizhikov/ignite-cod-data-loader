
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.CardToDepoTo;

 import ru.sbt.kmdtransform.TransformType.*;

 public class CardToDepoToBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         CardToDepoTo r = new CardToDepoTo();
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

     @Override public int compare(Object first, Object second) {
         CardToDepoTo f = (CardToDepoTo)first;
         CardToDepoTo s = (CardToDepoTo)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.productParty_DPL_id, s.productParty_DPL_id) != 0) return CompareUtils.compare(f.productParty_DPL_id, s.productParty_DPL_id);
if (CompareUtils.compare(f.prcntBranchno, s.prcntBranchno) != 0) return CompareUtils.compare(f.prcntBranchno, s.prcntBranchno);
if (CompareUtils.compare(f.prcntCardto, s.prcntCardto) != 0) return CompareUtils.compare(f.prcntCardto, s.prcntCardto);
if (CompareUtils.compare(f.prcntClerk, s.prcntClerk) != 0) return CompareUtils.compare(f.prcntClerk, s.prcntClerk);
if (CompareUtils.compare(f.prcntDay, s.prcntDay) != 0) return CompareUtils.compare(f.prcntDay, s.prcntDay);
if (CompareUtils.compare(f.prcntDepoto, s.prcntDepoto) != 0) return CompareUtils.compare(f.prcntDepoto, s.prcntDepoto);
if (CompareUtils.compare(f.prcntTb, s.prcntTb) != 0) return CompareUtils.compare(f.prcntTb, s.prcntTb);
if (CompareUtils.compare(f.prcntJrnno, s.prcntJrnno) != 0) return CompareUtils.compare(f.prcntJrnno, s.prcntJrnno);
if (CompareUtils.compare(f.prcntOffice, s.prcntOffice) != 0) return CompareUtils.compare(f.prcntOffice, s.prcntOffice);
if (CompareUtils.compare(f.prcntState, s.prcntState) != 0) return CompareUtils.compare(f.prcntState, s.prcntState);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
