/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.bm.ucp.published.api.dictionary;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedServiceZone {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public long id;

    @OraName(value = "code")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    public Long code;

    @OraName(value = "name")
    @InitOrder(value = "3")
    @DataType(value = TransformType.STRING)
    public String name;

//                    <column ggname="id" name="ID" data_type="long"/>
//                <column ggname="code" name="code" data_type="java.lang.String"/>
//                <column ggname="name" name="name" data_type="java.lang.String"/>
}
