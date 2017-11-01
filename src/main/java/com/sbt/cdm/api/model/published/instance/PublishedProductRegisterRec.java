/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.published.instance;

import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedProductRegisterRec {

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

    @OraName(value = "templateId")
//    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    public Long templateId;

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


    @OraName(value = "register")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long register_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "register_DPL_id")
    public Long register_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "register_DPL_id")
    public Long register_DPL_rootId;

    @OraName(value = "operation")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long operation_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "operation_DPL_id")
    public Long operation_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "operation_DPL_id")
    public Long operation_DPL_rootId;

    @OraName(value = "A_DATE")
    @InitOrder(value = "9")
    @DataType(value = TransformType.DATE_TIME)
    public Date date;

    @OraName(value = "restIn")
    @InitOrder(value = "10")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal restIn;

    @OraName(value = "restOut")
    @InitOrder(value = "11")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal restOut;

    @OraName(value = "TURNON")
    @InitOrder(value = "12")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal turnIn;

    @OraName(value = "turnOut")
    @InitOrder(value = "13")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal turnOut;

    @OraName(value = "category")
    @InitOrder(value = "14")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "type")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="type")
    public Long type_DPL_id;

    @OraName(value = "curBalance")
    @InitOrder(value = "16")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal curBalance;

    @OraName(value = "availBalance")
    @InitOrder(value = "17")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal availBalance;

    @OraName(value = "amount")
    @InitOrder(value = "18")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal amount;

    @OraName(value = "partitionid")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    @OraName(value = "moveNum")
    @InitOrder(value = "20")
    @DataType(value = TransformType.LONG)
    public Long num;

    public Integer kind;
    public Long linkedNum;
    public Integer linkKind;
    public Long updateNum;
    public Integer updateKind;

    public Date dateChange;

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

