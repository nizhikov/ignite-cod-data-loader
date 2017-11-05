package ru.sbrf.gg

import java.io.{File, FileInputStream, InputStream}
import java.text.SimpleDateFormat
import java.util
import java.util.zip.{ZipEntry, ZipFile}

import org.apache.ignite.configuration.{BinaryConfiguration, IgniteConfiguration}
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder
import org.apache.ignite.{Ignite, Ignition}
import org.slf4j.LoggerFactory

import scala.collection.JavaConversions._
import scala.xml.{Node, XML}

/**
  */
package object load {
    private val logger = LoggerFactory.getLogger(this.getClass)

    object closeAfter {
        def apply[R <: AutoCloseable, T](r: R)(c: (R) ⇒ T) = {
            try {
                c(r)
            }
            finally {
                r.close
            }
        }
    }

    def filesList(dir: String): Seq[File] = {
        val d = new File(dir)
        if (d.exists() && d.isDirectory)
            d.listFiles.filter(_.isFile).sorted
        else
            Seq.empty
    }

    def toDate(str: String) =
        if (str != null)
            new SimpleDateFormat("dd.MM.yyyy").parse(str)
        else
            null

    implicit class ExtendedMap(map: Map[String, String]) {
        def getOrNull(key: String) = {
            val value = map.getOrElse(key, null)
            if (value != "")
                value
            else
                null
        }

        def getIntOrNull(key: String): java.lang.Integer = {
            val value = map.getOrElse(key, null)
            if (value != "")
                value.toInt
            else
                null
        }

        def getLongOrNull(key: String): java.lang.Long = {
            val value = map.getOrElse(key, null)
            if (value != "")
                value.toLong
            else
                null
        }

        def getDoubleOrNull(key: String): java.lang.Double = {
            val value = map.getOrElse(key, null)
            if (value != "")
                value.toDouble
            else
                null
        }
    }

    def startClient(local: Boolean): Ignite = {
        val cfg = new IgniteConfiguration

        cfg.setClientMode(true)

        val addresses =
            if (local)
                List("127.0.0.1:47500..47509")
            else
                new CSVReader(getClass.getResourceAsStream("/addresses.csv")).map(_(0)).toList
        logger.info("Trying to connect to cluster with server nodes addresses:")
        addresses.foreach(logger.info)

        cfg.setDiscoverySpi(new TcpDiscoverySpi().setIpFinder(
            new TcpDiscoveryMulticastIpFinder().setAddresses(
                addresses)))

        cfg.setBinaryConfiguration(new BinaryConfiguration()
            .setCompactFooter(true))

        cfg.setPeerClassLoadingEnabled(true)

        val ignite = Ignition.start(cfg)

        logger.info("[Cluster][Activation][Start]")
        ignite.active(true)
        logger.info("[Cluster][Activation][Finish]")

        ignite
    }

    def directoryIterator(dir: String): Iterator[(String, InputStream)] =
        new File(dir).list().iterator.map ( f ⇒ (f, new FileInputStream(f)) )

    def zipIterator(zip: String): Iterator[(String, InputStream)] = {
        val zipFile = new ZipFile(zip)
        val entries: util.Enumeration[_ <: ZipEntry] = zipFile.entries

        new Iterator[(String, InputStream)] {
            override def hasNext = entries.hasMoreElements

            override def next = {
                val entry = entries.nextElement
                (entry.getName, zipFile.getInputStream(entry))
            }
        }
    }

    def findTableInfo(tableName: String): TableInfo = {
        def findTransform0(fileTag: Node): TableInfo = {
            val name = (fileTag \ "tableName").text

            val transformConfig = XML.load(
                getClass.getResourceAsStream("/distrib_src_main_resource_config_gg-eip.xml"))

            val table = (transformConfig \ "tables" \ "table").find(node ⇒ (node \ "name").text == name)

            table match {
                case Some(t) ⇒
                    val keyType = Class.forName((t \ "key_data_type").text)
                    val valueType = Class.forName((t \ "object_data_type").text)

                    val fileMask = (fileTag \ "filesMask").text.replaceAll("\\*", ".*").toLowerCase()

                    TableInfo(keyType, valueType, (t \ "cache_name").text, fileMask)
                case None ⇒
                    throw new RuntimeException(s"Transform config for table $tableName not found")
            }
        }

        val loaderConfig = XML.load(
            getClass.getResourceAsStream("/distrib_src_main_resource_config_LoaderConfig.xml"))

        val fileTags = loaderConfig \ "loader" \ "type" \ "filesWithId" \ "files" \ "file"

        val name2find = tableName.substring(tableName.lastIndexOf('_') + 1)

        fileTags.find { node ⇒ name2find == (node \ "tableName").text } match {
            case Some(fileTag) ⇒
                findTransform0(fileTag)
            case None ⇒
                throw new RuntimeException(s"Settings for table $tableName not found")
        }
    }
}
