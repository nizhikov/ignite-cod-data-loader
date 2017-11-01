package com.sbt.cdm.api.model.published.template;

import ru.sbt.kmdtransform.*;

import java.util.Date;

/**
 * Created by sbt-skutin-dn on 03.08.2017.
 */
public class PublishedProduct {

    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @InitOrder(value = "2")
    @DataType(value = TransformType.STRING)
    public String code;

    @InitOrder(value = "3")
    @DataType(value = TransformType.STRING)
    public String name;

    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long idMDMP;

    @InitOrder(value = "5")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder indicators_DPL_collectField;

    @InitOrder(value = "6")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @InitOrder(value = "7")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @InitOrder(value = "8")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder productPartyRoles_DPL_collectField;

    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    public Long num;

    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String description;

    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long templObjId;

    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long ownerId;

    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @InitOrder(value = "14")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder registers_DPL_collectField;

    @InitOrder(value = "15")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder relatedProducts_DPL_collectField;

    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long status_DPL_id;

    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long version_DPL_id;

    @InitOrder(value = "18")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder accessTools_DPL_collectField;

    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long type_DPL_id;

    @InitOrder(value = "20")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder tariffList_DPL_collectField;

    @InitOrder(value = "21")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder services_DPL_collectField;

    @InitOrder(value = "22")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder states_DPL_collectField;

    @InitOrder(value = "23")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder productAssets_DPL_collectField;

    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long weight;

    @InitOrder(value = "25")
    @DataType(value = TransformType.LONG)
    public Long productCategory_DPL_id;

    @InitOrder(value = "26")
    @DataType(value = TransformType.LONG)
    public Long contract_DPL_id;

    @InitOrder(value = "27")
    @DataType(value = TransformType.LONG)
    public Long marketingDescription_DPL_id;

    @InitOrder(value = "28")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @InitOrder(value = "29")
    @DataType(value = TransformType.LONG)
    public Long parentObjId;

    @InitOrder(value = "30")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder searchIdentifier_DPL_collectField;

    @InitOrder(value = "31")
    @DataType(value = TransformType.LONG)
    public Long objectid;
}

