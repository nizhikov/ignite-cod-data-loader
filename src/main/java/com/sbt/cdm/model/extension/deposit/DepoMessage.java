/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.model.extension.deposit;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class DepoMessage {

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

    @OraName(value = "templateId")
    @DataType(value = TransformType.LONG)
    public Long templateId;

    @OraName(value = "productid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long productParty_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "productParty_DPL_id")
    @Default(value = "0")
    public Long productParty_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "productParty_DPL_id")
    @Default(value = "0")
    public Long productParty_DPL_rootId;

    @OraName(value = "D_KIND")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long depomessKind;

    @OraName(value = "D_TXT")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String depomessTxt;

    @OraName(value = "category")
    @InitOrder(value = "7")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "partitionid")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    @OraName(value = "code")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "sourceid")
    @DataType(value = TransformType.STRING)
    public String sourceId;

    @OraName(value = "sourcesystemid")
    @DataType(value = TransformType.STRING)
    public String sourceSystemId;

    @OraName(value = "appid")
    @DataType(value = TransformType.LONG)
    public Long appId;

    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();

}
