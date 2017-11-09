
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.HistSBookNo;

 import ru.sbt.kmdtransform.TransformType.*;

 public class HistSBookNoBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         HistSBookNo r = new HistSBookNo();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operationRun_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.sbookBalance = DelimetedStringParser.bigDecimal(4, line, indexes);
r.sbook_branchno = DelimetedStringParser._long(5, line, indexes);
r.sbookCancelClerk = DelimetedStringParser._long(6, line, indexes);
r.sbookCancelDate = DelimetedStringParser.date(7, line, indexes);
r.sbookCancelFirstnameClerk = DelimetedStringParser.str(8, line, indexes);
r.sbookCancelSecondnameClerk = DelimetedStringParser.str(9, line, indexes);
r.sbookCancelSurnameClerk = DelimetedStringParser.str(10, line, indexes);
r.sbookDateClose = DelimetedStringParser.date(11, line, indexes);
r.sbookDeclarationBranchno = DelimetedStringParser._long(12, line, indexes);
r.sbookDeclarationClerk = DelimetedStringParser._long(13, line, indexes);
r.sbookDeclarationDateLost = DelimetedStringParser.date(14, line, indexes);
r.sbookDeclarationFirstname = DelimetedStringParser.str(15, line, indexes);
r.sbookDeclarationKind = DelimetedStringParser._long(16, line, indexes);
r.sbookDeclarationNo = DelimetedStringParser.str(17, line, indexes);
r.sbookDeclarationOffice = DelimetedStringParser._long(18, line, indexes);
r.sbookDeclarationSecondname = DelimetedStringParser.str(19, line, indexes);
r.sbookDeclarationSurname = DelimetedStringParser.str(20, line, indexes);
r.sbookDeclarationValid = DelimetedStringParser._long(21, line, indexes);
r.sbookDocumentkind = DelimetedStringParser._long(22, line, indexes);
r.sbookDubleClerk = DelimetedStringParser._long(23, line, indexes);
r.sbookDubleDate = DelimetedStringParser.date(24, line, indexes);
r.sbookDubleFirstnameClerk = DelimetedStringParser.str(25, line, indexes);
r.sbookDubleSecondnameClerk = DelimetedStringParser.str(26, line, indexes);
r.sbookDubleSurnameClerk = DelimetedStringParser.str(27, line, indexes);
r.sbookKind = DelimetedStringParser._long(28, line, indexes);
r.sbookNo = DelimetedStringParser.str(29, line, indexes);
r.sbookPrintableno = DelimetedStringParser.str(30, line, indexes);
r.sbookPrintablenoNew = DelimetedStringParser.str(31, line, indexes);
r.sbookSbookno = DelimetedStringParser.str(32, line, indexes);
r.sbookSbooknoDuble = DelimetedStringParser.str(33, line, indexes);
r.sbookSeries = DelimetedStringParser.str(34, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(35, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(36, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         HistSBookNo f = (HistSBookNo)first;
         HistSBookNo s = (HistSBookNo)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id) != 0) return CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id);
if (CompareUtils.compare(f.sbookBalance, s.sbookBalance) != 0) return CompareUtils.compare(f.sbookBalance, s.sbookBalance);
if (CompareUtils.compare(f.sbook_branchno, s.sbook_branchno) != 0) return CompareUtils.compare(f.sbook_branchno, s.sbook_branchno);
if (CompareUtils.compare(f.sbookCancelClerk, s.sbookCancelClerk) != 0) return CompareUtils.compare(f.sbookCancelClerk, s.sbookCancelClerk);
if (CompareUtils.compare(f.sbookCancelDate, s.sbookCancelDate) != 0) return CompareUtils.compare(f.sbookCancelDate, s.sbookCancelDate);
if (CompareUtils.compare(f.sbookCancelFirstnameClerk, s.sbookCancelFirstnameClerk) != 0) return CompareUtils.compare(f.sbookCancelFirstnameClerk, s.sbookCancelFirstnameClerk);
if (CompareUtils.compare(f.sbookCancelSecondnameClerk, s.sbookCancelSecondnameClerk) != 0) return CompareUtils.compare(f.sbookCancelSecondnameClerk, s.sbookCancelSecondnameClerk);
if (CompareUtils.compare(f.sbookCancelSurnameClerk, s.sbookCancelSurnameClerk) != 0) return CompareUtils.compare(f.sbookCancelSurnameClerk, s.sbookCancelSurnameClerk);
if (CompareUtils.compare(f.sbookDateClose, s.sbookDateClose) != 0) return CompareUtils.compare(f.sbookDateClose, s.sbookDateClose);
if (CompareUtils.compare(f.sbookDeclarationBranchno, s.sbookDeclarationBranchno) != 0) return CompareUtils.compare(f.sbookDeclarationBranchno, s.sbookDeclarationBranchno);
if (CompareUtils.compare(f.sbookDeclarationClerk, s.sbookDeclarationClerk) != 0) return CompareUtils.compare(f.sbookDeclarationClerk, s.sbookDeclarationClerk);
if (CompareUtils.compare(f.sbookDeclarationDateLost, s.sbookDeclarationDateLost) != 0) return CompareUtils.compare(f.sbookDeclarationDateLost, s.sbookDeclarationDateLost);
if (CompareUtils.compare(f.sbookDeclarationFirstname, s.sbookDeclarationFirstname) != 0) return CompareUtils.compare(f.sbookDeclarationFirstname, s.sbookDeclarationFirstname);
if (CompareUtils.compare(f.sbookDeclarationKind, s.sbookDeclarationKind) != 0) return CompareUtils.compare(f.sbookDeclarationKind, s.sbookDeclarationKind);
if (CompareUtils.compare(f.sbookDeclarationNo, s.sbookDeclarationNo) != 0) return CompareUtils.compare(f.sbookDeclarationNo, s.sbookDeclarationNo);
if (CompareUtils.compare(f.sbookDeclarationOffice, s.sbookDeclarationOffice) != 0) return CompareUtils.compare(f.sbookDeclarationOffice, s.sbookDeclarationOffice);
if (CompareUtils.compare(f.sbookDeclarationSecondname, s.sbookDeclarationSecondname) != 0) return CompareUtils.compare(f.sbookDeclarationSecondname, s.sbookDeclarationSecondname);
if (CompareUtils.compare(f.sbookDeclarationSurname, s.sbookDeclarationSurname) != 0) return CompareUtils.compare(f.sbookDeclarationSurname, s.sbookDeclarationSurname);
if (CompareUtils.compare(f.sbookDeclarationValid, s.sbookDeclarationValid) != 0) return CompareUtils.compare(f.sbookDeclarationValid, s.sbookDeclarationValid);
if (CompareUtils.compare(f.sbookDocumentkind, s.sbookDocumentkind) != 0) return CompareUtils.compare(f.sbookDocumentkind, s.sbookDocumentkind);
if (CompareUtils.compare(f.sbookDubleClerk, s.sbookDubleClerk) != 0) return CompareUtils.compare(f.sbookDubleClerk, s.sbookDubleClerk);
if (CompareUtils.compare(f.sbookDubleDate, s.sbookDubleDate) != 0) return CompareUtils.compare(f.sbookDubleDate, s.sbookDubleDate);
if (CompareUtils.compare(f.sbookDubleFirstnameClerk, s.sbookDubleFirstnameClerk) != 0) return CompareUtils.compare(f.sbookDubleFirstnameClerk, s.sbookDubleFirstnameClerk);
if (CompareUtils.compare(f.sbookDubleSecondnameClerk, s.sbookDubleSecondnameClerk) != 0) return CompareUtils.compare(f.sbookDubleSecondnameClerk, s.sbookDubleSecondnameClerk);
if (CompareUtils.compare(f.sbookDubleSurnameClerk, s.sbookDubleSurnameClerk) != 0) return CompareUtils.compare(f.sbookDubleSurnameClerk, s.sbookDubleSurnameClerk);
if (CompareUtils.compare(f.sbookKind, s.sbookKind) != 0) return CompareUtils.compare(f.sbookKind, s.sbookKind);
if (CompareUtils.compare(f.sbookNo, s.sbookNo) != 0) return CompareUtils.compare(f.sbookNo, s.sbookNo);
if (CompareUtils.compare(f.sbookPrintableno, s.sbookPrintableno) != 0) return CompareUtils.compare(f.sbookPrintableno, s.sbookPrintableno);
if (CompareUtils.compare(f.sbookPrintablenoNew, s.sbookPrintablenoNew) != 0) return CompareUtils.compare(f.sbookPrintablenoNew, s.sbookPrintablenoNew);
if (CompareUtils.compare(f.sbookSbookno, s.sbookSbookno) != 0) return CompareUtils.compare(f.sbookSbookno, s.sbookSbookno);
if (CompareUtils.compare(f.sbookSbooknoDuble, s.sbookSbooknoDuble) != 0) return CompareUtils.compare(f.sbookSbooknoDuble, s.sbookSbooknoDuble);
if (CompareUtils.compare(f.sbookSeries, s.sbookSeries) != 0) return CompareUtils.compare(f.sbookSeries, s.sbookSeries);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
