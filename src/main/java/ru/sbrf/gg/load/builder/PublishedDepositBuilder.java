
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedDepositBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.extension.PublishedDeposit r = new com.sbt.cdm.api.model.extension.PublishedDeposit();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.productParty_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.deporelationFlagKred = DelimetedStringParser.bool(4, line, indexes);
r.deporelationTypeRec = DelimetedStringParser._long(5, line, indexes);
r.depositAccount = DelimetedStringParser.str(6, line, indexes);
r.depositAddstate = DelimetedStringParser._long(7, line, indexes);
r.depositAllhistflag = DelimetedStringParser._long(8, line, indexes);
r.depositAloneopno = DelimetedStringParser._long(9, line, indexes);
r.depositArreststate = DelimetedStringParser._long(10, line, indexes);
r.depositAssignday = DelimetedStringParser.date(11, line, indexes);
r.depositAssminbalance = DelimetedStringParser.bigDecimal(12, line, indexes);
r.depositSubsidy = DelimetedStringParser.bigDecimal(13, line, indexes);
r.depositInterest = DelimetedStringParser.bigDecimal(14, line, indexes);
r.deposit_branchno = DelimetedStringParser._int(15, line, indexes);
r.depositCapitalday = DelimetedStringParser.date(16, line, indexes);
r.depositCaptured = DelimetedStringParser.str(17, line, indexes);
r.depositCapyear = DelimetedStringParser._long(18, line, indexes);
r.depositCashsource = DelimetedStringParser._int(19, line, indexes);
r.depositClientkind = DelimetedStringParser._long(20, line, indexes);
r.depositCurrency = DelimetedStringParser._long(21, line, indexes);
r.depositDebtflag = DelimetedStringParser.bool(22, line, indexes);
r.depositDepoflags = DelimetedStringParser._long(23, line, indexes);
r.depositDepositrate = DelimetedStringParser.bigDecimal(24, line, indexes);
r.depositDirty = DelimetedStringParser.bool(25, line, indexes);
r.depositExpminbalance = DelimetedStringParser.bigDecimal(26, line, indexes);
r.depositIsExprOverdraft = DelimetedStringParser.bigDecimal(27, line, indexes);
r.depositExprOverdraftInt = DelimetedStringParser.bigDecimal(28, line, indexes);
r.depositFirsttwoday = DelimetedStringParser.date(29, line, indexes);
r.deposit_tb = DelimetedStringParser._int(30, line, indexes);
r.depositIsInterestF = DelimetedStringParser.bigDecimal(31, line, indexes);
r.depositIsProlongation = DelimetedStringParser.bool(32, line, indexes);
r.depositKind = DelimetedStringParser._long(33, line, indexes);
r.depositLastkeykind = DelimetedStringParser._long(34, line, indexes);
r.depositLastopno = DelimetedStringParser._int(35, line, indexes);
r.depositLastvisitday = DelimetedStringParser.date(36, line, indexes);
r.depositLegacy = DelimetedStringParser.bigDecimal(37, line, indexes);
r.depositLossRights = DelimetedStringParser.bool(38, line, indexes);
r.depositMaxamount = DelimetedStringParser.bigDecimal(39, line, indexes);
r.depositMaxamountrate = DelimetedStringParser.bigDecimal(40, line, indexes);
r.depositMaxoptransday = DelimetedStringParser.date(41, line, indexes);
r.depositMbranchallowed = DelimetedStringParser._long(42, line, indexes);
r.depositMbranchdefault = DelimetedStringParser._long(43, line, indexes);
r.depositOffice = DelimetedStringParser._int(44, line, indexes);
r.depositOpcash = DelimetedStringParser.bigDecimal(45, line, indexes);
r.depositOpcashrezerv = DelimetedStringParser.bigDecimal(46, line, indexes);
r.depositOpday = DelimetedStringParser.date(47, line, indexes);
r.depositOpencash = DelimetedStringParser.bigDecimal(48, line, indexes);
r.depositOpencontrol = DelimetedStringParser._long(49, line, indexes);
r.depositOpenkind = DelimetedStringParser._long(50, line, indexes);
r.depositOpkind = DelimetedStringParser._int(51, line, indexes);
r.depositOpno = DelimetedStringParser._int(52, line, indexes);
r.depositOptransday = DelimetedStringParser.date(53, line, indexes);
r.depositMinBalanceMonth = DelimetedStringParser.bigDecimal(54, line, indexes);
r.depositBalanceOwnProlong = DelimetedStringParser.bigDecimal(55, line, indexes);
r.depositIsOverdraft = DelimetedStringParser.bigDecimal(56, line, indexes);
r.depositOverdraftInt = DelimetedStringParser.bigDecimal(57, line, indexes);
r.depositP39cashprev = DelimetedStringParser.bigDecimal(58, line, indexes);
r.depositP39cashyear = DelimetedStringParser.bigDecimal(59, line, indexes);
r.depositP39day = DelimetedStringParser.date(60, line, indexes);
r.depositP39dayprev = DelimetedStringParser.date(61, line, indexes);
r.depositPartrate = DelimetedStringParser.bigDecimal(62, line, indexes);
r.depositPassword = DelimetedStringParser.str(63, line, indexes);
r.depositPasswordno = DelimetedStringParser._long(64, line, indexes);
r.depositPayrollday = DelimetedStringParser.date(65, line, indexes);
r.depositPayAddFirst = DelimetedStringParser.date(66, line, indexes);
r.depositPercentsrate = DelimetedStringParser.bigDecimal(67, line, indexes);
r.depositPermflags = DelimetedStringParser._long(68, line, indexes);
r.depositProlongday = DelimetedStringParser.date(69, line, indexes);
r.depositRatesource = DelimetedStringParser._long(70, line, indexes);
r.depositResident = DelimetedStringParser._long(71, line, indexes);
r.depositRsvdepo = DelimetedStringParser.str(72, line, indexes);
r.depositState = DelimetedStringParser._int(73, line, indexes);
r.depositSubkind = DelimetedStringParser._long(74, line, indexes);
r.depositSubscribers = DelimetedStringParser._long(75, line, indexes);
r.depositTerm = DelimetedStringParser._long(76, line, indexes);
r.depositTermsok = DelimetedStringParser._int(77, line, indexes);
r.depositTxbranchno = DelimetedStringParser._long(78, line, indexes);
r.depositTxclerk = DelimetedStringParser._long(79, line, indexes);
r.depositTxoffice = DelimetedStringParser._long(80, line, indexes);
r.depositTxopcnt = DelimetedStringParser._long(81, line, indexes);
r.depositVServ = DelimetedStringParser._long(82, line, indexes);
r.metalDepositOmsMode = DelimetedStringParser._long(83, line, indexes);
r.depositLastkey = DelimetedStringParser._long(84, line, indexes);
r.depositOprow = DelimetedStringParser._long(85, line, indexes);
r.DepositAtSubscribeAccnt = DelimetedStringParser.str(86, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(87, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(88, line, indexes);

         return r;
     }
 }

