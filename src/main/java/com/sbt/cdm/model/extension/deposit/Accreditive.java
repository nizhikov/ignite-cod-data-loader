package com.sbt.cdm.model.extension.deposit;

import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sbt-popov-yuv on 03.10.2017.
 */
public class Accreditive {

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

    @OraName(value = "documentid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long docInst_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "docInst_DPL_id")
    @Default(value = "0")
    public Long docInst_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "docInst_DPL_id")
    @Default(value = "0")
    public Long docInst_DPL_rootId;

    @OraName(value = "A_PAYDOCNO")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String accreditivePayDocNo;

    @OraName(value = "A_PAYDOCDATE")
    @InitOrder(value = "6")
    @DataType(value = TransformType.DATE_TIME)
    public Date accreditivePayDocDate;

    @OraName(value = "A_PAYER_ACCOUNT")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String accreditivePayerAccount;

    @OraName(value = "A_PAYEE_ACCOUNT")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    public String accreditivePayeeAccount;

    @OraName(value = "A_ACCR_SUM")
    @InitOrder(value = "9")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal accreditiveAccrSum;

    @OraName(value = "A_PL_CLOSEDATE")
    @InitOrder(value = "10")
    @DataType(value = TransformType.DATE_TIME)
    public Date accreditivePlClosedate;

    @OraName(value = "A_ACT_CLOSEDATE")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date accreditiveActClosedate;

    @OraName(value = "A_DEPOSIT_ACCOUNT")
    @InitOrder(value = "12")
    @DataType(value = TransformType.STRING)
    public String accreditiveDepositAccount;

    @OraName(value = "A_OFFBAL_ACCOUNT")
    @InitOrder(value = "13")
    @DataType(value = TransformType.STRING)
    public String accreditiveOffBalAccount;

    @OraName(value = "A_STATUS")
    @InitOrder(value = "14")
    @DataType(value = TransformType.INTEGER)
    public Integer accreditiveStatus;

    @OraName(value = "A_LETTER_NO")
    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String accreditiveLetterNo;

    @OraName(value = "A_BRANCH")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long accreditiveBranch;

    @OraName(value = "A_OFFICE")
    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long accreditiveOffice;

    @OraName(value = "A_CREATE_DATE")
    @InitOrder(value = "18")
    @DataType(value = TransformType.DATE_TIME)
    public Date accreditiveCreateDate;

    @OraName(value = "A_RESERVE_ID")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long accreditiveReserveId;

    @OraName(value = "A_PURPOSE")
    @InitOrder(value = "20")
    @DataType(value = TransformType.STRING)
    public String accreditivePurpose;

    @OraName(value = "A_PAYMENT_DOC")
    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String accreditivePaymentDoc;

    @OraName(value = "A_PAYMENT_COND")
    @InitOrder(value = "22")
    @DataType(value = TransformType.STRING)
    public String accreditivePaymentCond;

    @OraName(value = "A_ADD_COND")
    @InitOrder(value = "23")
    @DataType(value = TransformType.STRING)
    public String accreditiveAddCond;

    @OraName(value = "A_ACCREDITIVE_TYPE")
    @InitOrder(value = "24")
    @DataType(value = TransformType.INTEGER)
    public Integer accreditiveAccreditiveType;

    @OraName(value = "A_PAYEE_NAME")
    @InitOrder(value = "25")
    @DataType(value = TransformType.STRING)
    public String accreditivePayeeName;

    @OraName(value = "A_PAYEE_INN")
    @InitOrder(value = "26")
    @DataType(value = TransformType.STRING)
    public String accreditivePayeeInn;

    @OraName(value = "A_GARAGE_ADDRESS")
    @InitOrder(value = "27")
    @DataType(value = TransformType.STRING)
    public String accreditiveGarageAddress;

    @OraName(value = "A_CONTRACT_NUMBER")
    @InitOrder(value = "28")
    @DataType(value = TransformType.STRING)
    public String accreditiveContractNumber;

    @OraName(value = "A_CONTRACT_DATE")
    @InitOrder(value = "29")
    @DataType(value = TransformType.DATE_TIME)
    public Date accreditiveContractDate;

    @OraName(value = "A_PAYEE_KPP")
    @InitOrder(value = "30")
    @DataType(value = TransformType.STRING)
    public String accreditivePayeeKpp;

    @OraName(value = "A_PROLONGATION_DATE")
    @InitOrder(value = "31")
    @DataType(value = TransformType.DATE_TIME)
    public Date accreditiveProlongationDate;

    @OraName(value = "A_COVERAGE_TYPE")
    @InitOrder(value = "32")
    @DataType(value = TransformType.INTEGER)
    public Integer accreditiveCoverageType;

    @OraName(value = "A_PAYMENT_DOC_NEW")
    @InitOrder(value = "33")
    @DataType(value = TransformType.STRING)
    public String accreditivePaymentDocNew;

    @OraName(value = "A_IS_ACTUAL")
    @InitOrder(value = "34")
    @DataType(value = TransformType.INTEGER)
    public Integer accreditiveIsActual;

    @OraName(value = "A_CHANGE_DATE")
    @InitOrder(value = "35")
    @DataType(value = TransformType.DATE_TIME)
    public Date accreditiveChangeDate;

    @OraName(value = "category")
    @InitOrder(value = "36")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

//    @OraName(value = "category")
//    @InitOrder(value = "36")
    @Default(value = "13")
    @DataType(value = TransformType.LONG)
    public Long accreditiveTb_DPL_id;


    @OraName(value = "partitionid")
    @InitOrder(value = "37")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

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
