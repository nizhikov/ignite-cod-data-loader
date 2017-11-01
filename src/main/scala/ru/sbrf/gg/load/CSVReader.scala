package ru.sbrf.gg.load

import java.io.{File, InputStream}

import scala.io.Source

/**
  */
class CSVReaderWithHeader(file: String, delim: Char = ';', encoding: String = "ISO-8859-1") extends Iterable[Map[String, String]] {
    private val delimStr = delim.toString

    private val lines = Source.fromFile(new File(file), encoding).getLines

    private val names = lines.next().split(delim)

    override def iterator: Iterator[Map[String, String]] = new Iterator[Map[String, String]] {
        override def hasNext: Boolean = lines.hasNext

        override def next(): Map[String, String] = {
            val line = lines.next()
            val values = line.split(delimStr, -1)

            names.zip(values).toMap
        }
    }
}

class CSVReader(file: InputStream, delim: Char = ';', encoding: String = "ISO-8859-1") extends Iterable[Array[String]] {
    private val delimStr = delim.toString

    private val lines = Source.fromInputStream(file, encoding).getLines

    override def iterator: Iterator[Array[String]] = new Iterator[Array[String]] {
        override def hasNext: Boolean = lines.hasNext

        override def next(): Array[String] =
            lines.next().split(delimStr, -1)
    }
}
