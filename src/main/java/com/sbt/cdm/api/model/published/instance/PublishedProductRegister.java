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
public class PublishedProductRegister {

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
    @DataType(value = TransformType.LONG)
    public Long templateId;

//    @OraName(value = "parentId")
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long parentId;

    @OraName(value = "registerType")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="type")
    public Long type_DPL_id;

    @OraName(value = "code")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "status")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="status")
    public Long status_DPL_id;

    @OraName(value = "STATES")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long state_DPL_id;

    @OraName(value = "registerNumber")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    @Default(value = "unset")
    public String registerNumber;

    @OraName(value = "product")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_rootId;

    @OraName(value = "assets")
    @InitOrder(value = "12")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder assets_DPL_collectField;

    @OraName(value = "measure")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="measure")
    public Long measure_DPL_id;

//    @OraName(value = "departmentService")
//    @InitOrder(value = "14")
//    @DataType(value = TransformType.LONG)
//    @Default(value = "0")
//    @DictName(value="department")
    public Long departmentService_DPL_id = 0l;

    @OraName(value = "curBalances")
    @InitOrder(value = "15")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder curBalances_DPL_collectField;

    @OraName(value = "avalBalances")
    @InitOrder(value = "15")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder avalBalances_DPL_collectField;

    @OraName(value = "curValue")
    @InitOrder(value = "17")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal curValue;

    @OraName(value = "beginDate")
    @InitOrder(value = "18")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @InitOrder(value = "19")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "parentRegister")
    @InitOrder(value = "20")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long parentRegister_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "parentRegister_DPL_id")
    public Long parentRegister_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "parentRegister_DPL_id")
    public Long parentRegister_DPL_rootId;

    @OraName(value = "subRegisters")
    @InitOrder(value = "21")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder subRegisters_DPL_collectField;

    @OraName(value = "parameters")
    @InitOrder(value = "22")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @OraName(value = "REGISTERREC")
    @InitOrder(value = "15")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder registerRecs_DPL_collectField;

//    @OraName(value = "MEASURE")
////    @InitOrder(value = "12")
//    @DataType(value = TransformType.CSL_DICTS)
//    @DictName(value="measure")
//    public StringBuilder measures_DPL_collectField;

    @OraName(value = "category")
    @InitOrder(value = "23")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "reason")
    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long reason_DPL_id;

    @OraName(value = "LASTAVALREGISTERBALANCE")
    @InitOrder(value = "25")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long lastAvailRegBal_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "lastAvailRegBal_DPL_id")
    public Long lastAvailRegBal_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "lastAvailRegBal_DPL_id")
    public Long lastAvailRegBal_DPL_rootId;

    @OraName(value = "LASTCURREGISTERBALANCE")
    @InitOrder(value = "26")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long lastCurRegBal_DPL_id;

//    @OraName(value = "registerRec")
//    @InitOrder(value = "27")
//    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
//    public StringBuilder registerRec_DPL_collectField;


    @OraName(value = "partitionid")
    @InitOrder(value = "28")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "lastCurRegBal_DPL_id")
    public Long lastCurRegBal_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "lastCurRegBal_DPL_id")
    public Long lastCurRegBal_DPL_rootId;

    @OraName(value = "lastMoveNum")
    @InitOrder(value = "29")
    @DataType(value = TransformType.LONG)
    public Long lastMoveNum;

    public byte scale;
    public int mode;

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
