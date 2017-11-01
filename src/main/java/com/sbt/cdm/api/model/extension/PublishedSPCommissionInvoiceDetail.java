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
public class PublishedSPCommissionInvoiceDetail {

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

    @OraName(value = "INVOICEID")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    public Long invoice_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "invoice_DPL_id")
    @Default(value = "0")
    public Long invoice_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "invoice_DPL_id")
    @Default(value = "0")
    public Long invoice_DPL_rootId;

    @OraName(value = "packageCode")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    public String packageCode;

    @OraName(value = "operDate")
    @InitOrder(value = "9")
    @DataType(value = TransformType.DATE_TIME)
    public Date operDate;

    @OraName(value = "startDate")
    @InitOrder(value = "10")
    @DataType(value = TransformType.DATE_TIME)
    public Date startDate;

    @OraName(value = "endDate")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "ucnOperationCode")
    @InitOrder(value = "12")
    @DataType(value = TransformType.STRING)
    public String ucnOperationCode;

    @OraName(value = "summPlan")
    @InitOrder(value = "13")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal summPlan;

    @OraName(value = "ucn")
    @InitOrder(value = "14")
    @DataType(value = TransformType.STRING)
    public String ucn;

    @OraName(value = "disclaimer")
    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String disclaimer;

    @OraName(value = "rateCode")
    @InitOrder(value = "16")
    @DataType(value = TransformType.STRING)
    public String rateCode;

    @OraName(value = "aggrBalance")
    @InitOrder(value = "17")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal aggrBalance;

    @OraName(value = "migration")
    @InitOrder(value = "18")
    @DataType(value = TransformType.INTEGER)
    public Integer migration;

    @OraName(value = "isOperat")
    @InitOrder(value = "19")
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
