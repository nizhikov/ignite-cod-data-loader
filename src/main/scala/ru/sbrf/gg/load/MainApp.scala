/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.sbrf.gg.load

import java.io.{File, FileInputStream}

import org.slf4j.LoggerFactory
import ru.sbrf.gg.load.Config.{GENERATE_CONFIG, LOAD_TABLE}

/**
  */
object MainApp extends App {
    val parser = new scopt.OptionParser[Config]("java -jar ignite-cod-data-loader.jar") {
        head("ignite-cod-data-loader", "0.0.1")

        cmd(GENERATE_CONFIG).action( (_, c) => c.copy(command = Some(GENERATE_CONFIG)) ).
            text("generates grid-gain config file using info from `servers-file` parameter. By default use server.csv from app resources.").
            children (
                opt[String]("servers-file").abbr("sf").action( (v, c) =>
                    c.copy(serversFile = Some(v)) ).text("path to csv file with servers info")
            )
        cmd(LOAD_TABLE).action( (_, c) => c.copy(command = Some(LOAD_TABLE)) ).
            text("loads table data to cluster.").
            children(
                opt[Unit]("local").abbr("l").action( (v, c) =>
                    c.copy(local = true) ).text("use config for local cluster"),
                opt[Unit]("cluster").abbr("c").action( (v, c) =>
                    c.copy(local = false) ).text("use config for test cluster"),
                opt[String]("table-name").abbr("tn").action( (v, c) =>
                    c.copy(tableName = Some(v)) ).text("table name to load"),
                opt[String]("data-root").abbr("dr").action( (v, c) =>
                    c.copy(dataRoot = Some(v)) ).text("data root directory or path to zip file")
            )

        checkConfig { c =>
            c.command match {
                case Some(GENERATE_CONFIG) ⇒
                    if (c.serversFile.isEmpty || !new File(c.serversFile.get).exists())
                        failure(s"File ${c.serversFile.map(new File(_).getAbsoluteFile)} doesn't exists")
                    else
                        success
                case Some(LOAD_TABLE) ⇒
                    if (c.tableName.isEmpty || c.dataRoot.isEmpty)
                        failure(s"`table-name` and `data-root` is required parameters")
                    else
                        success
            }
        }
    }

    parser.parse(args, Config()) match {
        case Some(config) => config.command match {
            case Some(GENERATE_CONFIG) ⇒ generateAddressesConfig(config.serversFile.get)
            case Some(LOAD_TABLE) ⇒ loadTable(config.local, config.tableName, config.dataRoot)
        }

        case None =>
    }

    def generateAddressesConfig(serversFile: String): Unit = {
        new CSVReader(new FileInputStream(serversFile)).foreach { line ⇒
            println(s"<value>${line(2)}:47500..47509</value>")
        }
    }

    def loadTable(local: Boolean, tableName: Option[String], dataRoot: Option[String]): Unit =
        new LoadTable(local, tableName.get, dataRoot.get).load
}
