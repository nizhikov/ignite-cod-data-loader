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
public class PublishedContract {

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

//    @OraName(value = "parentId")
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long parentId;

    @OraName(value = "owner")
    @ClientField(value = "true")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long owner_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "owner_DPL_id")
    @Default(value = "0")
    public Long owner_DPL_colocationKey;

    @OraName(value = "products")
    @InitOrder(value = "6")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder products_DPL_collectField;

    @OraName(value = "a_number")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String number;

    @OraName(value = "type")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="type")
    public Long type_DPL_id;

    @OraName(value = "code")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "status")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    @DictName(value="status")
    public Long status_DPL_id;

//    @OraName(value = "request")
//    @InitOrder(value = "12")
//    @DataType(value = TransformType.LONG)
//    @Default(value = "0")
//    public Long request_DPL_id;
//
//    @DataType(value = TransformType.PARTITION)
//    @PartForField(value = "request_DPL_id")
//    public Long reques_DPL_colocationKey;

    @OraName(value = "signatories")
    @InitOrder(value = "13")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder signatories_DPL_collectField;

    @OraName(value = "lawConditions")
    @InitOrder(value = "14")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder lawConditions_DPL_collectField;

    @OraName(value = "printForm")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long printForm_DPL_id;

    @OraName(value = "addContracts")
    @InitOrder(value = "16")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder addContracts_DPL_collectField;

    @OraName(value = "signDate")
    @InitOrder(value = "17")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @InitOrder(value = "18")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "closeDate")
    @InitOrder(value = "19")
    @DataType(value = TransformType.DATE_TIME)
    public Date closeDate;

    @OraName(value = "actualOperation")
    @InitOrder(value = "20")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long actualOperation_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "actualOperation_DPL_id")
    public Long actualOperation_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "actualOperation_DPL_id")
    public Long actualOperation_DPL_rootId;

    @OraName(value = "relatedContracts")
    @InitOrder(value = "21")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder relatedContracts_DPL_collectField;

    @OraName(value = "parameters")
    @InitOrder(value = "22")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @OraName(value = "category")
    @InitOrder(value = "23")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @DataType(value = TransformType.LONG)
    @Default(value = "0")

    public Long reason_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "25")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    public Long scan_DPL_id;
    public Long scan_DPL_colocationKey;
    public Long scans_DPL_rootId;

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

    public Long templateContract_DPL_id;

    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();






}
