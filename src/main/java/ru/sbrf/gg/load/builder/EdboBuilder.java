
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class EdboBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.Edbo r = new com.sbt.cdm.model.extension.deposit.Edbo();
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
 }
            
