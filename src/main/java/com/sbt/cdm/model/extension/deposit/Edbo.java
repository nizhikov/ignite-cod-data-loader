/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.model.extension.deposit;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class Edbo {

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

    @OraName(value = "contractid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long agreementInst_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "agreementInst_DPL_id")
    @Default(value = "0")
    public Long agreementInst_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "agreementInst_DPL_id")
    @Default(value = "0")
    public Long agreementInst_DPL_rootId;

    @OraName(value = "E_BRANCHNO")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long edboBranchNo;

    @OraName(value = "E_CLERK_KOD")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public Long edboClerkKod;

    @OraName(value = "E_EDBO_BRANCH")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    public Long edboFormBranch;

    @OraName(value = "E_EMAIL")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    public String edboEmail;

    @OraName(value = "E_ID_MEGA")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    public Long edboTb;

    @OraName(value = "E_MOBOPER")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String edboMobOper;

    @OraName(value = "E_MOBPHONE")
    @InitOrder(value = "11")
    @DataType(value = TransformType.STRING)
    public String edboMobPhone;

    @OraName(value = "E_OFFICE")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long edboOffice;

    @OraName(value = "E_PHONE")
    @InitOrder(value = "13")
    @DataType(value = TransformType.STRING)
    public String edboPhone;

    @OraName(value = "E_STATE")
    @InitOrder(value = "14")
    @DataType(value = TransformType.LONG)
    public Long edboState;

    @OraName(value = "E_TYPE_MESSAGE")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    public Long edboTypeMessage;

    @OraName(value = "E_TYPE_SBNKD")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long edboTypeSbnkd;

    @OraName(value = "category")
    @InitOrder(value = "17")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "partitionid")
    @InitOrder(value = "18")
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
