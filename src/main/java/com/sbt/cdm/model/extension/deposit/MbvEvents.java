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
public class MbvEvents {

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

    @OraName(value = "operationid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long operationRun_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    public Long operationRun_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    public Long operationRun_DPL_rootId;

    @OraName(value = "M_BALANCE")
    @InitOrder(value = "5")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal mbveventsBalance;

    @OraName(value = "M_BIRTHDAY_NEW")
    @InitOrder(value = "6")
    @DataType(value = TransformType.DATE_TIME)
    public Date mbveventsBirthdayNew;

    @OraName(value = "M_BIRTHDAY_OLD")
    @InitOrder(value = "7")
    @DataType(value = TransformType.DATE_TIME)
    public Date mbveventsBirthdayOld;

    @OraName(value = "M_BRANCHNO")
    @InitOrder(value = "8")
    @DataType(value = TransformType.LONG)
    public Long mbvevents_branchno;

    @OraName(value = "M_CREATETIME")
    @InitOrder(value = "9")
    @DataType(value = TransformType.DATE_TIME)
    public Date mbveventsCreatetime;

    @OraName(value = "M_CURRENCY")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    public Long mbveventsCurrency;

    @OraName(value = "M_DBRANCHNO")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long mbveventsDbranchno;

    @OraName(value = "M_DOFFICE")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long mbveventsDoffice;

    @OraName(value = "M_EXCEEDSUM")
    @InitOrder(value = "13")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal mbveventsExceedsum;

    @OraName(value = "M_EXTERNALKIND")
    @InitOrder(value = "14")
    @DataType(value = TransformType.LONG)
    public Long mbveventsExternalkind;

    @OraName(value = "M_FNUMBER")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    public Long mbveventsFnumber;

    @OraName(value = "M_HISTSTATE")
    @InitOrder(value = "16")
    @DataType(value = TransformType.LONG)
    public Long mbveventsHiststate;

    @OraName(value = "M_IDOC_ACC_H2_MAJOR")
    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIdocAccH2Major;

    @OraName(value = "M_IDOC_ACC_H2_MINOR")
    @InitOrder(value = "18")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIdocAccH2Minor;

    @OraName(value = "M_ISARRESTED")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsarrested;

    @OraName(value = "M_ISBANKSERVCOMM")
    @InitOrder(value = "20")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsbankservcomm;

    @OraName(value = "M_ISDULCHANGED")
    @InitOrder(value = "21")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsdulchanged;

    @OraName(value = "M_ISF190")
    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsf190;

    @OraName(value = "M_ISINTERESTCHANGED")
    @InitOrder(value = "23")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsinterestchanged;

    @OraName(value = "M_ISOPENED")
    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsopened;

    @OraName(value = "M_ISPERMCHANGED")
    @InitOrder(value = "25")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIspermchanged;

    @OraName(value = "M_ISSVBOOKDUPL")
    @InitOrder(value = "26")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIssvbookdupl;

    @OraName(value = "M_ISTERMINATED")
    @InitOrder(value = "27")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsterminated;

    @OraName(value = "M_ISTHIRDPARTYTYPE")
    @InitOrder(value = "28")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsthirdpartytype;

    @OraName(value = "M_ISUDBOCHANGED")
    @InitOrder(value = "29")
    @DataType(value = TransformType.LONG)
    public Long mbveventsIsudbochanged;

    @OraName(value = "M_JRNNO")
    @InitOrder(value = "30")
    @DataType(value = TransformType.LONG)
    public Long mbveventsJrnno;

    @OraName(value = "M_OFFICE")
    @InitOrder(value = "31")
    @DataType(value = TransformType.LONG)
    public Long mbvevents_office;

    @OraName(value = "M_OLDPRCNTRATE")
    @InitOrder(value = "32")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal mbveventsOldprcntrate;

    @OraName(value = "M_OPCASH")
    @InitOrder(value = "33")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal mbveventsOpcash;

    @OraName(value = "M_OPNO")
    @InitOrder(value = "34")
    @DataType(value = TransformType.LONG)
    public Long mbveventsOpno;

    @OraName(value = "M_PERSON_NEW")
    @InitOrder(value = "35")
    @ClientField(value = "true")
    @DataType(value = TransformType.LONG)
    public Long mbveventsPersonNew;

    @OraName(value = "M_PERSON_OLD")
    @InitOrder(value = "36")
    @ClientField(value = "true")
    @DataType(value = TransformType.LONG)
    public Long mbveventsPersonOld;

    @OraName(value = "M_PRCNTRATE")
    @InitOrder(value = "37")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal mbveventsPrcntrate;

    @OraName(value = "M_QCNO")
    @InitOrder(value = "38")
    @DataType(value = TransformType.LONG)
    public Long mbveventsQcno;

    @OraName(value = "M_SSCODE")
    @InitOrder(value = "39")
    @DataType(value = TransformType.LONG)
    public Long mbveventsSscode;

    @OraName(value = "M_STATE")
    @InitOrder(value = "40")
    @DataType(value = TransformType.LONG)
    public Long mbveventsState;

    @OraName(value = "M_TRANSDAY")
    @InitOrder(value = "41")
    @DataType(value = TransformType.DATE_TIME)
    public Date mbveventsTransday;

    @OraName(value = "M_TURNCODE")
    @InitOrder(value = "42")
    @DataType(value = TransformType.LONG)
    public Long mbveventsTurncode;

    @OraName(value = "category")
    @InitOrder(value = "43")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "44")
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

    public Long templObjId;

    public Long parentObjId;

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    public Long objectId;

    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();

}
