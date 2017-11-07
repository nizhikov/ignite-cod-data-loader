
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class HistSBookNoBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.HistSBookNo r = new com.sbt.cdm.model.extension.deposit.HistSBookNo();
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
 }
            
