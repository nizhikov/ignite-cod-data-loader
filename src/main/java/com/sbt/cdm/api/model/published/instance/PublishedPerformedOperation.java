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
public class PublishedPerformedOperation {

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

//    @OraName(value = "parentId")
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long parentId;

    @OraName(value = "process")
//    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long subProcess_DPL_id;

    @OraName(value = "type")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="type")
    public Long type_DPL_id;

    @OraName(value = "code")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "status")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    @DictName(value="status")
    public Long status_DPL_id;

    @OraName(value = "states")
    @InitOrder(value = "10")
    @DataType(value = TransformType.CSL_DICTS)
    @DictName(value="state")
    public StringBuilder states_DPL_collectField;

    @OraName(value = "service")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long service_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "service_DPL_id")
    public Long service_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "service_DPL_id")
    public Long service_DPL_rootId;

    @OraName(value = "client")
    @ClientField(value = "true")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long client_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "client_DPL_id")
    public Long client_DPL_colocationKey;

    @OraName(value = "product")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_rootId;

    @OraName(value = "contract")
    @InitOrder(value = "14")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long contract_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "contract_DPL_id")
    public Long contract_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "contract_DPL_id")
    public Long contract_DPL_rootId;

    @OraName(value = "register")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long register_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "register_DPL_id")
    public Long register_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "register_DPL_id")
    public Long register_DPL_rootId;

//    @OraName(value = "registers")
//    @InitOrder(value = "15")
//    @DataType(value = TransformType.CSL_PARTICLES)
//    public StringBuilder registers_DPL_collectField;

    @OraName(value = "beginDate")
    @InitOrder(value = "16")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @InitOrder(value = "17")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "division")
    @InitOrder(value = "18")
    @DataType(value = TransformType.LONG)
    @DictName(value="department")
    public Long division_DPL_id;

    @OraName(value = "parameters")
    @InitOrder(value = "19")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @OraName(value = "ruleTemplate")
    @DataType(value = TransformType.LONG)
    public Long ruleTemplate_DPL_id;

    @OraName(value = "category")
    @InitOrder(value = "20")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "registerRec")
    @InitOrder(value = "21")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder registerRec_DPL_collectField;


    @OraName(value = "partitionid")
    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder actions_DPL_collectField;

    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long notice_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "notice_DPL_id")
    public Long notice_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "notice_DPL_id")
    public Long notice_DPL_rootId;

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

    @OraName(value = "request")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long request_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "request_DPL_id")
    public Long request_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "request_DPL_id")
    public Long request_DPL_rootId;

    public StringBuilder inParameters_DPL_collectField;
    public StringBuilder outParameters_DPL_collectField;
    public String transactionTag;
    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();
}
