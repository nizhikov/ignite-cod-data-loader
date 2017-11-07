package ru.sbrf.gg.load;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import ru.sbt.kmdtransform.DataType;
import ru.sbt.kmdtransform.Default;
import ru.sbt.kmdtransform.IdField;
import ru.sbt.kmdtransform.InitOrder;
import ru.sbt.kmdtransform.PartField;
import ru.sbt.kmdtransform.RootField;
import ru.sbt.kmdtransform.TransformType;
import scala.Tuple4;

/**
 */
public class TableInfo {
    public Class key;
    public Class value;
    public String cacheName;
    public String fileMask;

    public Tuple4<Field, Integer, String, TransformType> id;
    public Tuple4<Field, Integer, String, TransformType> partitionId;
    public Tuple4<Field, Integer, String, TransformType> rootId;

    public List<Tuple4<Field, Integer, String, TransformType>> valueFields = new ArrayList<>();

    public TableInfo(Class key, Class value, String cacheName, String fileMask) {
        this.key = key;
        this.value = value;
        this.cacheName = cacheName;
        this.fileMask = fileMask;

        id = findWithAnnotion(value.getFields(), IdField.class);
        partitionId  = findWithAnnotion(value.getFields(), PartField.class);
        rootId  = findWithAnnotion(value.getFields(), RootField.class);

        for (Field field : value.getFields()) {
            if (!field.isAnnotationPresent(InitOrder.class))
                continue;

            valueFields.add(fieldInfo(field));
        }

    }

    private Tuple4<Field,Integer,String,TransformType> findWithAnnotion(Field[] fields, Class<? extends Annotation> annotation) {
        for (Field field : fields) {
            if (field.isAnnotationPresent(annotation))
                return fieldInfo(field);
        }

        return null;
    }

    private Tuple4<Field, Integer, String, TransformType> fieldInfo(Field f) {
        return new Tuple4<>(
            f,
            Integer.valueOf(f.getAnnotation(InitOrder.class).value()) - 1,
            f.isAnnotationPresent(Default.class) ?  f.getAnnotation(Default.class).value() : null,
            f.getAnnotation(DataType.class).value());
    }
}
