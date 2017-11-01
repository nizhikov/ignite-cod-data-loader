/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.extension;

import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedDeposit {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;


    @OraName(value = "colocationKey")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    @PartField(value="true")
    public Long colocationKey;


    @OraName(value = "clientid")
    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    @RootField(value="true")
    public Long rootParticle_DPL_id;

    @DataType(value = TransformType.ROOT)
    @Default(value = "0")
    public Long affinityParent_DPL_id;

//    @OraName(value = "templateId")
//    @DataType(value = TransformType.LONG)
//    public Long templateId;

    @OraName(value = "productid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long productParty_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "productParty_DPL_id")
    @Default(value = "0")
    public Long productParty_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "productParty_DPL_id")
    @Default(value = "0")
    public Long productParty_DPL_rootId;

    @OraName(value = "R_FLAG_KRED")
    @InitOrder(value = "5")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean deporelationFlagKred;

    @OraName(value = "R_TYPE_REC")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public Long deporelationTypeRec;

    @OraName(value = "D_ACCOUNT")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String depositAccount;

    @OraName(value = "D_ADDSTATE")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    public Long depositAddstate;

    @OraName(value = "D_ALLHISTFLAG")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    public Long depositAllhistflag;

    @OraName(value = "D_ALONEOPNO")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public Long depositAloneopno;

    @OraName(value = "D_ARRESTSTATE")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long depositArreststate;

    @OraName(value = "D_ASSIGNDAY")
    @InitOrder(value = "12")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositAssignday;

    @OraName(value = "D_ASSMINBALANCE")
    @InitOrder(value = "13")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositAssminbalance;

    @OraName(value = "D_BALANCEF")
    @InitOrder(value = "14")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositSubsidy;

    @OraName(value = "D_INTEREST")
    @InitOrder(value = "15")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositInterest;

    @OraName(value = "D_BRANCHNO")
    @InitOrder(value = "16")
    @DataType(value = TransformType.INTEGER)
    public Integer deposit_branchno;

    @OraName(value = "D_CAPITALDAY")
    @InitOrder(value = "17")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositCapitalday;

    @OraName(value = "D_CAPTURED")
    @InitOrder(value = "18")
    @DataType(value = TransformType.STRING)
    public String depositCaptured;

    @OraName(value = "D_CAPYEAR")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long depositCapyear;

    @OraName(value = "D_CASHSOURCE")
    @InitOrder(value = "20")
    @DataType(value = TransformType.INTEGER)
    public Integer depositCashsource;

    @OraName(value = "D_CLIENTKIND")
    @InitOrder(value = "21")
    @DataType(value = TransformType.LONG)
    public Long depositClientkind;

    @OraName(value = "D_CURRENCY")
    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    public Long depositCurrency;

    @OraName(value = "D_DEBTFLAG")
    @InitOrder(value = "23")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean depositDebtflag;

    @OraName(value = "D_DEPOFLAGS")
    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long depositDepoflags;

    @OraName(value = "D_DEPOSITRATE")
    @InitOrder(value = "25")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositDepositrate;

    @OraName(value = "D_DIRTY")
    @InitOrder(value = "26")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean depositDirty;

    @OraName(value = "D_EXPMINBALANCE")
    @InitOrder(value = "27")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositExpminbalance;

    @OraName(value = "D_EXPROVERDRAFT")
    @InitOrder(value = "28")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositIsExprOverdraft;

    @OraName(value = "D_EXPROVERDRAFTINT")
    @InitOrder(value = "29")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositExprOverdraftInt;

    @OraName(value = "D_FIRSTTWODAY")
    @InitOrder(value = "30")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositFirsttwoday;

    @OraName(value = "D_ID_MEGA")
    @InitOrder(value = "31")
    @DataType(value = TransformType.INTEGER)
    public Integer deposit_tb;

    @OraName(value = "D_INTERESTF")
    @InitOrder(value = "32")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositIsInterestF;

    @OraName(value = "D_ISPROLONGATION")
    @InitOrder(value = "33")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean depositIsProlongation;

    @OraName(value = "D_KIND")
    @InitOrder(value = "34")
    @DataType(value = TransformType.LONG)
    public Long depositKind;

    @OraName(value = "D_LASTKEYKIND")
    @InitOrder(value = "35")
    @DataType(value = TransformType.LONG)
    public Long depositLastkeykind;

    @OraName(value = "D_LASTOPNO")
    @InitOrder(value = "36")
    @DataType(value = TransformType.INTEGER)
    public Integer depositLastopno;

    @OraName(value = "D_LASTVISITDAY")
    @InitOrder(value = "37")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositLastvisitday;

    @OraName(value = "D_LEGACY")
    @InitOrder(value = "38")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositLegacy;

    @OraName(value = "D_LOSS_RIGHTS")
    @InitOrder(value = "39")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean depositLossRights;

    @OraName(value = "D_MAXAMOUNT")
    @InitOrder(value = "40")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositMaxamount;

    @OraName(value = "D_MAXAMOUNTRATE")
    @InitOrder(value = "41")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositMaxamountrate;

    @OraName(value = "D_MAXOPTRANSDAY")
    @InitOrder(value = "42")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositMaxoptransday;

    @OraName(value = "D_MBRANCHALLOWED")
    @InitOrder(value = "43")
    @DataType(value = TransformType.LONG)
    public Long depositMbranchallowed;

    @OraName(value = "D_MBRANCHDEFAULT")
    @InitOrder(value = "44")
    @DataType(value = TransformType.LONG)
    public Long depositMbranchdefault;

    @OraName(value = "D_OFFICE")
    @InitOrder(value = "45")
    @DataType(value = TransformType.INTEGER)
    public Integer depositOffice;

    @OraName(value = "D_OPCASH")
    @InitOrder(value = "46")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositOpcash;

    @OraName(value = "D_OPCASHREZERV")
    @InitOrder(value = "47")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositOpcashrezerv;

    @OraName(value = "D_OPDAY")
    @InitOrder(value = "48")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositOpday;

    @OraName(value = "D_OPENCASH")
    @InitOrder(value = "49")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositOpencash;

    @OraName(value = "D_OPENCONTROL")
    @InitOrder(value = "50")
    @DataType(value = TransformType.LONG)
    public Long depositOpencontrol;

    @OraName(value = "D_OPENKIND")
    @InitOrder(value = "51")
    @DataType(value = TransformType.LONG)
    public Long depositOpenkind;

    @OraName(value = "D_OPKIND")
    @InitOrder(value = "52")
    @DataType(value = TransformType.INTEGER)
    public Integer depositOpkind;

    @OraName(value = "D_OPNO")
    @InitOrder(value = "53")
    @DataType(value = TransformType.INTEGER)
    public Integer depositOpno;

    @OraName(value = "D_OPTRANSDAY")
    @InitOrder(value = "54")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositOptransday;

    @OraName(value = "D_OVERDRAFT_MINBALANCEMONTH")
    @InitOrder(value = "55")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositMinBalanceMonth;

    @OraName(value = "D_OVERDRAFT_BALANCEOWNPROLONG")
    @InitOrder(value = "56")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositBalanceOwnProlong;

    @OraName(value = "D_OVERDRAFT")
    @InitOrder(value = "57")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositIsOverdraft;

    @OraName(value = "D_OVERDRAFTINT")
    @InitOrder(value = "58")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositOverdraftInt;

    @OraName(value = "D_P39CASHPREV")
    @InitOrder(value = "59")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositP39cashprev;

    @OraName(value = "D_P39CASHYEAR")
    @InitOrder(value = "60")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositP39cashyear;

    @OraName(value = "D_P39DAY")
    @InitOrder(value = "61")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositP39day;

    @OraName(value = "D_P39DAYPREV")
    @InitOrder(value = "62")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositP39dayprev;

    @OraName(value = "D_PARTRATE")
    @InitOrder(value = "63")
    @DataType(value = TransformType.INTEGER)
    public Integer depositPartrate;

    @OraName(value = "D_PASSWORD")
    @InitOrder(value = "64")
    @DataType(value = TransformType.STRING)
    public String depositPassword;

    @OraName(value = "D_PASSWORDNO")
    @InitOrder(value = "65")
    @DataType(value = TransformType.LONG)
    public Long depositPasswordno;

    @OraName(value = "D_PAYROLLDAY")
    @InitOrder(value = "66")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositPayrollday;

    @OraName(value = "D_PAYROLLDAY_PAYADDFIRST")
    @InitOrder(value = "67")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositPayAddFirst;

    @OraName(value = "D_PERCENTSRATE")
    @InitOrder(value = "68")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal depositPercentsrate;

    @OraName(value = "D_PERMFLAGS")
    @InitOrder(value = "69")
    @DataType(value = TransformType.LONG)
    public Long depositPermflags;

    @OraName(value = "D_PROLONGDAY")
    @InitOrder(value = "70")
    @DataType(value = TransformType.DATE_TIME)
    public Date depositProlongday;

    @OraName(value = "D_RATESOURCE")
    @InitOrder(value = "71")
    @DataType(value = TransformType.LONG)
    public Long depositRatesource;

    @OraName(value = "D_RESIDENT")
    @InitOrder(value = "72")
    @DataType(value = TransformType.LONG)
    public Long depositResident;

    @OraName(value = "D_RSVDEPO")
    @InitOrder(value = "73")
    @DataType(value = TransformType.STRING)
    public String depositRsvdepo;

    @OraName(value = "D_STATE")
    @InitOrder(value = "74")
    @DataType(value = TransformType.INTEGER)
    public Integer depositState;

    @OraName(value = "D_SUBKIND")
    @InitOrder(value = "75")
    @DataType(value = TransformType.LONG)
    public Long depositSubkind;

    @OraName(value = "D_SUBSCRIBERS")
    @InitOrder(value = "76")
    @DataType(value = TransformType.LONG)
    public Long depositSubscribers;

    @OraName(value = "D_TERM")
    @InitOrder(value = "77")
    @DataType(value = TransformType.LONG)
    public Long depositTerm;

    @OraName(value = "D_TERMSOK")
    @InitOrder(value = "78")
    @DataType(value = TransformType.INTEGER)
    public Integer depositTermsok;

    @OraName(value = "D_TXBRANCHNO")
    @InitOrder(value = "79")
    @DataType(value = TransformType.LONG)
    public Long depositTxbranchno;

    @OraName(value = "D_TXCLERK")
    @InitOrder(value = "80")
    @DataType(value = TransformType.LONG)
    public Long depositTxclerk;

    @OraName(value = "D_TXOFFICE")
    @InitOrder(value = "81")
    @DataType(value = TransformType.LONG)
    public Long depositTxoffice;

    @OraName(value = "D_TXOPCNT")
    @InitOrder(value = "82")
    @DataType(value = TransformType.LONG)
    public Long depositTxopcnt;

    @OraName(value = "D_V_SERV")
    @InitOrder(value = "83")
    @DataType(value = TransformType.LONG)
    public Long depositVServ;

    @OraName(value = "M_OMS_MODE")
    @InitOrder(value = "84")
    @DataType(value = TransformType.LONG)
    public Long metalDepositOmsMode;

    @OraName(value = "DepositLastkey")
    @InitOrder(value = "85")
    @DataType(value = TransformType.COMPOSEKEY)
    public Long depositLastkey;

    @OraName(value = "DepositOprow")
    @InitOrder(value = "86")
    @DataType(value = TransformType.COMPOSEKEY)
    public Long depositOprow;

    @OraName(value = "AtSubscribeAccnt")
    @InitOrder(value = "87")
    @DataType(value = TransformType.STRING)
    public String DepositAtSubscribeAccnt;

    @OraName(value = "category")
    @InitOrder(value = "88")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "89")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;


    public Long depositProlongCount;
    public Long prcntDefCloseFlag;

    @OraName(value = "code")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "sourceid")
    @DataType(value = TransformType.STRING)
    public String sourceId;

    @OraName(value = "sourcesystemid")
    @DataType(value = TransformType.STRING)
    public String sourceSystemId;

    public Long templObjId;

    public Long parentObjId;

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    public Long objectId;


    public boolean isDeleted=false;
    public Long lastChangeDate = System.currentTimeMillis();


}
