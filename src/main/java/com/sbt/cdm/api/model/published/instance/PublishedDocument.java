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
public class PublishedDocument {

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
    public Long client_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "client_DPL_id")
    @Default(value = "0")
    public Long client_DPL_colocationKey;

    @OraName(value = "number")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String docNum;

    @OraName(value = "CREATEDATE")
    @InitOrder(value = "10")
    @DataType(value = TransformType.DATE_TIME)
    public Date createDate;

    @OraName(value = "receiveDate")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date receiveDate;

    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "parameters")
    @InitOrder(value = "12")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parties_DPL_collectField;

    @OraName(value = "issuing")
    @InitOrder(value = "13")
    @DataType(value = TransformType.STRING)
    public String issuing;

    @DataType(value = TransformType.STRING)
    public String issuerCode;

    @OraName(value = "docScan")
    @InitOrder(value = "14")
    @DataType(value = TransformType.STRING)
    public String docScan;

    @DataType(value = TransformType.STRING)
    public String docSer;

    @OraName(value = "formType")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    public Long docForm_DPL_id;

    @OraName(value = "status")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    @DictName(value="status")
    public Long status_DPL_id;

    @DataType(value = TransformType.CSL_DICTS)
    public StringBuilder state_DPL_collectField;

    @DataType(value = TransformType.LONG)
    public Long version_DPL_id;

    @OraName(value = "category")
    @InitOrder(value = "17")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "18")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long reason_DPL_id;

    public Long documentIdentifier;
    public String issuedByOrganization;
    public Date plannedEndDate;
//    public Long num;
//    public Date issuedDate;
    public String changeReason;
    public Date updDate;

    public Long templateDocument_DPL_id;

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



    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();
}

