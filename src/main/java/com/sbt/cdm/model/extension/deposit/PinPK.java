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
public class PinPK {

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

    @OraName(value = "operationid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long operationRun_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    public Long operationRun_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    public Long operationRun_DPL_rootId;

    @OraName(value = "P_AUTH_DAY")
    @InitOrder(value = "5")
    @DataType(value = TransformType.DATE_TIME)
    public Date pinpkAuthDay;

    @OraName(value = "P_AUTHCODE")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String pinpkAuthcode;

    @OraName(value = "P_CARDNO")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String pinpkCardno;

    @OraName(value = "P_CLIENT_FIO")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    public String pinpkClientFio;

    @OraName(value = "P_EXP_DATE")
    @InitOrder(value = "9")
    @DataType(value = TransformType.DATE_TIME)
    public Date pinpkExpDate;

    @OraName(value = "P_ID_MEGA")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public Long pinpkTb;

    @OraName(value = "P_OPDAY")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date pinpkOpday;

    @OraName(value = "P_OPNO")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long pinpkOpno;

    @OraName(value = "P_PAYMASTER_CLERK")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    public Long pinpkPaymasterClerk;

    @OraName(value = "P_PAYMASTER_DAY")
    @InitOrder(value = "14")
    @DataType(value = TransformType.DATE_TIME)
    public Date pinpkPaymasterDay;

    @OraName(value = "P_PAYMASTER_FIO")
    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String pinpkPaymasterFio;

    @OraName(value = "P_VALID_CLERK")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long pinpkValidClerk;

    @OraName(value = "P_VALID_DAY")
    @InitOrder(value = "17")
    @DataType(value = TransformType.DATE_TIME)
    public Date pinpkValidDay;

    @OraName(value = "P_VALID_FIO")
    @InitOrder(value = "18")
    @DataType(value = TransformType.STRING)
    public String pinpkValidFio;

    @OraName(value = "PinpkDcard")
    @InitOrder(value = "19")
    @DataType(value = TransformType.STRING)
    public String pinpkDcard;

    @OraName(value = "Pinpkdeposit")
    @InitOrder(value = "20")
    @DataType(value = TransformType.COMPOSEKEY)
    public Long pinpk_deposit;

    @OraName(value = "category")
    @InitOrder(value = "21")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "22")
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
