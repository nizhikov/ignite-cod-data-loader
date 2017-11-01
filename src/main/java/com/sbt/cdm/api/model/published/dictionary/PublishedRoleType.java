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
public class PublishedRoleType {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;

    @OraName(value = "code")
    @InitOrder(value = "2")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "3")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "description")
    @InitOrder(value = "4")
    @DataType(value = TransformType.STRING)
    public String description;

    @OraName(value = "idMDMP")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long idMDMP;



}
