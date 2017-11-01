/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.model.extension.deposit;

import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class DCard {

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

    @OraName(value = "plasticCardid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long plasticCardInst_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "plasticCardInst_DPL_id")
    @Default(value = "0")
    public Long plasticCardInst_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "plasticCardInst_DPL_id")
    @Default(value = "0")
    public Long plasticCardInst_DPL_rootId;

    @OraName(value = "D_AIRCODE")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String dcardAircode;

    @OraName(value = "D_AIRNUMBER")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String dcardAirnumber;

    @OraName(value = "D_AUTOPAYMENT_STATE")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    public Long dcardAutopaymentState;

    @OraName(value = "D_AUTOPAYMENT_SUMMA")
    @InitOrder(value = "8")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardAutopaymentSumma;

    @OraName(value = "D_BLOCKCODE")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    public Long dcardBlockcode;

    @OraName(value = "D_BLOCKDATE")
    @InitOrder(value = "10")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardBlockdate;

    @OraName(value = "D_BRANCHNO")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long dcard_branchno;

    @OraName(value = "D_CARDMADEENDDATE")
    @InitOrder(value = "12")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardCardmadeenddate;

    @OraName(value = "D_CARDMADELOADDATE")
    @InitOrder(value = "13")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardCardmadeloaddate;

    @OraName(value = "D_CARDMADENUMBER")
    @InitOrder(value = "14")
    @DataType(value = TransformType.STRING)
    public String dcardCardmadenumber;

    @OraName(value = "D_CHANGE_BRANCHNO")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    public Long dcardChangeBranchno;

    @OraName(value = "D_CHANGE_CLERK")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long dcardChangeClerk;

    @OraName(value = "D_CHANGE_DAY")
    @InitOrder(value = "17")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardChangeDay;

    @OraName(value = "D_CHANGE_OFFICE")
    @InitOrder(value = "18")
    @DataType(value = TransformType.LONG)
    public Long dcardChangeOffice;

    @OraName(value = "D_CHANGE_TYPE")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long dcardChangeType;

    @OraName(value = "D_CLAIMDATE")
    @InitOrder(value = "20")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardClaimdate;

    @OraName(value = "D_CLAIMIASK")
    @InitOrder(value = "21")
    @DataType(value = TransformType.LONG)
    public Long dcardClaimiask;

    @OraName(value = "D_CLIENT")
    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    public Long dcardClient;

    @OraName(value = "D_CODECARD")
    @InitOrder(value = "23")
    @DataType(value = TransformType.LONG)
    public Long dcardCodecard;

    @OraName(value = "D_CODEFORTARIFF")
    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long dcardCodefortariff;

    @OraName(value = "D_CODETARIFFCHANGE")
    @InitOrder(value = "25")
    @DataType(value = TransformType.LONG)
    public Long dcardCodetariffchange;

    @OraName(value = "D_CONTRDATE")
    @InitOrder(value = "26")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardContrdate;

    @OraName(value = "D_CURISSUE")
    @InitOrder(value = "27")
    @DataType(value = TransformType.LONG)
    public Long dcardCurissue;

    @OraName(value = "D_DAYLIMCARD")
    @InitOrder(value = "28")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardDaylimcard;

    @OraName(value = "D_DEPOKIND")
    @InitOrder(value = "29")
    @DataType(value = TransformType.LONG)
    public Long dcardDepokind;

    @OraName(value = "D_DEPOSUBKIND")
    @InitOrder(value = "30")
    @DataType(value = TransformType.LONG)
    public Long dcardDeposubkind;

    @OraName(value = "D_DRN")
    @InitOrder(value = "31")
    @DataType(value = TransformType.STRING)
    public String dcardDrn;

    @OraName(value = "D_ENDCONTRDATE")
    @InitOrder(value = "32")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardEndcontrdate;

    @OraName(value = "D_HASHCARD")
    @InitOrder(value = "33")
    @DataType(value = TransformType.STRING)
    public String dcardHashcard;

    @OraName(value = "D_HELPDATE")
    @InitOrder(value = "34")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardHelpdate;

    @OraName(value = "D_HOLDERCODE")
    @InitOrder(value = "35")
    @DataType(value = TransformType.LONG)
    public Long dcardHoldercode;

    @OraName(value = "D_ID_MEGA")
    @InitOrder(value = "36")
    @DataType(value = TransformType.LONG)
    public Long dcard_tb;

    @OraName(value = "D_INSURCARD")
    @InitOrder(value = "37")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardInsurcard;

    @OraName(value = "D_ISCHANGE")
    @InitOrder(value = "38")
    @DataType(value = TransformType.LONG)
    public Long dcardIschange;

    @OraName(value = "D_ISCLNPRESENT")
    @InitOrder(value = "39")
    @DataType(value = TransformType.LONG)
    public Long dcardIsclnpresent;

    @OraName(value = "D_ISSALARY")
    @InitOrder(value = "40")
    @DataType(value = TransformType.LONG)
    public Long dcardIssalary;

    @OraName(value = "D_ISSUEBY")
    @InitOrder(value = "41")
    @DataType(value = TransformType.LONG)
    public Long dcardIssueby;

    @OraName(value = "D_ISVIP")
    @InitOrder(value = "42")
    @DataType(value = TransformType.LONG)
    public Long dcardIsvip;

    @OraName(value = "D_LIMCARD")
    @InitOrder(value = "43")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardLimcard;

    @OraName(value = "D_MARKLOCK")
    @InitOrder(value = "44")
    @DataType(value = TransformType.LONG)
    public Long dcardMarklock;

    @OraName(value = "D_MARKLOCKDATE")
    @InitOrder(value = "45")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardMarklockdate;

    @OraName(value = "D_MARKLOCKSTR")
    @InitOrder(value = "46")
    @DataType(value = TransformType.STRING)
    public String dcardMarklockstr;

    @OraName(value = "D_MB_OPERATOR")
    @InitOrder(value = "47")
    @DataType(value = TransformType.LONG)
    public Long dcardMbOperator;

    @OraName(value = "D_MB_PHONE")
    @InitOrder(value = "48")
    @DataType(value = TransformType.STRING)
    public String dcardMbPhone;

    @OraName(value = "D_MB_TYPE")
    @InitOrder(value = "49")
    @DataType(value = TransformType.LONG)
    public Long dcardMbType;

    @OraName(value = "D_MONTHLIMCARD")
    @InitOrder(value = "50")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardMonthlimcard;

    @OraName(value = "D_NUMBANCARD")
    @InitOrder(value = "51")
    @DataType(value = TransformType.LONG)
    public Long dcardNumbancard;

    @OraName(value = "D_NUMCARD")
    @InitOrder(value = "52")
    @DataType(value = TransformType.STRING)
    public String dcardNumcard;

    @OraName(value = "D_NUMCARDCLAIM")
    @InitOrder(value = "53")
    @DataType(value = TransformType.STRING)
    public String dcardNumcardclaim;

    @OraName(value = "D_NUMCARDOLD")
    @InitOrder(value = "54")
    @DataType(value = TransformType.STRING)
    public String dcardNumcardold;

    @OraName(value = "D_NUMCONTRCARD")
    @InitOrder(value = "55")
    @DataType(value = TransformType.LONG)
    public Long dcardNumcontrcard;

    @OraName(value = "D_NUMPAYCARD")
    @InitOrder(value = "56")
    @DataType(value = TransformType.LONG)
    public Long dcardNumpaycard;

    @OraName(value = "D_OFFICE")
    @InitOrder(value = "57")
    @DataType(value = TransformType.LONG)
    public Long dcardOffice;

    @OraName(value = "D_OVERDRAFT")
    @InitOrder(value = "58")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardOverdraft;

    @OraName(value = "D_PAYISSUE")
    @InitOrder(value = "59")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardPayissue;

    @OraName(value = "D_PRESENCEALLOW")
    @InitOrder(value = "60")
    @DataType(value = TransformType.LONG)
    public Long dcardPresenceallow;

    @OraName(value = "D_PRESENCECLAIM")
    @InitOrder(value = "61")
    @DataType(value = TransformType.LONG)
    public Long dcardPresenceclaim;

    @OraName(value = "D_QUAOPERCARD")
    @InitOrder(value = "62")
    @DataType(value = TransformType.LONG)
    public Long dcardQuaopercard;

    @OraName(value = "D_REASONCHANGE")
    @InitOrder(value = "63")
    @DataType(value = TransformType.LONG)
    public Long dcardReasonchange;

    @OraName(value = "D_RETURNDATE")
    @InitOrder(value = "64")
    @DataType(value = TransformType.DATE_TIME)
    public Date dcardReturndate;

    @OraName(value = "D_RPTALLOW")
    @InitOrder(value = "65")
    @DataType(value = TransformType.LONG)
    public Long dcardRptallow;

    @OraName(value = "D_RPTINTERNET")
    @InitOrder(value = "66")
    @DataType(value = TransformType.LONG)
    public Long dcardRptinternet;

    @OraName(value = "D_RPTPOST")
    @InitOrder(value = "67")
    @DataType(value = TransformType.LONG)
    public Long dcardRptpost;

    @OraName(value = "D_SIN")
    @InitOrder(value = "68")
    @DataType(value = TransformType.STRING)
    public String dcardSin;

    @OraName(value = "D_SNILS")
    @InitOrder(value = "69")
    @DataType(value = TransformType.STRING)
    public String dcardSnils;

    @OraName(value = "D_SUBCARD")
    @InitOrder(value = "70")
    @DataType(value = TransformType.LONG)
    public Long dcardSubcard;

    @OraName(value = "D_SUMBANCARD")
    @InitOrder(value = "71")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardSumbancard;

    @OraName(value = "D_SUMPAYCARD")
    @InitOrder(value = "72")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardSumpaycard;

    @OraName(value = "D_TARIFFSERVCUR")
    @InitOrder(value = "73")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardTariffservcur;

    @OraName(value = "D_TARIFFSERVNEXT")
    @InitOrder(value = "74")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal dcardTariffservnext;

    @OraName(value = "D_TEXTCONTROL")
    @InitOrder(value = "75")
    @DataType(value = TransformType.STRING)
    public String dcardTextcontrol;

    @OraName(value = "D_TYPE_SBNKD")
    @InitOrder(value = "76")
    @DataType(value = TransformType.LONG)
    public Long dcardTypeSbnkd;

    @OraName(value = "D_TYPECARD")
    @InitOrder(value = "77")
    @DataType(value = TransformType.LONG)
    public Long dcardTypecard;

    @OraName(value = "D_UEC_CLAIM_NUMBER")
    @InitOrder(value = "78")
    @DataType(value = TransformType.STRING)
    public String dcardUecClaimNumber;

    @OraName(value = "D_UEC_CLAIM_SERIES")
    @InitOrder(value = "79")
    @DataType(value = TransformType.STRING)
    public String dcardUecClaimSeries;

    @OraName(value = "D_USEBIO")
    @InitOrder(value = "80")
    @DataType(value = TransformType.LONG)
    public Long dcardUsebio;

    @OraName(value = "D_USEPIN")
    @InitOrder(value = "81")
    @DataType(value = TransformType.LONG)
    public Long dcardUsepin;

    @OraName(value = "DcardDcardMain")
    @InitOrder(value = "82")
    @DataType(value = TransformType.COMPOSEKEY)
    public Long dcardDcardMain;

    @OraName(value = "category")
    @InitOrder(value = "83")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "84")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    public String mainApplRegNumber;

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
