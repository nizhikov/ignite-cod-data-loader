package ru.sbrf.gg.load

import java.io.{File, FileInputStream, InputStream}
import java.util.Enumeration
import java.util.zip.{ZipEntry, ZipFile}

import org.slf4j.LoggerFactory

/**
  */
class LoadTable(local: Boolean, tableName: String, dataRoot: String) {
    private val logger = LoggerFactory.getLogger(this.getClass)

    val tables = List(
        "EIP_DBAOSB_DEPOHISTPARAM",
        "EIP_DBAOSB_HSCERTIFICATEPARAM",
        "EIP_DBAOSB_PERFORMEDOPERATION",
        "EIP_DBAOSB_CONTRACTPRODUCT",
        "EIP_DBAOSB_PRODUCT",
        "EIP_DBAOSB_DOCUMENT",
        "EIP_DBAOSB_PRODUCTPARTYROLEINST",
        "EIP_DBAOSB_PARTYPRODUCTIDENTIFIER",
        "EIP_DBAOSB_HSDEPOSITPARAM",
        "EIP_DBAOSB_PRODUCTREGISTR",
        "EIP_DBAOSB_DEPORELATIONPARAM",
        "EIP_DBAOSB_MBVEVENTSPARAM",
        "EIP_DBAOSB_PRODUCTREGISTERREC",
        "EIP_DBAOSB_DEPOREZERVPARAM",
        "EIP_DBAOSB_ACCREDITIVEPARAM",
        "EIP_DBAOSB_DCARDPARAM",
        "EIP_DBAOSB_HISTBOOKNOPARAM",
        "EIP_DBAOSB_CARDSERVICEDEBTPARAM",
        "EIP_DBAOSB_CONTRACTLINK",
        "EIP_DBAOSB_PINPKPARAM",
        "EIP_DBAOSB_CONTRACT",
        "EIP_DBAOSB_PLASTICCARD",
        "EIP_DBAOSB_PERFORMEDSERVICE",
        "EIP_DBAOSB_DEPOSITPARAM",
        "EIP_DBAOSB_DEPOBUILDPARAM",
        "EIP_DBAOSB_PROCESS",
        "EIP_DBAOSB_ACCESSTOOL",
        "EIP_DBAOSB_OPERDEPOBUILDPARAM",
        "EIP_DBAOSB_CARDTODEPOTOPARAM",
        "EIP_DBAOSB_ACCCLOSEPROLONGPARAM",
        "EIP_DBAOSB_SIGNATORE",
        "EIP_DBAOSB_HSAGREEMENTPARAM",
        "EIP_DBAOSB_EDBOPARAM",
        "EIP_DBAOSB_SBERBOOK",
        "EIP_DBAOSB_SERVICEPARTY")

    def load = {
        logger.info(s"LoadTable.load: local=$local, tableName=$tableName, dataRoot=$dataRoot")

        printlnTables

        tables.foreach(loadTable)
    }

    private def loadTable(tableName: String) = {
        val fileIterator = if (new File(dataRoot).isDirectory)
            directoryIterator(dataRoot)
        else
            zipIterator(dataRoot)

        fileIterator.filter(_._1.startsWith(tableName)).foreach { case (name, stream) ⇒
            logger.info(s"Loading file $name - start")
            val reader = new CSVReader(stream, '|') //TODO: close me

            var lineCount = 0
            for(line ← reader) {
                lineCount += 1
                if (lineCount % 1000 == 0)
                    logger.info(s"Loading file $name - $lineCount")
            }
        }
    }

    private def printlnTables = {
        val fileIterator = if (new File(dataRoot).isDirectory)
            directoryIterator(dataRoot)
        else
            zipIterator(dataRoot)

        val tables = fileIterator.filter(_._1.contains('_')).map(file ⇒ file._1.substring(0, file._1.lastIndexOf('_'))).toSet
        logger.info(s"==== KNOWN TABLES START - ${tables.size} ====")
        //tables.foreach(logger.info)
        tables.foreach(println)
        logger.info(s"====         KNOWN TABLES END            ====")
    }

    private def directoryIterator(dir: String): Iterator[(String, InputStream)] =
        new File(dir).list().iterator.map ( f ⇒ (f, new FileInputStream(f)) )

    def zipIterator(zip: String): Iterator[(String, InputStream)] = {
        val zipFile = new ZipFile(zip)
        val entries: Enumeration[_ <: ZipEntry] = zipFile.entries

        new Iterator[(String, InputStream)] {
            override def hasNext = entries.hasMoreElements

            override def next = {
                val entry = entries.nextElement
                (entry.getName, zipFile.getInputStream(entry))
            }
        }
    }
}
