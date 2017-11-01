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
public class DepoBuild {

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

    @OraName(value = "D_COST_OBJ")
    @InitOrder(value = "5")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal costObj;

    @OraName(value = "D_DATE_PACT")
    @InitOrder(value = "6")
    @DataType(value = TransformType.DATE_TIME)
    public Date datePact;

    @OraName(value = "D_ID_OBJ")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    public Long idObj;

    @OraName(value = "D_ISACTUAL")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    public Long isActual;

    @OraName(value = "D_NUMBER_AREA")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    public Long numberArea;

    @OraName(value = "D_NUMBER_PACT")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String numberPact;

    @OraName(value = "D_PERIOD")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date period;

    @OraName(value = "Deposit")
    @InitOrder(value = "12")
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

    @OraName(value = "category")
    @InitOrder(value = "13")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "14")
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
