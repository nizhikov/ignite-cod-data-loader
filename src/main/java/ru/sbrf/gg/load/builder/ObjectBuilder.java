package ru.sbrf.gg.load.builder;

import java.util.Comparator;
import ru.sbrf.gg.load.TableInfo;

/**
 */
public interface ObjectBuilder extends Comparator<Object> {
    Object build(String line, TableInfo tableInfo);

    int compare(Object first, Object second);
}
