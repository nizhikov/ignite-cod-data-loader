package ru.sbrf.gg.load

import java.io.{File, InputStream}

import scala.io.Source

class CSVReader(file: InputStream, delim: String = ";", encoding: String = "ISO-8859-1") extends Iterable[Array[String]] {
    private val lines = Source.fromInputStream(file, encoding).getLines

    var cnt = 0

    override def iterator: Iterator[Array[String]] = new Iterator[Array[String]] {
        override def hasNext: Boolean = {
            cnt += 1
            if (cnt < 500042)
                lines.hasNext
            else
                false
        }

        override def next(): Array[String] = {
            val line = lines.next()
            line.split(delim, -1)
        }
    }
}
