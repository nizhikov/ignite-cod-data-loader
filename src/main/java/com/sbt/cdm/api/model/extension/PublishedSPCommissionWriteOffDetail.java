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
public class PublishedSPCommissionWriteOffDetail {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @OraName(value = "partitionid")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

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

    @OraName(value = "product")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    @Default(value = "0")
    public Long productn_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    @Default(value = "0")
    public Long product_DPL_rootId;

    @OraName(value = "operation")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long operation_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "operation_DPL_id")
    @Default(value = "0")
    public Long operation_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "operation_DPL_id")
    @Default(value = "0")
    public Long operation_DPL_rootId;

    @OraName(value = "regionId")
    @InitOrder(value = "6")
    @DataType(value = TransformType.INTEGER)
    public Integer regionId;

    @OraName(value = "invoiceWriteOffStatus")
    @InitOrder(value = "7")
    @DataType(value = TransformType.INTEGER)
    public Integer invoiceWriteOffStatus;

    @OraName(value = "sourceType")
    @InitOrder(value = "8")
    @DataType(value = TransformType.INTEGER)
    public Integer sourceType;

    @OraName(value = "accNum")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String accNum;

    @OraName(value = "cardNum")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String cardNum;

    @OraName(value = "currencyIso")
    @InitOrder(value = "11")
    @DataType(value = TransformType.INTEGER)
    public Integer currencyIso;

    @OraName(value = "summaIn")
    @InitOrder(value = "12")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal summaIn;

    @OraName(value = "operDate")
    @InitOrder(value = "13")
    @DataType(value = TransformType.DATE_TIME)
    public Date operDate;

    @OraName(value = "srn")
    @InitOrder(value = "14")
    @DataType(value = TransformType.STRING)
    public String srn;

    @OraName(value = "messCode")
    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String messCode;

    @OraName(value = "docSource")
    @InitOrder(value = "16")
    @DataType(value = TransformType.STRING)
    public String docSource;

    @OraName(value = "currencyTransaction")
    @InitOrder(value = "17")
    @DataType(value = TransformType.INTEGER)
    public Integer currencyTransaction;

    @OraName(value = "dateReqFee")
    @InitOrder(value = "18")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateReqFee;

    @OraName(value = "rqUid")
    @InitOrder(value = "19")
    @DataType(value = TransformType.STRING)
    public String rqUid;

    @OraName(value = "dateFact")
    @InitOrder(value = "20")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateFact;

    @OraName(value = "rrnReqFee")
    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String rrnReqFee;

    @OraName(value = "summaOut")
    @InitOrder(value = "22")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal summaOut;

    @OraName(value = "summaOutVal")
    @InitOrder(value = "23")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal summaOutVal;

    @OraName(value = "errorCode")
    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long errorCode;

    @OraName(value = "errorDesc")
    @InitOrder(value = "25")
    @DataType(value = TransformType.STRING)
    public String errorDesc;

    @OraName(value = "operDateR")
    @InitOrder(value = "26")
    @DataType(value = TransformType.DATE_TIME)
    public Date operDateR;

    @OraName(value = "messCodeR")
    @InitOrder(value = "27")
    @DataType(value = TransformType.STRING)
    public String messCodeR;

    @OraName(value = "dateReqFeeR")
    @InitOrder(value = "28")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateReqFeeR;

    @OraName(value = "dateFactR")
    @InitOrder(value = "29")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateFactR;

    @OraName(value = "rrnReqFeeR")
    @InitOrder(value = "30")
    @DataType(value = TransformType.STRING)
    public String rrnReqFeeR;

    @OraName(value = "summaOutValR")
    @InitOrder(value = "31")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal summaOutValR;

    @OraName(value = "errorCodeR")
    @InitOrder(value = "32")
    @DataType(value = TransformType.LONG)
    public Long errorCodeR;

    @OraName(value = "errorDescR")
    @InitOrder(value = "33")
    @DataType(value = TransformType.STRING)
    public String errorDescR;

    @OraName(value = "migration")
    @InitOrder(value = "34")
    @DataType(value = TransformType.INTEGER)
    public Integer migration;

    @OraName(value = "isOperat")
    @InitOrder(value = "35")
    @DataType(value = TransformType.INTEGER)
    public Integer isOperat;

    @OraName(value = "category")
//    @InitOrder(value = "20")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "code")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @DataType(value = TransformType.STRING)
    public String name;

    public Long commissionWriteOffHistory_DPL_id;
    public Long commissionWriteOffHistory_DPL_colocationKey;
    public Long commissionWriteOffHistory_DPL_rootId;


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
