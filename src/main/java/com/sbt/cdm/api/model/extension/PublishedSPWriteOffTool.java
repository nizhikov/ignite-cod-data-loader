/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.extension;

import ru.sbt.kmdtransform.*;

import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedSPWriteOffTool {

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

    @OraName(value = "templateId")
    @DataType(value = TransformType.LONG)
    public Long templateId;

    @OraName(value = "product")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    @Default(value = "0")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    @Default(value = "0")
    public Long product_DPL_rootId;

    @OraName(value = "operation")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public Long operation_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "operation_DPL_id")
    @Default(value = "0")
    public Long operation_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "operation_DPL_id")
    @Default(value = "0")
    public Long operation_DPL_rootId;

    @OraName(value = "regionId")
    @InitOrder(value = "7")
    @DataType(value = TransformType.INTEGER)
    public Integer regionId;

    @OraName(value = "typeTool")
    @InitOrder(value = "8")
    @DataType(value = TransformType.INTEGER)
    public Integer typeTool;

    @OraName(value = "accountNum")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String accountNum;

    @OraName(value = "cardNum")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String cardNum;

    @OraName(value = "toolBeginDate")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date toolBeginDate;

    @OraName(value = "toolEndDate")
    @InitOrder(value = "12")
    @DataType(value = TransformType.DATE_TIME)
    public Date toolEndDate;

    @OraName(value = "isActual")
    @InitOrder(value = "13")
    @DataType(value = TransformType.INTEGER)
    public Integer isActual;

    @OraName(value = "migration")
    @InitOrder(value = "14")
    @DataType(value = TransformType.INTEGER)
    public Integer migration;

    @OraName(value = "rqTm")
    @InitOrder(value = "15")
    @DataType(value = TransformType.DATE_TIME)
    public Date rqTm;

    @OraName(value = "isOperat")
    @InitOrder(value = "16")
    @DataType(value = TransformType.INTEGER)
    public Integer isOperat;

    @OraName(value = "category")
//    @InitOrder(value = "20")
    @Default(value = "0")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

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

    @OraName(value = "appid")
    @DataType(value = TransformType.LONG)
    public Long appId;

    public boolean isDeleted=false;
    public Long lastChangeDate = System.currentTimeMillis();

}
