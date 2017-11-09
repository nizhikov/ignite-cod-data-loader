
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.extension.PublishedHsDeposit;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedHsDepositBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedHsDeposit r = new PublishedHsDeposit();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.agrSeries = DelimetedStringParser.str(4, line, indexes);
r.agreements = DelimetedStringParser.str(5, line, indexes);
r.authority = DelimetedStringParser.str(6, line, indexes);
r.hsdeposit_tb = DelimetedStringParser._long(7, line, indexes);
r.otherAccount = DelimetedStringParser.str(8, line, indexes);
r.procCount = DelimetedStringParser.bigDecimal(9, line, indexes);
r.state = DelimetedStringParser._long(10, line, indexes);
r.subsidyAmount = DelimetedStringParser.bigDecimal(11, line, indexes);
r.subsidyAmountUsd = DelimetedStringParser.bigDecimal(12, line, indexes);
r.type = DelimetedStringParser._long(13, line, indexes);
r.otherAccountBranch = DelimetedStringParser._long(14, line, indexes);
r.otherAccountOffice = DelimetedStringParser._long(15, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(16, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(17, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(18, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedHsDeposit f = (PublishedHsDeposit)first;
         PublishedHsDeposit s = (PublishedHsDeposit)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id) != 0) return CompareUtils.compare(f.contract_DPL_id, s.contract_DPL_id);
if (CompareUtils.compare(f.agrSeries, s.agrSeries) != 0) return CompareUtils.compare(f.agrSeries, s.agrSeries);
if (CompareUtils.compare(f.agreements, s.agreements) != 0) return CompareUtils.compare(f.agreements, s.agreements);
if (CompareUtils.compare(f.authority, s.authority) != 0) return CompareUtils.compare(f.authority, s.authority);
if (CompareUtils.compare(f.hsdeposit_tb, s.hsdeposit_tb) != 0) return CompareUtils.compare(f.hsdeposit_tb, s.hsdeposit_tb);
if (CompareUtils.compare(f.otherAccount, s.otherAccount) != 0) return CompareUtils.compare(f.otherAccount, s.otherAccount);
if (CompareUtils.compare(f.procCount, s.procCount) != 0) return CompareUtils.compare(f.procCount, s.procCount);
if (CompareUtils.compare(f.state, s.state) != 0) return CompareUtils.compare(f.state, s.state);
if (CompareUtils.compare(f.subsidyAmount, s.subsidyAmount) != 0) return CompareUtils.compare(f.subsidyAmount, s.subsidyAmount);
if (CompareUtils.compare(f.subsidyAmountUsd, s.subsidyAmountUsd) != 0) return CompareUtils.compare(f.subsidyAmountUsd, s.subsidyAmountUsd);
if (CompareUtils.compare(f.type, s.type) != 0) return CompareUtils.compare(f.type, s.type);
if (CompareUtils.compare(f.otherAccountBranch, s.otherAccountBranch) != 0) return CompareUtils.compare(f.otherAccountBranch, s.otherAccountBranch);
if (CompareUtils.compare(f.otherAccountOffice, s.otherAccountOffice) != 0) return CompareUtils.compare(f.otherAccountOffice, s.otherAccountOffice);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
