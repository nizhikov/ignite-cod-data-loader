/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.extension;

import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedHsDeposit {

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

    @OraName(value = "contractid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long contract_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "contract_DPL_id")
    @Default(value = "0")
    public Long contract_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "contract_DPL_id")
    @Default(value = "0")
    public Long contract_DPL_rootId;

    @OraName(value = "H_AGR_SERIES")
    @InitOrder(value = "5")
    @DataType(value = TransformType.STRING)
    public String agrSeries;

    @OraName(value = "H_AGREEMENTS")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String agreements;

    @OraName(value = "H_AUTHORITY")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String authority;

    @OraName(value = "H_ID_MEGA")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    public Long hsdeposit_tb;

    @OraName(value = "H_OTHER_ACCOUNT")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String otherAccount;

    @OraName(value = "H_PROC_COUNT")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public Long procCount;

    @OraName(value = "H_STATE")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long state;

    @OraName(value = "H_SUBSIDY_AMOUNT")
    @InitOrder(value = "12")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal subsidyAmount;

    @OraName(value = "H_SUBSIDY_AMOUNT_USD")
    @InitOrder(value = "13")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal subsidyAmountUsd;

    @OraName(value = "H_TYPE")
    @InitOrder(value = "14")
    @DataType(value = TransformType.LONG)
    public Long type;

    @OraName(value = "H_OTHER_ACCOUNT_BRANCH")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    public Long otherAccountBranch;

    @OraName(value = "H_OTHER_ACCOUNT_OFFICE")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long otherAccountOffice;

    @OraName(value = "productid")
    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    @Default(value = "0")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    @Default(value = "0")
    public Long product_DPL_rootId;

    @OraName(value = "category")
    @InitOrder(value = "18")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    public Date depositOpenDay;

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

    public Long templObjId;

    public Long parentObjId;

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    public Long objectId;


    public boolean isDeleted=false;
    public Long lastChangeDate = System.currentTimeMillis();

}
