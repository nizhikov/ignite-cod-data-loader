
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class HsAgreementBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.HsAgreement r = new com.sbt.cdm.model.extension.deposit.HsAgreement();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.docInst_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.agreementSum = DelimetedStringParser.bigDecimal(4, line, indexes);
r.area = DelimetedStringParser.bigDecimal(5, line, indexes);
r.certificateBy = DelimetedStringParser.str(6, line, indexes);
r.certificateDate = DelimetedStringParser.date(7, line, indexes);
r.certificateNo = DelimetedStringParser.str(8, line, indexes);
r.town = DelimetedStringParser.str(9, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(12, line, indexes);

         return r;
     }
 }
            
