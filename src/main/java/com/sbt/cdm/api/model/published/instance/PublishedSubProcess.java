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
public class PublishedSubProcess {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @OraName(value = "partitionid")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

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
////    @InitOrder(value = "3")
//    @DataType(value = TransformType.LONG)
//    public Long templateId;

//    @OraName(value = "parentId")
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long parentId;

    @OraName(value = "code")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "status")
    @InitOrder(value = "7")
    @Default(value = "0")
    @DataType(value = TransformType.LONG)
    @DictName(value="status")
    public Long status_DPL_id;


    @OraName(value = "beginDate")
    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @InitOrder(value = "9")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "operations")
    @InitOrder(value = "10")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder operations_DPL_collectField;

    @OraName(value = "APPMODULE")
    @InitOrder(value = "11")
    @Default(value = "0")
    @DataType(value = TransformType.LONG)
    public Long appModule_DPL_id;

    @OraName(value = "parameters")
    @InitOrder(value = "12")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

//    @OraName(value = "category")
//    @Default(value = "0")
//    @InitOrder(value = "13")
//    @DataType(value = TransformType.LONG)
//    public Long category_DPL_id;


    public String processCorrelationId;

    @OraName(value = "sourceid")
    @DataType(value = TransformType.STRING)
    public String sourceId;

    @OraName(value = "sourcesystemid")
    @DataType(value = TransformType.STRING)
    public String sourceSystemId;

    public Long templObjId;

    public Long parentObjId;

    @OraName(value = "objectid")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    public Long objectId;


    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();

}

