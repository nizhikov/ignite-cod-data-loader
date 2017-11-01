package com.sbt.cdm.api.model.published.template;

import ru.sbt.kmdtransform.DataType;
import ru.sbt.kmdtransform.IdField;
import ru.sbt.kmdtransform.InitOrder;
import ru.sbt.kmdtransform.TransformType;

import java.util.Date;

/**
 * Created by sbt-skutin-dn on 06.09.2017.
 */
public class PublishedTemplateService {
        @InitOrder("1")
        @DataType(TransformType.LONG)
        @IdField("true")
        public Long id;
        @InitOrder("2")
        @DataType(TransformType.STRING)
        public String name;
        @InitOrder("3")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder outParameters_DPL_collectField;
        @InitOrder("4")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder parameters_DPL_collectField;
        @InitOrder("5")
        @DataType(TransformType.STRING)
        public String code;
        @InitOrder("6")
        @DataType(TransformType.DATE_TIME)
        public Date endDate;
        @InitOrder("7")
        @DataType(TransformType.LONG)
        public Long idMDMP;
        @InitOrder("8")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder indicatorInst_DPL_collectField;
        @InitOrder("9")
        @DataType(TransformType.STRING)
        public String description;
        @InitOrder("10")
        @DataType(TransformType.LONG)
        public Long templObjId;
        @InitOrder("11")
        @DataType(TransformType.STRING)
        public String ownerId;
        @InitOrder("12")
        @DataType(TransformType.LONG)
        public Long serviceCategory_DPL_id;
        @InitOrder("13")
        @DataType(TransformType.LONG)
        public Long templObj_DPL_id;
        @InitOrder("14")
        @DataType(TransformType.LONG)
        public Long category_DPL_id;
        @InitOrder("15")
        @DataType(TransformType.STRING)
        public String transactionTags;
        @InitOrder("16")
        @DataType(TransformType.BOOLEAN)
        public Boolean isExclusive;
        @InitOrder("17")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder registers_DPL_collectField;
        @InitOrder("18")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder parties_DPL_collectField;
        @InitOrder("19")
        @DataType(TransformType.LONG)
        public Long status_DPL_id;
        @InitOrder("20")
        @DataType(TransformType.LONG)
        public Long version_DPL_id;
        @InitOrder("21")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder accessTools_DPL_collectField;
        @InitOrder("22")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder subProcesses_DPL_collectField;
        @InitOrder("23")
        @DataType(TransformType.LONG)
        public Long product_DPL_id;
        @InitOrder("24")
        @DataType(TransformType.LONG)
        public Long type_DPL_id;
        @InitOrder("25")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder accEvents_DPL_collectField;
        @InitOrder("26")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder states_DPL_collectField;
        @InitOrder("27")
        @DataType(TransformType.BOOLEAN)
        public Boolean visible;
        @InitOrder("28")
        @DataType(TransformType.LONG)
        public Long weight;
        @InitOrder("29")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder reglaments_DPL_collectField;
        @InitOrder("30")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder documents_DPL_collectField;
        @InitOrder("31")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder createdRequests_DPL_collectField;
        @InitOrder("32")
        @DataType(TransformType.BOOLEAN)
        public Boolean isInternal;
        @InitOrder("33")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder inParameters_DPL_collectField;
        @InitOrder("34")
        @DataType(TransformType.DATE_TIME)
        public Date beginDate;
        @InitOrder("35")
        @DataType(TransformType.LONG)
        public Long parentObjId;
        @InitOrder("36")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder noticeTempl_DPL_collectField;
        @InitOrder("37")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder operations_DPL_collectField;
        @InitOrder("38")
        @DataType(TransformType.CSL_PARTICLES)
        public StringBuilder ratePlan_DPL_collectField;

        @InitOrder("39")
        @DataType(TransformType.STRING)
        public String objectid;

        @InitOrder("40")
        @DataType(TransformType.LONG)
        public Long initRequest_DPL_id;

}
