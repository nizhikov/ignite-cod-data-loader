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
public class PublishedContractLink {

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
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long templateId;

    @OraName(value = "code")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "contract")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long contract_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "contract_DPL_id")
    public Long contract_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "contract_DPL_id")
    public Long contract_DPL_rootId;

    @OraName(value = "relatedRole")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long relatedRole_DPL_id;

    @OraName(value = "category")
    @InitOrder(value = "9")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "beginDate")
    @InitOrder(value = "10")
    @DataType(value = TransformType.DATE_TIME)
    public Date сloseDate;

    @OraName(value = "endDate")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "partitionid")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

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
