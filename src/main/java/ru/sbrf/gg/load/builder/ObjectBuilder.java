package ru.sbrf.gg.load.builder;

import ru.sbrf.gg.load.TableInfo;

/**
 */
public interface ObjectBuilder {
    Object build(String line, TableInfo tableInfo);
}
