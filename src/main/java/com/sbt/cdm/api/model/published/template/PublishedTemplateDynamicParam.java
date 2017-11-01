package com.sbt.cdm.api.model.published.template;

import ru.sbt.kmdtransform.DataType;
import ru.sbt.kmdtransform.IdField;
import ru.sbt.kmdtransform.InitOrder;
import ru.sbt.kmdtransform.TransformType;

/**
 * Created by sbt-skutin-dn on 03.08.2017.
 */
public class PublishedTemplateDynamicParam {

    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    public Long ownerType_DPL_id;

    @InitOrder(value = "2")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean isRequired;

    @InitOrder(value = "3")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @InitOrder(value = "4")
    @DataType(value = TransformType.STRING)
    public String code;

    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long idMDMP;

    @InitOrder(value = "6")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder valueMethodSet_DPL_collectField;

    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String description;

    @InitOrder(value = "8")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean readOnly;

    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String ownerId;

    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public Long paramType_DPL_id;

    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long calc_DPL_id;

    @InitOrder(value = "12")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder accessValues_DPL_collectField;

    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    public Long indicator_DPL_id;

    @InitOrder(value = "14")
    @DataType(value = TransformType.BOOLEAN)
    public Boolean keepInWorkflow;

    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String path;

    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long parentParam_DPL_id;

    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long ownerObjectId;

    @InitOrder(value = "18")
    @DataType(value = TransformType.STRING)
    public String name;

    @InitOrder(value = "20")
    @DataType(value = TransformType.STRING)
    public String value;

    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String objectId;
}
