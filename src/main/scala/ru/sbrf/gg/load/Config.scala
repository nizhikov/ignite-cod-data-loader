package ru.sbrf.gg.load

/**
  */
case class Config(
    command: Option[String] = None,

    serversFile: Option[String] = None,

    local: Boolean = true,
    tableName: Option[String] = None,
    dataRoot: Option[String] = None)
{}

object Config {
    val GENERATE_CONFIG = "generate-config"
    val LOAD_TABLE = "load-table"
}
