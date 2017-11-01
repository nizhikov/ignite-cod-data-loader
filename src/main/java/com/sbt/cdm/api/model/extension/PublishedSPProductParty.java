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
public class PublishedSPProductParty {

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

    @OraName(value = "account")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String account;

    @OraName(value = "lastInvoiceDate")
    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date lastInvoiceDate;

    @OraName(value = "dateEndPrivelege")
    @InitOrder(value = "9")
    @DataType(value = TransformType.DATE_TIME)
    public Date dateEndPrivelege;

    @OraName(value = "numAction")
    @InitOrder(value = "10")
    @DataType(value = TransformType.INTEGER)
    public Integer numAction;

    @OraName(value = "branch")
    @InitOrder(value = "11")
    @DataType(value = TransformType.INTEGER)
    public Integer branch;

    @OraName(value = "office")
    @InitOrder(value = "12")
    @DataType(value = TransformType.INTEGER)
    public Integer office;

    @OraName(value = "clerkCode")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    public Long clerkCode;

    @OraName(value = "clerkFio")
    @InitOrder(value = "14")
    @DataType(value = TransformType.STRING)
    public String clerkFio;

    @OraName(value = "clerkLogin")
    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String clerkLogin;

    @OraName(value = "clerkIP")
    @InitOrder(value = "16")
    @DataType(value = TransformType.STRING)
    public String clerkIP;

    @OraName(value = "migration")
    @InitOrder(value = "17")
    @DataType(value = TransformType.INTEGER)
    public Integer migration;

    @OraName(value = "opDate")
    @InitOrder(value = "18")
    @DataType(value = TransformType.DATE_TIME)
    public Date opDate;

    @OraName(value = "productVersion")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long productVersion;

    @OraName(value = "lastMonitoringDate")
    @InitOrder(value = "20")
    @DataType(value = TransformType.DATE_TIME)
    public Date lastMonitoringDate;

    @OraName(value = "badMonitoringCheckCode")
    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String badMonitoringCheckCode;

    @OraName(value = "monitoringStatus")
    @InitOrder(value = "22")
    @DataType(value = TransformType.STRING)
    public String monitoringStatus;

    @OraName(value = "eksClientId")
    @InitOrder(value = "23")
    @DataType(value = TransformType.LONG)
    public Long eksClientId;

    @OraName(value = "name")
    @InitOrder(value = "24")
    @DataType(value = TransformType.STRING)
    public String orgName;

    @OraName(value = "tinInfo")
    @InitOrder(value = "25")
    @DataType(value = TransformType.STRING)
    public String tinInfo;

    @OraName(value = "stateRegNum")
    @InitOrder(value = "26")
    @DataType(value = TransformType.STRING)
    public String stateRegNum;

    @OraName(value = "kioInfo")
    @InitOrder(value = "27")
    @DataType(value = TransformType.STRING)
    public String kioInfo;

    @OraName(value = "crmClientID")
    @InitOrder(value = "28")
    @DataType(value = TransformType.STRING)
    public String crmClientID;

    @OraName(value = "kppInfo")
    @InitOrder(value = "29")
    @DataType(value = TransformType.STRING)
    public String kppInfo;

    @OraName(value = "kodmanager")
    @InitOrder(value = "30")
    @DataType(value = TransformType.STRING)
    public String kodmanager;

    @OraName(value = "branchZone")
    @InitOrder(value = "31")
    @DataType(value = TransformType.INTEGER)
    public Integer branchZone;

    @OraName(value = "officeZone")
    @InitOrder(value = "32")
    @DataType(value = TransformType.INTEGER)
    public Integer officeZone;

    @OraName(value = "clntType")
    @InitOrder(value = "33")
    @DataType(value = TransformType.INTEGER)
    public Integer clntType;

    @OraName(value = "typeClose")
    @InitOrder(value = "34")
    @DataType(value = TransformType.INTEGER)
    public Integer typeClose;

    @OraName(value = "comm")
    @InitOrder(value = "35")
    @DataType(value = TransformType.STRING)
    public String comm;

    @OraName(value = "clReason")
    @InitOrder(value = "36")
    @DataType(value = TransformType.INTEGER)
    public Integer clReason;

    @OraName(value = "clComment")
    @InitOrder(value = "37")
    @DataType(value = TransformType.STRING)
    public String clComment;

    @OraName(value = "secondOpen")
    @InitOrder(value = "38")
    @DataType(value = TransformType.INTEGER)
    public Integer secondOpen;

    @OraName(value = "psControl")
    @InitOrder(value = "39")
    @DataType(value = TransformType.INTEGER)
    public Integer psControl;

    @OraName(value = "condNum")
    @InitOrder(value = "40")
    @DataType(value = TransformType.INTEGER)
    public Integer condNum;

    @OraName(value = "codId")
    @InitOrder(value = "41")
    @DataType(value = TransformType.STRING)
    public String codId;

    @OraName(value = "isOperat")
    @InitOrder(value = "42")
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
