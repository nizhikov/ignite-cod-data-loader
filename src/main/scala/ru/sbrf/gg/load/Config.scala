package ru.sbrf.gg.load

/**
  */
case class Config(
    command: Option[String] = None,

    serversFile: Option[String] = None,

    local: Boolean = true,
    dataRoot: Option[String] = None,
    poolSize: Option[Int] = None,
    tablesIndexes: Set[Int] = Set(1, 2, 3, 4, 5, 6))
{}

object Config {
    val GENERATE_CONFIG = "generate-config"
    val CREATE_CACHES = "create-caches"
    val LOAD_TABLE = "load-table"
    val CHECK_TABLE = "check-table"
    val COUNT_LINES = "count-lines"
    val GENERATE_BUILDER_CODE = "generate-builder-code"
    val START_COMPUTE_JOB = "start-compute-job"
}
