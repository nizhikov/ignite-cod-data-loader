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
public class PublishedProductParty {

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

    @OraName(value = "description")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long description_DPL_id;

    @OraName(value = "owner")
    @ClientField(value = "true")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long owner_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "owner_DPL_id")
    public Long owner_DPL_colocationKey;

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

    @OraName(value = "states")
    @InitOrder(value = "12")
    @DataType(value = TransformType.CSL_DICTS)
    public StringBuilder states_DPL_collectField;

    @OraName(value = "contract")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long contract_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "contract_DPL_id")
    public Long contract_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "contract_DPL_id")
    public Long contract_DPL_rootId;

    @OraName(value = "registers")
    @InitOrder(value = "14")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder registers_DPL_collectField;

    @OraName(value = "custServices")
    @InitOrder(value = "15")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder custServices_DPL_collectField;

    @OraName(value = "planServices")
    @InitOrder(value = "16")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder planServices_DPL_collectField;

    @OraName(value = "performedServices")
    @InitOrder(value = "17")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder performedServices_DPL_collectField;

    @OraName(value = "performedOperations")
    @InitOrder(value = "18")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder performedOperations_DPL_collectField;


    @OraName(value = "accessTools")
    @InitOrder(value = "19")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder accessTools_DPL_collectField;


    @OraName(value = "productIdentifiers")
    @InitOrder(value = "20")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder searchIdentifier_DPL_collectField;

    @OraName(value = "productIndicators")
    @InitOrder(value = "21")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder indicators_DPL_collectField;

    @OraName(value = "tariffList")
    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    public Long tariffList_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "tariffList_DPL_id")
    public Long tariffList_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "tariffList_DPL_id")
    public Long tariffList_DPL_rootId;

    @OraName(value = "beginDate")
    @InitOrder(value = "23")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @InitOrder(value = "24")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "endFactDate")
    @InitOrder(value = "25")
    @DataType(value = TransformType.DATE_TIME)
    public Date endFactDate;

    @OraName(value = "productPartyRoles")
    @InitOrder(value = "26")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder productPartyRoles_DPL_collectField;

    @OraName(value = "relatedProducts")
    @InitOrder(value = "27")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder relatedProducts_DPL_collectField;

    @OraName(value = "comment")
    @InitOrder(value = "28")
    @DataType(value = TransformType.STRING)
    public String comment;

    @OraName(value = "assets")
    @InitOrder(value = "29")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder assets_DPL_collectField;

    @OraName(value = "division")
    @InitOrder(value = "30")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="department")
    public Long division_DPL_id;

    @OraName(value = "version")
    @InitOrder(value = "31")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long version_DPL_id;

    @OraName(value = "parameters")
    @InitOrder(value = "32")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @OraName(value = "category")
    @InitOrder(value = "33")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "reason")
    @InitOrder(value = "34")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long reason_DPL_id;

    @OraName(value = "documents")
    @InitOrder(value = "35")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder documents_DPL_collectField;

    @OraName(value = "partitionid")
    @InitOrder(value = "36")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    public String description;

    @OraName(value = "sourceid")
    @DataType(value = TransformType.STRING)
    public String sourceId;

    @OraName(value = "sourcesystemid")
    @DataType(value = TransformType.STRING)
    public String sourceSystemId;

    @OraName(value = "templateId")
    @InitOrder(value = "4")
//    @Default(value = "-9223372036853775642")
    @DataType(value = TransformType.LONG)
    @DictName(value = "product")
    public Long templObjId;

    public Long parentObjId;
    public String ownerId;

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    public Long objectId;

    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();
}
