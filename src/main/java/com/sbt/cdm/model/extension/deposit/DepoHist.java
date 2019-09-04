/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.model.extension.deposit;

import org.apache.ignite.cache.query.annotations.QuerySqlField;
import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class DepoHist {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    @QuerySqlField
    public Long id;


    @OraName(value = "colocationKey")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    @PartField(value="true")
    @QuerySqlField
    public Long colocationKey;

    @OraName(value = "clientid")
    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    @RootField(value="true")
    @QuerySqlField
    public Long rootParticle_DPL_id;

    @DataType(value = TransformType.ROOT)
    @Default(value = "0")
    @QuerySqlField
    public Long affinityParent_DPL_id;

//    @OraName(value = "templateId")
//    @DataType(value = TransformType.LONG)
//    public Long templateId;

    @OraName(value = "operationid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    @QuerySqlField
    public Long operationRun_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    @QuerySqlField
    public Long operationRun_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    @QuerySqlField
    public Long operationRun_DPL_rootId;

    @OraName(value = "C_ATMID")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String cardhistAtmid;

    @OraName(value = "C_AUTHCODE")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String cardhistAuthcode;

    @OraName(value = "C_AUTHKIND")
    @InitOrder(value = "7")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer cardhistAuthkind;

    @OraName(value = "C_CARDNO")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String cardhistCardno;

    @OraName(value = "C_MERCHANTNO")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String cardhistMerchantno;

    @OraName(value = "C_TXCASH")
    @InitOrder(value = "10")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal cardhistTxcash;

    @OraName(value = "C_TXCURRENCY")
    @InitOrder(value = "11")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer cardhistTxcurrency;

    @OraName(value = "C_TXID")
    @InitOrder(value = "12")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer cardhistTxid;

    @OraName(value = "C_TXTIME")
    @InitOrder(value = "13")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date cardhistTxtime;

    @OraName(value = "D_ASSIGNDAY")
    @InitOrder(value = "14")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistAssignday;

    @OraName(value = "D_ASSMINBALANCE")
    @InitOrder(value = "15")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistAssminbalance;

    @OraName(value = "D_BALANCE")
    @InitOrder(value = "16")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistBalance;

    @OraName(value = "D_BALANCEF_BALANCEOWN")
    @InitOrder(value = "17")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistBalanceOwn;

    @OraName(value = "D_BALANCEF_SUBSIDY")
    @InitOrder(value = "18")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistSubsidy;

    @OraName(value = "D_BRANCHNO")
    @InitOrder(value = "19")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohist_branchno;

    @OraName(value = "D_CARDRPTDAY")
    @InitOrder(value = "20")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistCardrptday;

    @OraName(value = "D_CASHSOURCE")
    @InitOrder(value = "21")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistCashsource;

    @OraName(value = "D_CHEQUECNT")
    @InitOrder(value = "22")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistChequecnt;

    @OraName(value = "D_CLERK")
    @InitOrder(value = "23")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistClerk;

    @OraName(value = "D_CONVER_CURRENCY")
    @InitOrder(value = "24")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistConverCurrency;

    @OraName(value = "D_CONVER_OPCASH")
    @InitOrder(value = "25")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistConverOpcash;

    @OraName(value = "D_CREDITACCOUNT")
    @InitOrder(value = "26")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String depohistCreditaccount;

    @OraName(value = "D_DEBITACCOUNT")
    @InitOrder(value = "27")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String depohistDebitaccount;

    @OraName(value = "D_DEPOSITRATE")
    @InitOrder(value = "28")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistDepositrate;

    @OraName(value = "D_EXPIRATIONDAY")
    @InitOrder(value = "29")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistExpirationday;

    @OraName(value = "D_EXPMINBALANCE")
    @InitOrder(value = "30")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistExpminbalance;

    @OraName(value = "D_EXPROVERDRAFT")
    @InitOrder(value = "31")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistExproverdraft;

    @OraName(value = "D_EXPROVERDRAFTINT")
    @InitOrder(value = "32")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistExproverdraftint;

    @OraName(value = "D_EXTERNALKIND")
    @InitOrder(value = "33")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistExternalkind;

    @OraName(value = "D_FLAG_CASH")
    @InitOrder(value = "34")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistFlagCash;

    @OraName(value = "D_GRANT_OPER")
    @InitOrder(value = "35")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistGrantOper;

    @OraName(value = "D_HEIRNO")
    @InitOrder(value = "36")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistHeirno;

    @OraName(value = "D_ID_MEGA")
    @InitOrder(value = "37")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohist_tb;

    @OraName(value = "D_INSERTTIME")
    @InitOrder(value = "38")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistInserttime;

    @OraName(value = "D_INTEREST")
    @InitOrder(value = "39")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistInterest;

    @OraName(value = "D_INTERESTF")
    @InitOrder(value = "40")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistInterestf;

    @OraName(value = "D_ISCASHDISPENSER")
    @InitOrder(value = "41")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistIscashdispenser;

    @OraName(value = "D_ISMANUAL")
    @InitOrder(value = "42")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistIsmanual;

    @OraName(value = "D_ISMOFFICE")
    @InitOrder(value = "43")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistIsmoffice;

    @OraName(value = "D_JRNNO")
    @InitOrder(value = "44")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistJrnno;

    @OraName(value = "D_MAXAMOUNT")
    @InitOrder(value = "45")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistMaxamount;

    @OraName(value = "D_MAXAMOUNTRATE")
    @InitOrder(value = "46")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistMaxamountrate;

    @OraName(value = "D_N_DPRICE")
    @InitOrder(value = "47")
    @DataType(value = TransformType.LONG)
    @QuerySqlField
    public Long depohistNDprice;

//    @OraName(value = "D_OFFCASHBALANCE")
//    @InitOrder(value = "48")
//    @DataType(value = TransformType.BIGDECIMAL)
//    public BigDecimal depohistOffcashbalance;

    @OraName(value = "D_OFFCASHBALANCEB")
    @InitOrder(value = "49")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistOffcashbalanceb;

    @OraName(value = "D_OFFICE")
    @InitOrder(value = "50")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistOffice;

    @OraName(value = "D_OFFICETRANSDAY")
    @InitOrder(value = "51")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistOfficetransday;

    @OraName(value = "D_OPCASH")
    @InitOrder(value = "52")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistOpcash;

    @OraName(value = "D_OPCASHCOST")
    @InitOrder(value = "53")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistOpcashcost;

    @OraName(value = "D_OPCODE")
    @InitOrder(value = "54")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistOpcode;

    @OraName(value = "D_OPDAY")
    @InitOrder(value = "55")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistOpday;

    @OraName(value = "D_OPENCASH")
    @InitOrder(value = "56")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistOpencash;

    @OraName(value = "D_OPKIND")
    @InitOrder(value = "57")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistOpkind;

    @OraName(value = "D_OPNO")
    @InitOrder(value = "58")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistOpno;

    @OraName(value = "D_OPTRANSDAY")
    @InitOrder(value = "59")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistOptransday;

    @OraName(value = "D_ORDERNO")
    @InitOrder(value = "60")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String depohistOrderno;

    @OraName(value = "D_OVERDRAFT_MINBALANCEMONTH")
    @InitOrder(value = "61")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistMinBalanceMonth;

    @OraName(value = "D_OVERDRAFT_BALANCEOWNPROLONG")
    @InitOrder(value = "62")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistBalanceOwnProlong;

    @OraName(value = "D_OVERDRAFT")
    @InitOrder(value = "63")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistOverdraft;

    @OraName(value = "D_OVERDRAFTINT")
    @InitOrder(value = "64")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistOverdraftint;

    @OraName(value = "D_PAIRACCOUNT")
    @InitOrder(value = "65")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String depohistPairAccount;

    @OraName(value = "D_PARTRATE")
    @InitOrder(value = "66")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistPartrate;

    @OraName(value = "D_PAYROLLDAY")
    @InitOrder(value = "67")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistPayrollday;

    @OraName(value = "D_PAYROLLDAY_PAYADDFIRST")
    @InitOrder(value = "68")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistPayAddFirst;

    @OraName(value = "D_PERCENTSRATE")
    @InitOrder(value = "69")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistPercentsrate;

    @OraName(value = "D_PINACCEPTFLAG")
    @InitOrder(value = "70")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistPinacceptflag;

    @OraName(value = "D_PROLONGDAY")
    @InitOrder(value = "71")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistProlongday;

    @OraName(value = "D_RATESOURCE")
    @InitOrder(value = "72")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistRatesource;

    @OraName(value = "D_REASON")
    @InitOrder(value = "73")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistReason;

    @OraName(value = "D_SBOOKENDDAY")
    @InitOrder(value = "74")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistSbookendday;

    @OraName(value = "D_SOURCEDOCDAY")
    @InitOrder(value = "75")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date depohistSourcedocday;

    @OraName(value = "D_SOURCEDOCNO")
    @InitOrder(value = "76")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String depohistSourcedocno;

    @OraName(value = "D_SOURCEDOCORIGINATOR")
    @InitOrder(value = "77")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String depohistSourcedocoriginator;

    @OraName(value = "D_STATE")
    @InitOrder(value = "78")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistState;

    @OraName(value = "D_SUBSYS")
    @InitOrder(value = "79")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistSubsys;

    @OraName(value = "D_SUMOBNALOPERATION")
    @InitOrder(value = "80")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistSumobnaloperation;

    @OraName(value = "D_TAXABLEPROFIT")
    @InitOrder(value = "81")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistTaxableprofit;

    @OraName(value = "D_TAXABLEPROFITCOST")
    @InitOrder(value = "82")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistTaxableprofitcost;

    @OraName(value = "D_TERMSOK")
    @InitOrder(value = "83")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistTermsok;

    @OraName(value = "D_TURNCODE")
    @InitOrder(value = "84")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistTurncode;

    @OraName(value = "D_USEDTAXEXEMPTIONS")
    @InitOrder(value = "85")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistUsedtaxexemptions;

    @OraName(value = "D_V_HZAP2")
    @InitOrder(value = "86")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistVHzap2;

    @OraName(value = "D_WARRANTKIND")
    @InitOrder(value = "87")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer depohistWarrantkind;

    @OraName(value = "D_WARRANTNO")
    @InitOrder(value = "88")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String depohistWarrantno;

    @OraName(value = "O_INFO")
    @InitOrder(value = "89")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String offcashcompInfo;

    @OraName(value = "O_OPDAY")
    @InitOrder(value = "90")
    @DataType(value = TransformType.DATE_TIME)
    @QuerySqlField
    public Date offcashcompOpday;

    @OraName(value = "O_OPNO")
    @InitOrder(value = "91")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer offcashcompOpno;

    @OraName(value = "O_ORDNO")
    @InitOrder(value = "92")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String offcashcompOrdno;

    @OraName(value = "O_SSAGENCY")
    @InitOrder(value = "93")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String offcashcompSsagency;

    @OraName(value = "O_SSN")
    @InitOrder(value = "94")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String offcashcompSsn;

    @OraName(value = "O_V_DNUM1")
    @InitOrder(value = "95")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer offcashcompVDnum1;

    @OraName(value = "O_V_DSUM1")
    @InitOrder(value = "96")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal offcashcompVDsum1;

    @OraName(value = "O_V_DSUM2")
    @InitOrder(value = "97")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal offcashcompVDsum2;

    @OraName(value = "O_V_DSUM3")
    @InitOrder(value = "98")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal offcashcompVDsum3;

    @OraName(value = "O_V_DSUM4")
    @InitOrder(value = "99")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal offcashcompVDsum4;

    @OraName(value = "O_V_DSUM5")
    @InitOrder(value = "100")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal offcashcompVDsum5;

    @OraName(value = "O_V_DSUM6")
    @InitOrder(value = "101")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal offcashcompVDsum6;

    @OraName(value = "O_V_DSUM7")
    @InitOrder(value = "102")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal offcashcompVDsum7;

    @OraName(value = "category")
    @InitOrder(value = "103")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    @QuerySqlField
    public Long category_DPL_id;
    @QuerySqlField
    public Integer depohistTerm;

    @OraName(value = "D_RG_CP_BALANCE")
    @InitOrder(value = "104")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgCpBalance;

    @OraName(value = "D_RG_CP_OPCASH")
    @InitOrder(value = "105")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgCpOpcash;

    @OraName(value = "D_RG_SPR_BALANCE")
    @InitOrder(value = "106")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgSprBalance;

    @OraName(value = "D_RG_SPR_OPCASH")
    @InitOrder(value = "107")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgSprOpcash;

    @OraName(value = "D_RG_CN1_BALANCE")
    @InitOrder(value = "108")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgCn1Balance;

    @OraName(value = "D_RG_CN1_OPCASH")
    @InitOrder(value = "109")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgCn1Opcash;

    @OraName(value = "D_RG_CN2_BALANCE")
    @InitOrder(value = "110")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgCn2Balance;

    @OraName(value = "D_RG_CN2_OPCASH")
    @InitOrder(value = "111")
    @DataType(value = TransformType.BIGDECIMAL)
    @QuerySqlField
    public BigDecimal depohistrgCn2Opcash;

    @OraName(value = "D_ENROLL_TYPE")
    @InitOrder(value = "112")
    @DataType(value = TransformType.INTEGER)
    @QuerySqlField
    public Integer enrollType;


    @OraName(value = "partitionid")
    @InitOrder(value = "113")
    @DataType(value = TransformType.LONG)
    @QuerySqlField
    public Long partition_DPL_id;


    @OraName(value = "code")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String code;

    @OraName(value = "name")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String name;

    @OraName(value = "sourceid")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String sourceId;

    @OraName(value = "sourcesystemid")
    @DataType(value = TransformType.STRING)
    @QuerySqlField
    public String sourceSystemId;
    @QuerySqlField
    public Long templObjId;
    @QuerySqlField
    public Long parentObjId;

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @QuerySqlField
    public Long objectId;
    @QuerySqlField
    public boolean isDeleted=false;
    @QuerySqlField
    public Long lastChangeDate = System.currentTimeMillis();

}
