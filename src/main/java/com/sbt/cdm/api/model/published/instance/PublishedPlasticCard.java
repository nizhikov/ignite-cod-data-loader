/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.published.instance;

import ru.sbt.kmdtransform.*;

import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedPlasticCard {

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

//    @OraName(value = "parentId")
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long parentId;

    @OraName(value = "product")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_rootId;

    @OraName(value = "accessToolType")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="type")
    public Long accessToolType_DPL_id;

    @OraName(value = "code")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String code;


    @OraName(value = "name")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "dateRelease")
    @InitOrder(value = "9")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateRelease;

    @OraName(value = "beginDate")
    @InitOrder(value = "10")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "status")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="status")
    public Long status_DPL_id;

    @OraName(value = "state")
    @InitOrder(value = "13")
    @DataType(value = TransformType.CSL_DICTS)
    public StringBuilder states_DPL_collectField;

    @OraName(value = "numberMask")
    @InitOrder(value = "14")
    @DataType(value = TransformType.STRING)
    public String numberMask;

    @OraName(value = "plasticCardType")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long plasticCardType_DPL_id;

    @OraName(value = "WAYPROD")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long wAYProd_DPL_id;

    @OraName(value = "IPSCode")
    @InitOrder(value = "17")
    @DataType(value = TransformType.STRING)
    public String ipsCode;

    @OraName(value = "IPSParty")
    @InitOrder(value = "18")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long iPSParty_DPL_id;

//    @DataType(value = TransformType.PARTITION)
//    @PartForField(value = "product_DPL_id")
//    public Long iPSParty_DPL_colocationKey;

    @OraName(value = "marketPlace")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long marketPlace_DPL_id;

    @OraName(value = "chipApplication")
    @InitOrder(value = "20")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long chipApplication_DPL_id;

    @OraName(value = "embossName")
    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String embossName;

    @OraName(value = "cardOwner")
    @ClientField(value = "true")
    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long cardOwner_DPL_id;

    @OraName(value = "role")
//    @InitOrder(value = "23")
    @PartForField(value = "cardOwner_DPL_id")
    @DataType(value = TransformType.PARTITION)
    @Default(value = "0")
    public Long cardOwner_DPL_colocationKey;

//    @OraName(value = "addPlasticCards")
//    @InitOrder(value = "24")
//    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
//    public StringBuilder addPlasticCards_DPL_collectField;

    @OraName(value = "parameters")
    @InitOrder(value = "25")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @OraName(value = "iPSProducts")
    @DataType(value = TransformType.CSL_DICTS)
    public StringBuilder iPSProducts_DPL_collectField;

    @OraName(value = "category")
    @InitOrder(value = "26")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "partitionid")
    @InitOrder(value = "27")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;


    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long reason_DPL_id;

    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long formFactor_DPL_id;

    @DataType(value = TransformType.STRING)
    public String role;

    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder issies_DPL_collectField;

    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long busApplication_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "busApplication_DPL_id")
    public Long busApplication_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "busApplication_DPL_id")
    public Long busApplication_DPL_rootId;

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


    public boolean locking=false;
    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();

}

