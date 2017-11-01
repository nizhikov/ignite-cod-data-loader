/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.model.extension.deposit;

import ru.sbt.kmdtransform.*;

import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class CardToDepoTo {

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

    @OraName(value = "D_BRANCHNO")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long prcntBranchno;

    @OraName(value = "D_CARDTO")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String prcntCardto;

    @OraName(value = "D_CLERK")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    public Long prcntClerk;

    @OraName(value = "D_DAY")
    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date prcntDay;

    @OraName(value = "D_DEPOTO")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String prcntDepoto;

    @OraName(value = "D_ID_MEGA")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public Long prcntTb;

    @OraName(value = "D_JRNNO")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long prcntJrnno;

    @OraName(value = "D_OFFICE")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long prcntOffice;

    @OraName(value = "D_STATE")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    public Long prcntState;

    @OraName(value = "category")
    @InitOrder(value = "14")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    public Long prcntBranchnoChange;
    public String prcntClerkFio;
    public Date prcntDayChange;
    public Integer prcntIsactual;
    public String prcntMobPhoneNum;
    public Long prcntOfficeChange;
    public String prcntPaymentPurpose;
    public Integer prcntPayReferral;
    public String prcntPhoneOperCode;
    public String prcntReceiverAccount;
    public String prcntReceiverBankBic;
    public String prcntReceiverBankCorrAcc;
    public String prcntReceiverInn;
    public String prcntReceiverKbk;
    public String prcntReceiverKpp;
    public String prcntReceiverName;
    public String prcntReceiverOktmo;
    public Long prcntSpecialClientCode;
    public Long prcntTbChange;
    public String prcntReceiverFio;

    @OraName(value = "partitionid")
    @InitOrder(value = "15")
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
