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
public class PublishedAccessTool {

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

    @OraName(value = "accessToolType")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="type")
    public Long accessToolType_DPL_id;

    @OraName(value = "code")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "status")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="status")
    public Long  status_DPL_id;

    @OraName(value = "states")
    @DataType(value = TransformType.CSL_DICTS)
    public StringBuilder states_DPL_collectField;

    @OraName(value = "numberMask")
    @DataType(value = TransformType.STRING)
    public String numberMask;

    @OraName(value = "product")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_rootId;

    @OraName(value = "SBERBOOKID")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long sberBook_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "sberBook_DPL_id")
    public Long sberBook_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "sberBook_DPL_id")
    public Long sberBook_DPL_rootId;

    @OraName(value = "PLASTICCARDID")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long plasticCard_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "plasticCard_DPL_id")
    public Long plasticCard_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "plasticCard_DPL_id")
    public Long plasticCard_DPL_rootId;


    @OraName(value = "beginDate")
    @DataType(value = TransformType.DATE_TIME)
    public Date beginDate;

    @OraName(value = "endDate")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "dateRelease")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateRelease;

    @OraName(value = "parameters")
    @InitOrder(value = "10")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;
/*
    @OraName(value = "category")
    @InitOrder(value = "11")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;
*/


    @OraName(value = "partitionid")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;


    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long reason_DPL_id;

    @DataType(value = TransformType.STRING)
    public String role;

    public boolean locking=false;

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
