
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.Accreditive;

 import ru.sbt.kmdtransform.TransformType.*;

 public class AccreditiveBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         Accreditive r = new Accreditive();
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

     @Override public int compare(Object first, Object second) {
         Accreditive f = (Accreditive)first;
         Accreditive s = (Accreditive)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.docInst_DPL_id, s.docInst_DPL_id) != 0) return CompareUtils.compare(f.docInst_DPL_id, s.docInst_DPL_id);
if (CompareUtils.compare(f.accreditivePayDocNo, s.accreditivePayDocNo) != 0) return CompareUtils.compare(f.accreditivePayDocNo, s.accreditivePayDocNo);
if (CompareUtils.compare(f.accreditivePayDocDate, s.accreditivePayDocDate) != 0) return CompareUtils.compare(f.accreditivePayDocDate, s.accreditivePayDocDate);
if (CompareUtils.compare(f.accreditivePayerAccount, s.accreditivePayerAccount) != 0) return CompareUtils.compare(f.accreditivePayerAccount, s.accreditivePayerAccount);
if (CompareUtils.compare(f.accreditivePayeeAccount, s.accreditivePayeeAccount) != 0) return CompareUtils.compare(f.accreditivePayeeAccount, s.accreditivePayeeAccount);
if (CompareUtils.compare(f.accreditiveAccrSum, s.accreditiveAccrSum) != 0) return CompareUtils.compare(f.accreditiveAccrSum, s.accreditiveAccrSum);
if (CompareUtils.compare(f.accreditivePlClosedate, s.accreditivePlClosedate) != 0) return CompareUtils.compare(f.accreditivePlClosedate, s.accreditivePlClosedate);
if (CompareUtils.compare(f.accreditiveActClosedate, s.accreditiveActClosedate) != 0) return CompareUtils.compare(f.accreditiveActClosedate, s.accreditiveActClosedate);
if (CompareUtils.compare(f.accreditiveDepositAccount, s.accreditiveDepositAccount) != 0) return CompareUtils.compare(f.accreditiveDepositAccount, s.accreditiveDepositAccount);
if (CompareUtils.compare(f.accreditiveOffBalAccount, s.accreditiveOffBalAccount) != 0) return CompareUtils.compare(f.accreditiveOffBalAccount, s.accreditiveOffBalAccount);
if (CompareUtils.compare(f.accreditiveStatus, s.accreditiveStatus) != 0) return CompareUtils.compare(f.accreditiveStatus, s.accreditiveStatus);
if (CompareUtils.compare(f.accreditiveLetterNo, s.accreditiveLetterNo) != 0) return CompareUtils.compare(f.accreditiveLetterNo, s.accreditiveLetterNo);
if (CompareUtils.compare(f.accreditiveBranch, s.accreditiveBranch) != 0) return CompareUtils.compare(f.accreditiveBranch, s.accreditiveBranch);
if (CompareUtils.compare(f.accreditiveOffice, s.accreditiveOffice) != 0) return CompareUtils.compare(f.accreditiveOffice, s.accreditiveOffice);
if (CompareUtils.compare(f.accreditiveCreateDate, s.accreditiveCreateDate) != 0) return CompareUtils.compare(f.accreditiveCreateDate, s.accreditiveCreateDate);
if (CompareUtils.compare(f.accreditiveReserveId, s.accreditiveReserveId) != 0) return CompareUtils.compare(f.accreditiveReserveId, s.accreditiveReserveId);
if (CompareUtils.compare(f.accreditivePurpose, s.accreditivePurpose) != 0) return CompareUtils.compare(f.accreditivePurpose, s.accreditivePurpose);
if (CompareUtils.compare(f.accreditivePaymentDoc, s.accreditivePaymentDoc) != 0) return CompareUtils.compare(f.accreditivePaymentDoc, s.accreditivePaymentDoc);
if (CompareUtils.compare(f.accreditivePaymentCond, s.accreditivePaymentCond) != 0) return CompareUtils.compare(f.accreditivePaymentCond, s.accreditivePaymentCond);
if (CompareUtils.compare(f.accreditiveAddCond, s.accreditiveAddCond) != 0) return CompareUtils.compare(f.accreditiveAddCond, s.accreditiveAddCond);
if (CompareUtils.compare(f.accreditiveAccreditiveType, s.accreditiveAccreditiveType) != 0) return CompareUtils.compare(f.accreditiveAccreditiveType, s.accreditiveAccreditiveType);
if (CompareUtils.compare(f.accreditivePayeeName, s.accreditivePayeeName) != 0) return CompareUtils.compare(f.accreditivePayeeName, s.accreditivePayeeName);
if (CompareUtils.compare(f.accreditivePayeeInn, s.accreditivePayeeInn) != 0) return CompareUtils.compare(f.accreditivePayeeInn, s.accreditivePayeeInn);
if (CompareUtils.compare(f.accreditiveGarageAddress, s.accreditiveGarageAddress) != 0) return CompareUtils.compare(f.accreditiveGarageAddress, s.accreditiveGarageAddress);
if (CompareUtils.compare(f.accreditiveContractNumber, s.accreditiveContractNumber) != 0) return CompareUtils.compare(f.accreditiveContractNumber, s.accreditiveContractNumber);
if (CompareUtils.compare(f.accreditiveContractDate, s.accreditiveContractDate) != 0) return CompareUtils.compare(f.accreditiveContractDate, s.accreditiveContractDate);
if (CompareUtils.compare(f.accreditivePayeeKpp, s.accreditivePayeeKpp) != 0) return CompareUtils.compare(f.accreditivePayeeKpp, s.accreditivePayeeKpp);
if (CompareUtils.compare(f.accreditiveProlongationDate, s.accreditiveProlongationDate) != 0) return CompareUtils.compare(f.accreditiveProlongationDate, s.accreditiveProlongationDate);
if (CompareUtils.compare(f.accreditiveCoverageType, s.accreditiveCoverageType) != 0) return CompareUtils.compare(f.accreditiveCoverageType, s.accreditiveCoverageType);
if (CompareUtils.compare(f.accreditivePaymentDocNew, s.accreditivePaymentDocNew) != 0) return CompareUtils.compare(f.accreditivePaymentDocNew, s.accreditivePaymentDocNew);
if (CompareUtils.compare(f.accreditiveIsActual, s.accreditiveIsActual) != 0) return CompareUtils.compare(f.accreditiveIsActual, s.accreditiveIsActual);
if (CompareUtils.compare(f.accreditiveChangeDate, s.accreditiveChangeDate) != 0) return CompareUtils.compare(f.accreditiveChangeDate, s.accreditiveChangeDate);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
