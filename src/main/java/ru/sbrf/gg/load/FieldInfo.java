package ru.sbrf.gg.load;

import java.lang.reflect.Field;
import ru.sbt.kmdtransform.TransformType;

/**
 */
public class FieldInfo {
    private Field field;
    private int order;
    private TransformType _type;
    private String _default;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public TransformType get_type() {
        return _type;
    }

    public void set_type(TransformType _type) {
        this._type = _type;
    }

    public String get_default() {
        return _default;
    }

    public void set_default(String _default) {
        this._default = _default;
    }
}
