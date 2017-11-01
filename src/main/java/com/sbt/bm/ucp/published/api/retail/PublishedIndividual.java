package com.sbt.bm.ucp.published.api.retail;

import ru.sbt.kmdtransform.*;

/**
 * Created by sbt-kuchevasov-vi on 29.10.2017.
 */
public class PublishedIndividual {

    @OraName(value = "id")
    @InitOrder(value = "6")
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

    @OraName(value = "equivalents")
    @InitOrder(value = "5")
    @DataType(value = TransformType.CSL_PARTICLES)
    public StringBuilder equivalents_DPL_collectField;



}
