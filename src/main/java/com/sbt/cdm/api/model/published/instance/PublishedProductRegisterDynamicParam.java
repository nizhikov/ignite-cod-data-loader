/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.published.instance;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedProductRegisterDynamicParam {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @OraName(value = "partitionid")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    @PartField(value="true")
    public Long partition_DPL_id;

    @OraName(value = "clientid")
    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    @RootField(value="true")
    public Long rootParticle_DPL_id;

    @DataType(value = TransformType.ROOT)
    @Default(value = "0")
    public Long affinityParent_DPL_id;

    @OraName(value = "templateId")
    @DataType(value = TransformType.LONG)
    public Long templateId;

    @OraName(value = "productRegister")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long productRegister_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "productRegister_DPL_id")
    @Default(value = "0")
    public Long productRegister_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "productRegister_DPL_id")
    @Default(value = "0")
    public Long productRegister_DPL_rootId;

    @OraName(value = "code")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "value")
    @InitOrder(value = "7")
    @DataType(value = TransformType.OBJ_TYPE)
    public String value;

    @OraName(value = "parentparam")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long parentParam_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "parentParam_DPL_id")
    @Default(value = "0")
    public Long parentParam_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "parentParam_DPL_id")
    @Default(value = "0")
    public Long parentParam_DPL_rootId;

    @OraName(value = "parameters")
    @InitOrder(value = "10")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @OraName(value = "type")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long ParamType_DPL_id;

    @OraName(value = "category")
    @InitOrder(value = "13")
    @DataType(value = TransformType.STRING)
    public String category;

    @OraName(value = "sourceid")
    @DataType(value = TransformType.STRING)
    public String sourceId;

    @OraName(value = "sourcesystemid")
    @DataType(value = TransformType.STRING)
    public String sourceSystemId;

    @OraName(value = "appid")
    @DataType(value = TransformType.LONG)
    public Long appId;

    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();

}
