/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.bm.ucp.published.api.common;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedParty {

    @OraName(value = "id")
    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public long id;

    @OraName(value = "partitionid")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    @PartField(value="true")
    public long colocationKey;

    @OraName(value = "partitionid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public long partition_DPL_id;

    @OraName(value = "partyId")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public long partyId;


    @OraName(value = "partyType")
    @InitOrder(value = "1")
    @DataType(value = TransformType.STRING)
    public String partyType;

    public boolean isDeleted=false;

}
