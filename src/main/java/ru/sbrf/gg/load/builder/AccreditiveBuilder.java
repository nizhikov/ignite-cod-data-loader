
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class AccreditiveBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.Accreditive r = new com.sbt.cdm.model.extension.deposit.Accreditive();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.docInst_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.accreditivePayDocNo = DelimetedStringParser.str(4, line, indexes);
r.accreditivePayDocDate = DelimetedStringParser.date(5, line, indexes);
r.accreditivePayerAccount = DelimetedStringParser.str(6, line, indexes);
r.accreditivePayeeAccount = DelimetedStringParser.str(7, line, indexes);
r.accreditiveAccrSum = DelimetedStringParser.bigDecimal(8, line, indexes);
r.accreditivePlClosedate = DelimetedStringParser.date(9, line, indexes);
r.accreditiveActClosedate = DelimetedStringParser.date(10, line, indexes);
r.accreditiveDepositAccount = DelimetedStringParser.str(11, line, indexes);
r.accreditiveOffBalAccount = DelimetedStringParser.str(12, line, indexes);
r.accreditiveStatus = DelimetedStringParser._int(13, line, indexes);
r.accreditiveLetterNo = DelimetedStringParser.str(14, line, indexes);
r.accreditiveBranch = DelimetedStringParser._long(15, line, indexes);
r.accreditiveOffice = DelimetedStringParser._long(16, line, indexes);
r.accreditiveCreateDate = DelimetedStringParser.date(17, line, indexes);
r.accreditiveReserveId = DelimetedStringParser._long(18, line, indexes);
r.accreditivePurpose = DelimetedStringParser.str(19, line, indexes);
r.accreditivePaymentDoc = DelimetedStringParser.str(20, line, indexes);
r.accreditivePaymentCond = DelimetedStringParser.str(21, line, indexes);
r.accreditiveAddCond = DelimetedStringParser.str(22, line, indexes);
r.accreditiveAccreditiveType = DelimetedStringParser._int(23, line, indexes);
r.accreditivePayeeName = DelimetedStringParser.str(24, line, indexes);
r.accreditivePayeeInn = DelimetedStringParser.str(25, line, indexes);
r.accreditiveGarageAddress = DelimetedStringParser.str(26, line, indexes);
r.accreditiveContractNumber = DelimetedStringParser.str(27, line, indexes);
r.accreditiveContractDate = DelimetedStringParser.date(28, line, indexes);
r.accreditivePayeeKpp = DelimetedStringParser.str(29, line, indexes);
r.accreditiveProlongationDate = DelimetedStringParser.date(30, line, indexes);
r.accreditiveCoverageType = DelimetedStringParser._int(31, line, indexes);
r.accreditivePaymentDocNew = DelimetedStringParser.str(32, line, indexes);
r.accreditiveIsActual = DelimetedStringParser._int(33, line, indexes);
r.accreditiveChangeDate = DelimetedStringParser.date(34, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(35, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(36, line, indexes);

         return r;
     }
 }
            
