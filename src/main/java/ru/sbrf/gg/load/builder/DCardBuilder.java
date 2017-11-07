
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class DCardBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.DCard r = new com.sbt.cdm.model.extension.deposit.DCard();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.plasticCardInst_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.dcardAircode = DelimetedStringParser.str(4, line, indexes);
r.dcardAirnumber = DelimetedStringParser.str(5, line, indexes);
r.dcardAutopaymentState = DelimetedStringParser._long(6, line, indexes);
r.dcardAutopaymentSumma = DelimetedStringParser.bigDecimal(7, line, indexes);
r.dcardBlockcode = DelimetedStringParser._long(8, line, indexes);
r.dcardBlockdate = DelimetedStringParser.date(9, line, indexes);
r.dcard_branchno = DelimetedStringParser._long(10, line, indexes);
r.dcardCardmadeenddate = DelimetedStringParser.date(11, line, indexes);
r.dcardCardmadeloaddate = DelimetedStringParser.date(12, line, indexes);
r.dcardCardmadenumber = DelimetedStringParser.str(13, line, indexes);
r.dcardChangeBranchno = DelimetedStringParser._long(14, line, indexes);
r.dcardChangeClerk = DelimetedStringParser._long(15, line, indexes);
r.dcardChangeDay = DelimetedStringParser.date(16, line, indexes);
r.dcardChangeOffice = DelimetedStringParser._long(17, line, indexes);
r.dcardChangeType = DelimetedStringParser._long(18, line, indexes);
r.dcardClaimdate = DelimetedStringParser.date(19, line, indexes);
r.dcardClaimiask = DelimetedStringParser._long(20, line, indexes);
r.dcardClient = DelimetedStringParser._long(21, line, indexes);
r.dcardCodecard = DelimetedStringParser._long(22, line, indexes);
r.dcardCodefortariff = DelimetedStringParser._long(23, line, indexes);
r.dcardCodetariffchange = DelimetedStringParser._long(24, line, indexes);
r.dcardContrdate = DelimetedStringParser.date(25, line, indexes);
r.dcardCurissue = DelimetedStringParser._long(26, line, indexes);
r.dcardDaylimcard = DelimetedStringParser.bigDecimal(27, line, indexes);
r.dcardDepokind = DelimetedStringParser._long(28, line, indexes);
r.dcardDeposubkind = DelimetedStringParser._long(29, line, indexes);
r.dcardDrn = DelimetedStringParser.str(30, line, indexes);
r.dcardEndcontrdate = DelimetedStringParser.date(31, line, indexes);
r.dcardHashcard = DelimetedStringParser.str(32, line, indexes);
r.dcardHelpdate = DelimetedStringParser.date(33, line, indexes);
r.dcardHoldercode = DelimetedStringParser._long(34, line, indexes);
r.dcard_tb = DelimetedStringParser._long(35, line, indexes);
r.dcardInsurcard = DelimetedStringParser.bigDecimal(36, line, indexes);
r.dcardIschange = DelimetedStringParser._long(37, line, indexes);
r.dcardIsclnpresent = DelimetedStringParser._long(38, line, indexes);
r.dcardIssalary = DelimetedStringParser._long(39, line, indexes);
r.dcardIssueby = DelimetedStringParser._long(40, line, indexes);
r.dcardIsvip = DelimetedStringParser._long(41, line, indexes);
r.dcardLimcard = DelimetedStringParser.bigDecimal(42, line, indexes);
r.dcardMarklock = DelimetedStringParser._long(43, line, indexes);
r.dcardMarklockdate = DelimetedStringParser.date(44, line, indexes);
r.dcardMarklockstr = DelimetedStringParser.str(45, line, indexes);
r.dcardMbOperator = DelimetedStringParser._long(46, line, indexes);
r.dcardMbPhone = DelimetedStringParser.str(47, line, indexes);
r.dcardMbType = DelimetedStringParser._long(48, line, indexes);
r.dcardMonthlimcard = DelimetedStringParser.bigDecimal(49, line, indexes);
r.dcardNumbancard = DelimetedStringParser._long(50, line, indexes);
r.dcardNumcard = DelimetedStringParser.str(51, line, indexes);
r.dcardNumcardclaim = DelimetedStringParser.str(52, line, indexes);
r.dcardNumcardold = DelimetedStringParser.str(53, line, indexes);
r.dcardNumcontrcard = DelimetedStringParser._long(54, line, indexes);
r.dcardNumpaycard = DelimetedStringParser._long(55, line, indexes);
r.dcardOffice = DelimetedStringParser._long(56, line, indexes);
r.dcardOverdraft = DelimetedStringParser.bigDecimal(57, line, indexes);
r.dcardPayissue = DelimetedStringParser.bigDecimal(58, line, indexes);
r.dcardPresenceallow = DelimetedStringParser._long(59, line, indexes);
r.dcardPresenceclaim = DelimetedStringParser._long(60, line, indexes);
r.dcardQuaopercard = DelimetedStringParser._long(61, line, indexes);
r.dcardReasonchange = DelimetedStringParser._long(62, line, indexes);
r.dcardReturndate = DelimetedStringParser.date(63, line, indexes);
r.dcardRptallow = DelimetedStringParser._long(64, line, indexes);
r.dcardRptinternet = DelimetedStringParser._long(65, line, indexes);
r.dcardRptpost = DelimetedStringParser._long(66, line, indexes);
r.dcardSin = DelimetedStringParser.str(67, line, indexes);
r.dcardSnils = DelimetedStringParser.str(68, line, indexes);
r.dcardSubcard = DelimetedStringParser._long(69, line, indexes);
r.dcardSumbancard = DelimetedStringParser.bigDecimal(70, line, indexes);
r.dcardSumpaycard = DelimetedStringParser.bigDecimal(71, line, indexes);
r.dcardTariffservcur = DelimetedStringParser.bigDecimal(72, line, indexes);
r.dcardTariffservnext = DelimetedStringParser.bigDecimal(73, line, indexes);
r.dcardTextcontrol = DelimetedStringParser.str(74, line, indexes);
r.dcardTypeSbnkd = DelimetedStringParser._long(75, line, indexes);
r.dcardTypecard = DelimetedStringParser._long(76, line, indexes);
r.dcardUecClaimNumber = DelimetedStringParser.str(77, line, indexes);
r.dcardUecClaimSeries = DelimetedStringParser.str(78, line, indexes);
r.dcardUsebio = DelimetedStringParser._long(79, line, indexes);
r.dcardUsepin = DelimetedStringParser._long(80, line, indexes);
r.dcardDcardMain = DelimetedStringParser._long(81, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(82, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(83, line, indexes);

         return r;
     }
 }
            
