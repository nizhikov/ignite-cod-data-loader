/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.model.extension.deposit;

import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class HsCertificate {

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

    @OraName(value = "documentid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long docInst_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "docInst_DPL_id")
    @Default(value = "0")
    public Long docInst_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "docInst_DPL_id")
    @Default(value = "0")
    public Long docInst_DPL_rootId;

    @OraName(value = "H_ADDNUMBER")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long addnumber;

    @OraName(value = "H_AREA")
    @InitOrder(value = "6")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal area;

    @OraName(value = "H_AUTHORITY")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String authority;

    @OraName(value = "H_BANKACCOUNT")
    @InitOrder(value = "8")
    @DataType(value = TransformType.STRING)
    public String bankaccount;

    @OraName(value = "H_BANKBIC")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String bankbic;

    @OraName(value = "H_BANKNAME")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String bankname;

    @OraName(value = "H_DOCDATE")
    @InitOrder(value = "11")
    @DataType(value = TransformType.DATE_TIME)
    public Date docdate;

    @OraName(value = "H_DOCNUMBER")
    @InitOrder(value = "12")
    @DataType(value = TransformType.STRING)
    public String docnumber;

    @OraName(value = "H_DOCORIGINATOR")
    @InitOrder(value = "13")
    @DataType(value = TransformType.STRING)
    public String docoriginator;

    @OraName(value = "H_EXECDATE")
    @InitOrder(value = "14")
    @DataType(value = TransformType.DATE_TIME)
    public Date execdate;

    @OraName(value = "H_EXECORDER")
    @InitOrder(value = "15")
    @DataType(value = TransformType.STRING)
    public String execorder;

    @OraName(value = "H_F190NUMBER")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long f190number;

    @OraName(value = "H_FILIAL")
    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long office;

    @OraName(value = "H_FNUMBER")
    @InitOrder(value = "18")
    @DataType(value = TransformType.LONG)
    public Long fnumber;

    @OraName(value = "H_ID_MEGA")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long tb;

    @OraName(value = "H_ISCHECKED")
    @InitOrder(value = "20")
    @DataType(value = TransformType.LONG)
    public Long isChecked;

    @OraName(value = "H_KBK")
    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String hscertificateKbk;

    @OraName(value = "H_KPP")
    @InitOrder(value = "22")
    @DataType(value = TransformType.STRING)
    public String kpp;

    @OraName(value = "H_OKTMO")
    @InitOrder(value = "23")
    @DataType(value = TransformType.STRING)
    public String hscertificateOktmo;

    @OraName(value = "H_OSB")
    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long branchno;

    @OraName(value = "H_PAYMENTSUM")
    @InitOrder(value = "25")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal paymentSum;

    @OraName(value = "H_PURPOSE")
    @InitOrder(value = "26")
    @DataType(value = TransformType.STRING)
    public String purpose;

    @OraName(value = "H_RECACCOUNT")
    @InitOrder(value = "27")
    @DataType(value = TransformType.STRING)
    public String recAccount;

    @OraName(value = "H_RECINN")
    @InitOrder(value = "28")
    @DataType(value = TransformType.STRING)
    public String recInn;

    @OraName(value = "H_RECNAME")
    @InitOrder(value = "29")
    @DataType(value = TransformType.STRING)
    public String recName;

    @OraName(value = "H_RECTYPE")
    @InitOrder(value = "30")
    @DataType(value = TransformType.LONG)
    public Long recType;

    @OraName(value = "H_SSCODE")
    @InitOrder(value = "31")
    @DataType(value = TransformType.LONG)
    public Long ssCode;

    @OraName(value = "H_STATE")
    @InitOrder(value = "32")
    @DataType(value = TransformType.LONG)
    public Long state;

    @OraName(value = "H_TOWN")
    @InitOrder(value = "33")
    @DataType(value = TransformType.STRING)
    public String town;

    @OraName(value = "H_YIP")
    @InitOrder(value = "34")
    @DataType(value = TransformType.STRING)
    public String hscertificateYip;

    public Long hscertificateAgreement;

    @OraName(value = "HscertificateAgreement")
    @InitOrder(value = "35")
    @DataType(value = TransformType.LONG)
    public Long hsAgreement_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "hsAgreement_DPL_id")
    @Default(value = "0")
    public Long hsAgreement_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "hsAgreement_DPL_id")
    @Default(value = "0")
    public Long hsAgreement_DPL_rootId;

//    @OraName(value = "Deposit")
//    @InitOrder(value = "36")
//    @DataType(value = TransformType.LONG)
//    public Long productParty_DPL_id;
//
//    @DataType(value = TransformType.PARTITION)
//    @PartForField(value = "productParty_DPL_id")
//    @Default(value = "0")
//    public Long productParty_DPL_colocationKey;
//
//    @DataType(value = TransformType.ROOT)
//    @PartForField(value = "productParty_DPL_id")
//    @Default(value = "0")
//    public Long productParty_DPL_rootId;

    @OraName(value = "category")
    @InitOrder(value = "37")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;


    @OraName(value = "partitionid")
    @InitOrder(value = "38")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    public String scheduleServiceRun;

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
