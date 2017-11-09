
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.Edbo;

 import ru.sbt.kmdtransform.TransformType.*;

 public class EdboBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         Edbo r = new Edbo();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.agreementInst_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.edboBranchNo = DelimetedStringParser._long(4, line, indexes);
r.edboClerkKod = DelimetedStringParser._long(5, line, indexes);
r.edboFormBranch = DelimetedStringParser._long(6, line, indexes);
r.edboEmail = DelimetedStringParser.str(7, line, indexes);
r.edboTb = DelimetedStringParser._long(8, line, indexes);
r.edboMobOper = DelimetedStringParser.str(9, line, indexes);
r.edboMobPhone = DelimetedStringParser.str(10, line, indexes);
r.edboOffice = DelimetedStringParser._long(11, line, indexes);
r.edboPhone = DelimetedStringParser.str(12, line, indexes);
r.edboState = DelimetedStringParser._long(13, line, indexes);
r.edboTypeMessage = DelimetedStringParser._long(14, line, indexes);
r.edboTypeSbnkd = DelimetedStringParser._long(15, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(16, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(17, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         Edbo f = (Edbo)first;
         Edbo s = (Edbo)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.agreementInst_DPL_id, s.agreementInst_DPL_id) != 0) return CompareUtils.compare(f.agreementInst_DPL_id, s.agreementInst_DPL_id);
if (CompareUtils.compare(f.edboBranchNo, s.edboBranchNo) != 0) return CompareUtils.compare(f.edboBranchNo, s.edboBranchNo);
if (CompareUtils.compare(f.edboClerkKod, s.edboClerkKod) != 0) return CompareUtils.compare(f.edboClerkKod, s.edboClerkKod);
if (CompareUtils.compare(f.edboFormBranch, s.edboFormBranch) != 0) return CompareUtils.compare(f.edboFormBranch, s.edboFormBranch);
if (CompareUtils.compare(f.edboEmail, s.edboEmail) != 0) return CompareUtils.compare(f.edboEmail, s.edboEmail);
if (CompareUtils.compare(f.edboTb, s.edboTb) != 0) return CompareUtils.compare(f.edboTb, s.edboTb);
if (CompareUtils.compare(f.edboMobOper, s.edboMobOper) != 0) return CompareUtils.compare(f.edboMobOper, s.edboMobOper);
if (CompareUtils.compare(f.edboMobPhone, s.edboMobPhone) != 0) return CompareUtils.compare(f.edboMobPhone, s.edboMobPhone);
if (CompareUtils.compare(f.edboOffice, s.edboOffice) != 0) return CompareUtils.compare(f.edboOffice, s.edboOffice);
if (CompareUtils.compare(f.edboPhone, s.edboPhone) != 0) return CompareUtils.compare(f.edboPhone, s.edboPhone);
if (CompareUtils.compare(f.edboState, s.edboState) != 0) return CompareUtils.compare(f.edboState, s.edboState);
if (CompareUtils.compare(f.edboTypeMessage, s.edboTypeMessage) != 0) return CompareUtils.compare(f.edboTypeMessage, s.edboTypeMessage);
if (CompareUtils.compare(f.edboTypeSbnkd, s.edboTypeSbnkd) != 0) return CompareUtils.compare(f.edboTypeSbnkd, s.edboTypeSbnkd);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
