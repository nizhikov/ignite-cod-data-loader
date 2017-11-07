package ru.sbrf.gg.load.builder;

import com.sbt.DelimetedStringParser;
import java.lang.reflect.Field;
import java.util.List;
import ru.sbrf.gg.load.TableInfo;
import ru.sbt.kmdtransform.TransformType;
import scala.Tuple4;

/**
 */
public class ReflectionBuilder implements ObjectBuilder {
    @Override public Object build(String line, TableInfo tableInfo) {
        try {
            Object result = tableInfo.value.newInstance();
            int[] indexes = new int[] {0, 0, line.length()};

            final List<Tuple4<Field, Integer, String, TransformType>> tuple4s = tableInfo.valueFields;

            for (Tuple4<Field, Integer, String, TransformType> f : tuple4s) {
                f._1().set(result, fieldValue(line, f, indexes));
            }

            return result;
        }
        catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    protected Object fieldValue(String line, Tuple4<Field, Integer, String, TransformType> field, int[] indexes) {
        String fieldValueStr = DelimetedStringParser.str(field._2(), line, indexes);

        if (fieldValueStr == null || fieldValueStr.equals(""))
            fieldValueStr = field._3();

        return field._4().fromStr(fieldValueStr);
    }
}
