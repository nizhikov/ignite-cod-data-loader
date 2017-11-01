/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.published.dictionary;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedDepartments {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @OraName(value = "terBank")
    @InitOrder(value = "2")
    @DataType(value = TransformType.STRING)
    public String terBank;

    @OraName(value = "branch")
    @InitOrder(value = "3")
    @DataType(value = TransformType.STRING)
    public String branch;

    @OraName(value = "department")
    @InitOrder(value = "4")
    @DataType(value = TransformType.STRING)
    public String department;

    @OraName(value = "idMDMP")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long idMDMP;



//                <column ggname="id" name="ID" data_type="long"/>
//                <column ggname="shortcode" name="shortcode" data_type="java.lang.String"/>
//                <column ggname="description" name="description" data_type="java.lang.String"/>

}
