package ru.sbrf.gg.load.builder;

import com.sbt.DelimetedStringParser;
import java.lang.reflect.Field;
import java.util.List;
import ru.sbrf.gg.load.TableInfo;
import ru.sbrf.gg.load.TableInfo.FieldInfo;
import ru.sbt.kmdtransform.TransformType;
import scala.Tuple4;

/**
 */
public class ReflectionBuilder implements ObjectBuilder {
    @Override public Object build(String line, TableInfo tableInfo) {
        try {
            Object result = tableInfo.value.newInstance();
            int[] indexes = new int[] {0, 0, line.length()};

            final List<FieldInfo> tuple4s = tableInfo.valueFields;

            for (FieldInfo fi : tuple4s) {
                fi.f.set(result, fieldValue(line, fi, indexes));
            }

            return result;
        }
        catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override public int compare(Object first, Object second) {
        if (first == null || second == null)
            return first == null && second == null ? 0 : -1;
        else if (!first.equals(second))
            return -1;
        else
            return 0;
    }

    protected Object fieldValue(String line, FieldInfo fi, int[] indexes) {
        String fieldValueStr = DelimetedStringParser.str(fi.idx, line, indexes);

        if (fieldValueStr == null || fieldValueStr.equals(""))
            fieldValueStr = fi.def;

        return fi.trans.fromStr(fieldValueStr);
    }
}
