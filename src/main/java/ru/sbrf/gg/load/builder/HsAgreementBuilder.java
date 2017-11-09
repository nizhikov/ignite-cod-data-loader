
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.HsAgreement;

 import ru.sbt.kmdtransform.TransformType.*;

 public class HsAgreementBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         HsAgreement r = new HsAgreement();
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

     @Override public int compare(Object first, Object second) {
         HsAgreement f = (HsAgreement)first;
         HsAgreement s = (HsAgreement)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.docInst_DPL_id, s.docInst_DPL_id) != 0) return CompareUtils.compare(f.docInst_DPL_id, s.docInst_DPL_id);
if (CompareUtils.compare(f.agreementSum, s.agreementSum) != 0) return CompareUtils.compare(f.agreementSum, s.agreementSum);
if (CompareUtils.compare(f.area, s.area) != 0) return CompareUtils.compare(f.area, s.area);
if (CompareUtils.compare(f.certificateBy, s.certificateBy) != 0) return CompareUtils.compare(f.certificateBy, s.certificateBy);
if (CompareUtils.compare(f.certificateDate, s.certificateDate) != 0) return CompareUtils.compare(f.certificateDate, s.certificateDate);
if (CompareUtils.compare(f.certificateNo, s.certificateNo) != 0) return CompareUtils.compare(f.certificateNo, s.certificateNo);
if (CompareUtils.compare(f.town, s.town) != 0) return CompareUtils.compare(f.town, s.town);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
