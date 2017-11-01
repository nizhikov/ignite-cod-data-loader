package com.sbt.bm.ucp.common.dpl.model.dictionary;

import ru.sbt.kmdtransform.*;

/**
 * Created by sbt-kuchevasov-vi on 29.10.2017.
 */
public class DIdentifierType {

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

}
