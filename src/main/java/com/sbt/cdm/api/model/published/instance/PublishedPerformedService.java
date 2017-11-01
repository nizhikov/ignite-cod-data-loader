/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.published.instance;

import ru.sbt.kmdtransform.*;

import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedPerformedService {

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
////    @InitOrder(value = "3")
//    @DataType(value = TransformType.LONG)
//    public Long templateId;
//
//    @OraName(value = "parentId")
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long parentId;

    @OraName(value = "type")
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

    @OraName(value = "owner")
    @ClientField(value = "true")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long owner_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "owner_DPL_id")
    public Long owner_DPL_colocationKey;

    @OraName(value = "parties")
    @InitOrder(value = "9")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parties_DPL_collectField;

    @OraName(value = "product")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_rootId;

//    @OraName(value = "request")
//    @InitOrder(value = "11")
//    @DataType(value = TransformType.LONG)
//    @Default(value = "0")
//    public Long request_DPL_id;
//
//    @DataType(value = TransformType.PARTITION)
//    @PartForField(value = "request_DPL_id")
//    public Long request_DPL_colocationKey;

    @OraName(value = "process")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="process")
    public Long subProcess_DPL_id;

    @OraName(value = "custService")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long custService_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "custService_DPL_id")
    public Long custService_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "custService_DPL_id")
    @Default(value = "0")
    public Long custService_DPL_rootId;

    @OraName(value = "operations")
    @InitOrder(value = "14")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder performedOperations_DPL_collectField;

    @OraName(value = "serviceRegisters")
    @InitOrder(value = "15")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder serviceRegisters_DPL_collectField;

    @OraName(value = "beginDate")
    @InitOrder(value = "16")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @InitOrder(value = "17")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "createdRequests")
    @InitOrder(value = "18")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder createdRequests_DPL_collectField;

    @OraName(value = "documents")
    @InitOrder(value = "19")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder documents_DPL_collectField;

    @OraName(value = "serviceAccessTools")
    @InitOrder(value = "20")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder serviceAccessTools_DPL_collectField;

    @OraName(value = "status")
    @InitOrder(value = "21")
    @DataType(value = TransformType.LONG)
    @DictName(value="status")
    public Long status_DPL_id;

    @OraName(value = "states")
    @InitOrder(value = "22")
    @DataType(value = TransformType.CSL_DICTS)
    public StringBuilder states_DPL_collectField;

    @OraName(value = "transactionTags")
    @InitOrder(value = "23")
    @DataType(value = TransformType.STRING)
    public String transactionTags;

//    @OraName(value = "accEvents")
//    @InitOrder(value = "24")
//    @DataType(value = TransformType.CSL_PARTICLES)
//    public StringBuilder accEvents_DPL_collectField;

//    @OraName(value = "division")
//    @InitOrder(value = "25")
//    @DataType(value = TransformType.LONG)
//    @Default(value = "0")
//    @DictName(value="department")
    public Long division_DPL_id = 0l;

    @OraName(value = "parameters")
    @InitOrder(value = "26")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @DataType(value = TransformType.LONG)
    public Long businessService_DPL_id;

    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder indicators_DPL_collectField;

    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder notices_DPL_collectField;

    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long ratePlan_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "ratePlan_DPL_id")
    public Long ratePlan_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "ratePlan_DPL_id")
    public Long ratePlan_DPL_rootId;

    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long initRquest_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "initRquest_DPL_id")
    public Long initRquest_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "initRquest_DPL_id")
    public Long initRquest_DPL_rootId;

    @OraName(value = "category")
    @InitOrder(value = "27")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "partitionid")
    @InitOrder(value = "28")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;


    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long reason_DPL_id;

    public StringBuilder inParameters_DPL_collectField;
    public StringBuilder outParameters_DPL_collectField;
    public String globalProcessId;

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
