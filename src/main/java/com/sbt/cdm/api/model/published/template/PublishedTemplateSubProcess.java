package com.sbt.cdm.api.model.published.template;

import ru.sbt.kmdtransform.DataType;
import ru.sbt.kmdtransform.IdField;
import ru.sbt.kmdtransform.InitOrder;
import ru.sbt.kmdtransform.TransformType;

/**
 * Created by sbt-skutin-dn on 03.08.2017.
 */
public class PublishedTemplateSubProcess {

    @InitOrder("17")
    @DataType(TransformType.LONG)
    @IdField("true")
    public Long id;
    @InitOrder("1")
    @DataType(TransformType.CSL_PARTICLES)
    public StringBuilder indicators_DPL_collectField;
    @InitOrder("2")
    @DataType(TransformType.CSL_PARTICLES)
    public StringBuilder parameters_DPL_collectField;
    @InitOrder("3")
    @DataType(TransformType.STRING)
    public String code;
    @InitOrder("4")
    @DataType(TransformType.LONG)
    public Long appModule_DPL_id;
    @InitOrder("5")
    @DataType(TransformType.LONG)
    public Long idMDMP;
    @InitOrder("6")
    @DataType(TransformType.STRING)
    public String description;
    @InitOrder("7")
    @DataType(TransformType.LONG)
    public Long templObjId;
    @InitOrder("8")
    @DataType(TransformType.STRING)
    public String ownerId;
    @InitOrder("9")
    @DataType(TransformType.CSL_PARTICLES)
    public StringBuilder steps_DPL_collectField;
    @InitOrder("10")
    @DataType(TransformType.LONG)
    public Long category_DPL_id;
    @InitOrder("11")
    @DataType(TransformType.LONG)
    public Long parentObjId;
    @InitOrder("12")
    @DataType(TransformType.CSL_PARTICLES)
    public StringBuilder operations_DPL_collectField;
    @InitOrder("13")
    @DataType(TransformType.STRING)
    public String name;
    @InitOrder("14")
    @DataType(TransformType.CSL_PARTICLES)
    public StringBuilder buisnessRoles_DPL_collectField;
    @InitOrder("15")
    @DataType(TransformType.LONG)
    public Long status_DPL_id;
    @InitOrder("16")
    @DataType(TransformType.LONG)
    public Long version_DPL_id;
    @InitOrder("18")
    @DataType(TransformType.LONG)
    public Long type_DPL_id;
    @InitOrder("19")
    @DataType(TransformType.STRING)
    public String objectid;

}
