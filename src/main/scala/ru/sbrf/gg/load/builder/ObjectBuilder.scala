package ru.sbrf.gg.load.builder

import ru.sbrf.gg.load.TableInfo

/**
  */
trait ObjectBuilder {
    def build(line: Array[String], tableInfo: TableInfo): Any
}
