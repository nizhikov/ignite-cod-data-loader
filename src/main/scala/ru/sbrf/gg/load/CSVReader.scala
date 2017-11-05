package ru.sbrf.gg.load

import java.io.{File, InputStream}

import org.slf4j.LoggerFactory

import scala.io.Source

class CSVReader(file: InputStream, delim: String = ";", encoding: String = "ISO-8859-1") extends Iterable[Array[String]] {
    private val logger = LoggerFactory.getLogger(this.getClass)

    val maxLines = System.getProperty("MAX_LINES", "-1").toInt

    {
        if (maxLines != -1)
            logger.warn(s"$maxLines would be readed from stream")
    }

    private val lines = Source.fromInputStream(file, encoding).getLines

    var cnt = 0

    override def iterator: Iterator[Array[String]] = new Iterator[Array[String]] {
        override def hasNext: Boolean = {
            cnt += 1
            (maxLines == -1 || cnt < maxLines) && lines.hasNext
        }

        override def next(): Array[String] = {
            val line = lines.next()
            line.split(delim, -1)
        }
    }
}
