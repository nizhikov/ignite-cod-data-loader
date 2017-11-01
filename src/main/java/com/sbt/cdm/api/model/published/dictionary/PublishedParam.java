/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.published.dictionary;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedParam {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @OraName(value = "code")
    @InitOrder(value = "2")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "3")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "type")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long type_DPL_id;

    @OraName(value = "displayName")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String displayName;

    @OraName(value = "parentParam")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public Long parentParam_DPL_id;

    @OraName(value = "parameters")
    @InitOrder(value = "7")
    @DataType(value = TransformType.CSL_DICTS)
    public StringBuilder parameters_DPL_collectFields;

    @OraName(value = "idmdmp")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    public Long idMDMP;

    @OraName(value = "description")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String description;

    @OraName(value = "ownerId")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public String ownerId;

    @OraName(value = "isTempOnly")
    @InitOrder(value = "11")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean isTempOnly;

    @OraName(value = "isMultiSet")
    @InitOrder(value = "12")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean isMultiSet;

    @OraName(value = "objectId")
    @InitOrder(value = "13")
    @DataType(value = TransformType.STRING)
    public String objectId;
}
