package com.sbt.bm.ucp.common.dpl.model.party.equivalent;

import ru.sbt.kmdtransform.*;

/**
 * Created by sbt-kuchevasov-vi on 29.10.2017.
 */
public class DEquivalent {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public long id;

    @OraName(value = "partitionid")
    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    @PartField(value="true")
    public long colocationKey;

    @OraName(value = "partitionid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public long partition_DPL_id;

    @OraName(value = "externalSystemClientId")
    @InitOrder(value = "2")
    @DataType(value = TransformType.STRING)
    public String externalSystemClientId;


    @OraName(value = "partyType")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public long idType_DPL_id;

}
