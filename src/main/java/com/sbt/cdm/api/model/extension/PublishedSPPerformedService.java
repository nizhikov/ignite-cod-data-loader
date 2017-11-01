/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.extension;

import ru.sbt.kmdtransform.*;

import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedSPPerformedService {

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

    @OraName(value = "performedService")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long service_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "service_DPL_id")
    @Default(value = "0")
    public Long service_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "service_DPL_id")
    @Default(value = "0")
    public Long service_DPL_rootId;

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

    @OraName(value = "packageCode")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String packageCode;

    @OraName(value = "dateEndPrivelege")
    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateEndPrivelege;

    @OraName(value = "numAction")
    @InitOrder(value = "9")
    @DataType(value = TransformType.INTEGER)
    public Integer numAction;

    @OraName(value = "branch")
    @InitOrder(value = "10")
    @DataType(value = TransformType.INTEGER)
    public Integer branch;

    @OraName(value = "office")
    @InitOrder(value = "11")
    @DataType(value = TransformType.INTEGER)
    public Integer office;

    @OraName(value = "clerkCode")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long clerkCode;

    @OraName(value = "clerkFio")
    @InitOrder(value = "13")
    @DataType(value = TransformType.STRING)
    public String clerkFio;

    @OraName(value = "clerkLogin")
    @InitOrder(value = "14")
    @DataType(value = TransformType.STRING)
    public String clerkLogin;

    @OraName(value = "clerkIP")
    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String clerkIP;

    @OraName(value = "spConfirmedByCode")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long confirmedByCode;

    @OraName(value = "spConfirmedByFio")
    @InitOrder(value = "17")
    @DataType(value = TransformType.STRING)
    public String confirmedByFio;

    @OraName(value = "kod_manager")
    @InitOrder(value = "18")
    @DataType(value = TransformType.STRING)
    public String kodManager;

    @OraName(value = "branchZone")
    @InitOrder(value = "19")
    @DataType(value = TransformType.INTEGER)
    public Integer branchZone;

    @OraName(value = "officeZone")
    @InitOrder(value = "20")
    @DataType(value = TransformType.INTEGER)
    public Integer officeZone;

    @OraName(value = "migration")
    @InitOrder(value = "21")
    @DataType(value = TransformType.INTEGER)
    public Integer migration;

    @OraName(value = "cardNum")
    @InitOrder(value = "22")
    @DataType(value = TransformType.STRING)
    public String cardNum;

    @OraName(value = "clReason")
    @InitOrder(value = "23")
    @DataType(value = TransformType.INTEGER)
    public Integer clReason;

    @OraName(value = "clComment")
    @InitOrder(value = "24")
    @DataType(value = TransformType.STRING)
    public String clComment;

    @OraName(value = "secondOpen")
    @InitOrder(value = "25")
    @DataType(value = TransformType.INTEGER)
    public Integer secondOpen;

    @OraName(value = "startDate")
    @InitOrder(value = "26")
    @DataType(value = TransformType.DATE_TIME)
    public Date startDate;

    @OraName(value = "endDate")
    @InitOrder(value = "27")
    @DataType(value = TransformType.DATE_TIME)
    public Date endDate;

    @OraName(value = "invoice")
    @InitOrder(value = "28")
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

    @OraName(value = "invoiceStatus")
    @InitOrder(value = "29")
    @DataType(value = TransformType.INTEGER)
    public Integer invoiceStatus;

    @OraName(value = "writeOffDetail")
    @InitOrder(value = "30")
    @DataType(value = TransformType.LONG)
    public Long writeOffDetail_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "writeOffDetail_DPL_id")
    @Default(value = "0")
    public Long writeOffDetail_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "writeOffDetail_DPL_id")
    @Default(value = "0")
    public Long writeOffDetail_DPL_rootId;

    @OraName(value = "signDateNew")
    @InitOrder(value = "31")
    @DataType(value = TransformType.DATE_TIME)
    public Date signDateNew;

    @OraName(value = "closeDateNew")
    @InitOrder(value = "32")
    @DataType(value = TransformType.DATE_TIME)
    public Date closeDateNew;

    @OraName(value = "cancelClose")
    @InitOrder(value = "33")
    @DataType(value = TransformType.INTEGER)
    public Integer cancelClose;

    @OraName(value = "isOperat")
    @InitOrder(value = "34")
    @DataType(value = TransformType.INTEGER)
    public Integer isOperat;

    @OraName(value = "category")
//    @InitOrder(value = "20")
    @Default(value = "0")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "code")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @DataType(value = TransformType.STRING)
    public String name;

    public String confirmedByLogin;
    public String accNum;
    public Integer psControl;
    public Integer condNum;
    public Integer confirmedFlag;

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
