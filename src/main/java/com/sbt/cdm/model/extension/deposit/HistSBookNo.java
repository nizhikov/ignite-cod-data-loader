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
public class HistSBookNo {

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

    @OraName(value = "H_BALANCE")
    @InitOrder(value = "5")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal sbookBalance;

    @OraName(value = "H_BRANCHNO")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public Long sbook_branchno;

    @OraName(value = "H_CANCEL_CLERK")
    @InitOrder(value = "7")
    @DataType(value = TransformType.LONG)
    public Long sbookCancelClerk;

    @OraName(value = "H_CANCEL_DATE")
    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date sbookCancelDate;

    @OraName(value = "H_CANCEL_FIRSTNAME_CLERK")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String sbookCancelFirstnameClerk;

    @OraName(value = "H_CANCEL_SECONDNAME_CLERK")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String sbookCancelSecondnameClerk;

    @OraName(value = "H_CANCEL_SURNAME_CLERK")
    @InitOrder(value = "11")
    @DataType(value = TransformType.STRING)
    public String sbookCancelSurnameClerk;

    @OraName(value = "H_DATE_CLOSE")
    @InitOrder(value = "12")
    @DataType(value = TransformType.DATE_TIME)
    public Date sbookDateClose;

    @OraName(value = "H_DECLARATION_BRANCHNO")
    @InitOrder(value = "13")
    @DataType(value = TransformType.LONG)
    public Long sbookDeclarationBranchno;

    @OraName(value = "H_DECLARATION_CLERK")
    @InitOrder(value = "14")
    @DataType(value = TransformType.LONG)
    public Long sbookDeclarationClerk;

    @OraName(value = "H_DECLARATION_DATE_LOST")
    @InitOrder(value = "15")
    @DataType(value = TransformType.DATE_TIME)
    public Date sbookDeclarationDateLost;

    @OraName(value = "H_DECLARATION_FIRSTNAME")
    @InitOrder(value = "16")
    @DataType(value = TransformType.STRING)
    public String sbookDeclarationFirstname;

    @OraName(value = "H_DECLARATION_KIND")
    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long sbookDeclarationKind;

    @OraName(value = "H_DECLARATION_NO")
    @InitOrder(value = "18")
    @DataType(value = TransformType.STRING)
    public String sbookDeclarationNo;

    @OraName(value = "H_DECLARATION_OFFICE")
    @InitOrder(value = "19")
    @DataType(value = TransformType.LONG)
    public Long sbookDeclarationOffice;

    @OraName(value = "H_DECLARATION_SECONDNAME")
    @InitOrder(value = "20")
    @DataType(value = TransformType.STRING)
    public String sbookDeclarationSecondname;

    @OraName(value = "H_DECLARATION_SURNAME")
    @InitOrder(value = "21")
    @DataType(value = TransformType.STRING)
    public String sbookDeclarationSurname;

    @OraName(value = "H_DECLARATION_VALID")
    @InitOrder(value = "22")
    @DataType(value = TransformType.LONG)
    public Long sbookDeclarationValid;

    @OraName(value = "H_DOCUMENTKIND")
    @InitOrder(value = "23")
    @DataType(value = TransformType.LONG)
    public Long sbookDocumentkind;

    @OraName(value = "H_DUBLE_CLERK")
    @InitOrder(value = "24")
    @DataType(value = TransformType.LONG)
    public Long sbookDubleClerk;

    @OraName(value = "H_DUBLE_DATE")
    @InitOrder(value = "25")
    @DataType(value = TransformType.DATE_TIME)
    public Date sbookDubleDate;

    @OraName(value = "H_DUBLE_FIRSTNAME_CLERK")
    @InitOrder(value = "26")
    @DataType(value = TransformType.STRING)
    public String sbookDubleFirstnameClerk;

    @OraName(value = "H_DUBLE_SECONDNAME_CLERK")
    @InitOrder(value = "27")
    @DataType(value = TransformType.STRING)
    public String sbookDubleSecondnameClerk;

    @OraName(value = "H_DUBLE_SURNAME_CLERK")
    @InitOrder(value = "28")
    @DataType(value = TransformType.STRING)
    public String sbookDubleSurnameClerk;

    @OraName(value = "H_KIND")
    @InitOrder(value = "29")
    @DataType(value = TransformType.LONG)
    public Long sbookKind;

    @OraName(value = "H_NO")
    @InitOrder(value = "30")
    @DataType(value = TransformType.STRING)
    public String sbookNo;

    @OraName(value = "H_PRINTABLENO")
    @InitOrder(value = "31")
    @DataType(value = TransformType.STRING)
    public String sbookPrintableno;

    @OraName(value = "H_PRINTABLENO_NEW")
    @InitOrder(value = "32")
    @DataType(value = TransformType.STRING)
    public String sbookPrintablenoNew;

    @OraName(value = "H_SBOOKNO")
    @InitOrder(value = "33")
    @DataType(value = TransformType.STRING)
    public String sbookSbookno;

    @OraName(value = "H_SBOOKNO_DUBLE")
    @InitOrder(value = "34")
    @DataType(value = TransformType.STRING)
    public String sbookSbooknoDuble;

    @OraName(value = "H_SERIES")
    @InitOrder(value = "35")
    @DataType(value = TransformType.STRING)
    public String sbookSeries;

    @OraName(value = "category")
    @InitOrder(value = "36")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "37")
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
