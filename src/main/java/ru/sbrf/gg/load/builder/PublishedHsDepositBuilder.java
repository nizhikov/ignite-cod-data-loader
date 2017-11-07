
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedHsDepositBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.extension.PublishedHsDeposit r = new com.sbt.cdm.api.model.extension.PublishedHsDeposit();
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
 }

