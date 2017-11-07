package ru.sbrf.gg.load

import java.text.SimpleDateFormat
import java.util.Date

/**
  * @author NIzhikov
  */
class DelimetedStringParser(str: String, delim: Char) {
    private var tokenIndex = 0
    private var charIndex = 0

    private val strLength = str.length

    private val parser = new ThreadLocal[SimpleDateFormat]() {
        override def initialValue() =
            new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
    }

    private def resetIndex() = {
        tokenIndex = 0
        charIndex = 0
    }

    private def gotoToken(i: Int): Int = {
        if (tokenIndex > i)
            resetIndex()

        while(tokenIndex < i) {
            if (str.charAt(charIndex) == delim || (strLength-charIndex) == 1)
                tokenIndex += 1
            charIndex += 1
        }

        charIndex
    }

    private def nextChar(): java.lang.Character = {
        val c = str.charAt(charIndex)

        charIndex += 1
        if (c == delim)
            tokenIndex += 1

        c
    }

    def str(i: Int): String = {
        val start = gotoToken(i)
        val end = gotoToken(i+1)

        if (end-start > 1)
            if (strLength-end>1)
                str.substring(start, end-1)
            else
                str.substring(start, end)
        else
            ""
    }

    def int(i: Int): java.lang.Integer = {
        gotoToken(i)

        var ch: java.lang.Character = nextChar()
        if (ch == delim)
            return null

        var negative = false
        var limit = Integer.MAX_VALUE

        if (ch < '0') { // Possible leading "+" or "-"
            if (ch == '-') {
                negative = true
                limit = Integer.MIN_VALUE
            } else if (ch != '+')
                throw new NumberFormatException(s"Char $ch not allowed")

            if (str.charAt(charIndex) == delim) // Cannot have lone "+" or "-"
                throw new NumberFormatException(s"Only $ch int number now allowed")

            ch = nextChar()
        }

        var result: Int = 0

        while (ch != delim && (strLength-charIndex) > 1) {
            val digit = Character.digit(ch, 10)

            if (digit < 0) {
                throw new NumberFormatException(s" Not a number '$ch'")
            }

            result = result*10
            if (result < limit + digit)
                throw new NumberFormatException(s"Limit exceed exception")

            result = result - digit

            ch = nextChar()
        }

        if (negative)
            result
        else
            result * -1
    }

    def long(i: Int): java.lang.Long = {
        gotoToken(i)

        var ch: java.lang.Character = nextChar()
        if (ch == delim)
            return null

        var negative = false

        if (ch < '0') { // Possible leading "+" or "-"
            if (ch == '-') {
                negative = true
            } else if (ch != '+')
                throw new NumberFormatException(s"Char $ch not allowed")

            if (str.charAt(charIndex) == delim) // Cannot have lone "+" or "-"
                throw new NumberFormatException(s"Only $ch int number now allowed")

            ch = nextChar()
        }

        var result: Long = 0

        while (ch != delim && (strLength-charIndex) > 1) {
            val digit = Character.digit(ch, 10)

            if (digit < 0) {
                throw new NumberFormatException(s" Not a number '$ch'")
            }

            result = result * 10L
            result = result - digit

            ch = nextChar()
        }

        if (negative)
            result
        else
            result * -1
    }

    def boolean(i: Int): java.lang.Boolean = {
        gotoToken(i)

        def checkChar(c: java.lang.Character, big: java.lang.Character, small: java.lang.Character) =
           if (c != big && c != small)
               throw new RuntimeException(s"Not A Boolean! $c")

        val ch: java.lang.Character = nextChar()
        if (ch == delim)
            return null

        if (ch == 'T' || ch == 't') {
            checkChar(nextChar(), 'R', 'r')
            checkChar(nextChar(), 'U', 'u')
            checkChar(nextChar(), 'E', 'e')
            checkChar(nextChar(), delim, delim)

            true
        } else if (ch == 'F' || ch == 'f') {
            checkChar(nextChar(), 'A', 'a')
            checkChar(nextChar(), 'L', 'l')
            checkChar(nextChar(), 'S', 's')
            checkChar(nextChar(), 'E', 'e')
            checkChar(nextChar(), delim, delim)

            false
        } else
            throw new RuntimeException("Not A Boolean!")
    }

    def double(i: Int): Double = java.lang.Double.valueOf(str(i))

    def date(i: Int): Date =
        parser.get().parse(str(i))

    def bigDecimal(i: Int): java.math.BigDecimal = {
        val start = gotoToken(i)
        val end = gotoToken(i+1)

        new java.math.BigDecimal(str.value, start, end)
    }


}

object SimpleTest extends App {
    val str = "XXXX||YYYY||ZZ|ZZZ|123456|999999999999|false|true||123.456|01.01.2018 23:22:00"

    val parser = new DelimetedStringParser(str, '|')

    test(parser.str(4), "ZZ")
    test(parser.str(5), "ZZZ")
    test(parser.int(6), 123456)
    test(parser.long(7), 999999999999L)
    test(parser.boolean(8), false)
    test(parser.boolean(9), true)

    test(parser.str(0), "XXXX")
    test(parser.str(1), "")
    test(parser.str(2), "YYYY")
    test(parser.str(3), "")

    test(parser.int(10), null)
    test(parser.double(11), 123.456D)
    test(parser.date(12), new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse("01.01.2018 23:22:00"))


    def test[A](f: A, s: A) = {
        if (f != s)
            throw new RuntimeException(s"$f != $s")
    }
}
