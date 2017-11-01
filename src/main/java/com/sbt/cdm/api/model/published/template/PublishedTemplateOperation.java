package com.sbt.cdm.api.model.published.template;

import ru.sbt.kmdtransform.DataType;
import ru.sbt.kmdtransform.IdField;
import ru.sbt.kmdtransform.InitOrder;
import ru.sbt.kmdtransform.TransformType;

import java.util.Date;

public class PublishedTemplateOperation {

    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @InitOrder(value = "2")
    @DataType(value = TransformType.STRING)
    public String name;

    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    public Long idMDMP;

    @InitOrder(value = "4")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String ownerId;

    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public Long templObj_DPL_id;

    @InitOrder(value = "7")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String createdByMode;

    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public Long sourceId;

    @InitOrder(value = "11")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder registers_DPL_collectField;

    @InitOrder(value = "12")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder calcTempl_DPL_collectField;

    @InitOrder(value = "13")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder rate_DPL_collectField;

    @InitOrder(value = "14")
    @DataType(value = TransformType.LONG)
    public Long process_DPL_id;

    @InitOrder(value = "15")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder states_DPL_collectField;

    @InitOrder(value = "16")
    @DataType(value = TransformType.STRING)
    public String description;

    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long templObjId;

    @InitOrder(value = "18")
    @DataType(value = TransformType.LONG)
    public Long type_DPL_id;

    @InitOrder(value = "19")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder inParameters_DPL_collectField;

    @InitOrder(value = "20")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder outParameters_DPL_collectField;

    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String transactionTag;

    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    public Long parentObjId;

    @InitOrder(value = "23")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder notice_DPL_collectField;

    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long sourceSystemId_DPL_id;

    @InitOrder(value = "25")
    @DataType(value = TransformType.LONG)
    public Long status_DPL_id;

    @InitOrder(value = "26")
    @DataType(value = TransformType.LONG)
    public Long request_DPL_id;

    @InitOrder(value = "27")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @InitOrder(value = "28")
    @DataType(value = TransformType.STRING)
    public String code;

    @InitOrder(value = "29")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder accEvents_DPL_collectField;

    @InitOrder(value = "30")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder actionTempl_DPL_collectField;

    @InitOrder(value = "31")
    @DataType(value = TransformType.LONG)
    public Long service_DPL_id;

    @InitOrder(value = "32")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder step_DPL_collectField;

    @InitOrder(value = "33")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder accessTools_DPL_collectField;

    @InitOrder(value = "34")
    @DataType(value = TransformType.STRING)
    public String objectid;
}
