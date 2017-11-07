package com.sbt;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

/**
 */
public class DelimetedStringParser {
    public static String str(int i, String str, int[] indexes) {
        int start = gotoToken(i, str, indexes);
        int end = gotoToken(i+1, str, indexes);

        if (end-start > 1)
            return str.substring(start, end-1);
        else
            return null;
    }

    public static Integer _int(int i, String str, int[] indexes) {
        gotoToken(i, str, indexes);

        if (indexes[0] == indexes[2])
            return null;

        char ch = nextChar(str, indexes);
        if (ch == '|')
            return null;

        boolean negative = false;

        if (ch < '0') { // Possible leading "+" or "-"
            if (ch == '-') {
                negative = true;
            } else if (ch != '+')
                throw new NumberFormatException("Char " + ch + " not allowed");

            if (str.charAt(indexes[0]) == '|') // Cannot have lone "+" or "-"
                throw new NumberFormatException("Char " + ch + " not allowed");

            ch = nextChar(str, indexes);
        }

        int result = 0;

        while (ch != '|' && (indexes[2]-indexes[0]) > 1) {
            int digit = digit(ch);

            result *= 10;
            result -= digit;

            ch = nextChar(str, indexes);
        }

        if (negative)
            return result;
        else
            return result * -1;
    }

    public static Long _long(int i, String str, int[] indexes) {
        gotoToken(i, str, indexes);

        if (indexes[0] == indexes[2])
            return null;

        char ch = nextChar(str, indexes);
        if (ch == '|')
            return null;

        boolean negative = false;

        if (ch < '0') { // Possible leading "+" or "-"
            if (ch == '-') {
                negative = true;
            } else if (ch != '+')
                throw new NumberFormatException("Char " + ch + " not allowed");

            if (str.charAt(indexes[0]) == '|') // Cannot have lone "+" or "-"
                throw new NumberFormatException("Only $ch int number now allowed");

            ch = nextChar(str, indexes);
        }

        long result = 0L;

        while (ch != '|' && (indexes[2]-indexes[0]) > 1) {
            int digit = digit(ch);

            result *= 10L;
            result -= digit;

            ch = nextChar(str, indexes);
        }

        if (negative)
            return result;
        else
            return result * -1;
    }

    public static Double _double(int i, String str, int[] indexes) {
        return java.lang.Double.valueOf(str(i, str, indexes));
    }

    public static StringBuilder strBuilder(int i, String str, int[] indexes) {
        int start = gotoToken(i, str, indexes);
        int end = gotoToken(i+1, str, indexes);

        if (end-start > 1)
            return new StringBuilder().append(str, start, end);
        else
            return null;

    }

    public static Date date(int i, String str, int[] indexes) {
        gotoToken(i, str, indexes);

        if (indexes[0] == indexes[2])
            return null;

        if (str.charAt(indexes[0]) == '|')
            return null;
        else {
            int day = digit(nextChar(str, indexes))*10 + digit(nextChar(str, indexes));
            nextChar(str, indexes);
            int month = digit(nextChar(str, indexes))*10 + digit(nextChar(str, indexes));
            nextChar(str, indexes);
            int year = digit(nextChar(str, indexes))*1000 + digit(nextChar(str, indexes))*100 + digit(nextChar(str, indexes))*10 + digit(nextChar(str, indexes));
            nextChar(str, indexes);
            int hrs = digit(nextChar(str, indexes))*10 + digit(nextChar(str, indexes));
            nextChar(str, indexes);
            int min = digit(nextChar(str, indexes))*10 + digit(nextChar(str, indexes));
            nextChar(str, indexes);
            int sec = digit(nextChar(str, indexes))*10 + digit(nextChar(str, indexes));

            return new Date(year-1900, month-1, day, hrs, min, sec);
        }
    }

    public static BigDecimal bigDecimal(int i, String str, int[] indexes) {
        String number = str(i, str, indexes);
        if (number == null)
            return null;
        else
            return new BigDecimal(number);
    }

    public static Boolean bool(int i, String str, int[] indexes) {
        gotoToken(i, str, indexes);

        char ch = nextChar(str, indexes);
        if (ch == '|')
            return null;

        if (ch == 'T' || ch == 't') {
            checkChar(nextChar(str, indexes), 'R', 'r');
            checkChar(nextChar(str, indexes), 'U', 'u');
            checkChar(nextChar(str, indexes), 'E', 'e');
            checkChar(nextChar(str, indexes), '|', '|');

            return Boolean.TRUE;
        } else if (ch == 'F' || ch == 'f') {
            checkChar(nextChar(str, indexes), 'A', 'a');
            checkChar(nextChar(str, indexes), 'L', 'l');
            checkChar(nextChar(str, indexes), 'S', 's');
            checkChar(nextChar(str, indexes), 'E', 'e');
            checkChar(nextChar(str, indexes), '|', '|');

            return Boolean.FALSE;
        } else if (ch == '0') {
            return Boolean.FALSE;
        } else if (ch == '1') {
            return Boolean.TRUE;
        } else
            throw new RuntimeException("Not A Boolean!");
    }

    private static void checkChar(char c, char big, char small) {
        if (c != big && c != small)
            throw new RuntimeException("Not A Boolean! $c");
    }

    private static int digit(int ch) {
        return ch - (int)'0';
    }

    private static void resetIndex(int [] indexes) {
        indexes[0] = 0;
        indexes[1] = 0;

    }

    private static int gotoToken(int i, String str, int[] indexes) {
        if (indexes[1] > i)
            resetIndex(indexes);

        while(indexes[1] < i) {
            if (str.charAt(indexes[0]) == '|' || (indexes[2]-indexes[0]) == 1)
                indexes[1]++;
            indexes[0]++;
        }

        return indexes[0];
    }

    private static char nextChar(String str, int[] indexes) {
        char c = str.charAt(indexes[0]);

        indexes[0] += 1;
        if (c == '|')
            indexes[1] += 1;

        return c;
    }

    public static void main(String[] args) throws ParseException {
        String str = "-9223372036847376683|403|6737113|12|||6737113|102|12||614||-9223372036847376683|-9223372036789454243,-9223372036789453987,-9223372036789453731,-9223372036789453475,-9223372036789453219,-9223372036789452963,-9223372036789452707,-9223372036789452451,-9223372036789452195,-9223372036789454499|||-9223372036522096349,-9223372036522096605,-9223372036522096861,-9223372036522097117,-9223372036522097373,-9223372036522097629,-9223372036522097885,-9223372036522098141,-9223372036522098397,-9223372036522098653,-9223372036522098909,-9223372036522099165,-9223372036522099421,-9223372036522099677,-9223372036522099933,-9223372036522100189,-9223372036522100445,-9223372036522100701,-9223372036522100957,-9223372036522101213,-9223372036522101469,-9223372036522101725,-9223372036522101981,-9223372036522102237,-9223372036522102493,-9223372036522102749,-9223372036522103005,-9223372036522103261,-9223372036522103517,-9223372036522103773,-9223372036522104029,-9223372036522104285,-9223372036522104541,-9223372036522104797,-9223372036522105053,-9223372036522105309,-9223372036522105565,-9223372036522105821,-9223372036522106077,-9223372036522106333,-9223372036522106589,-9223372036522106845,-9223372036522107101,-9223372036522107357,-9223372036522107613,-9223372036522107869,-9223372036522108125,-9223372036522108381,-9223372036522108637,-9223372036522108893,-9223372036522109149,-9223372036522109405,-9223372036522109661,-9223372036522109917,-9223372036522110173,-9223372036522110429,-9223372036522110685,-9223372036522110941,-9223372036522111197,-9223372036522111453,-9223372036522111709,-9223372036522111965,-9223372036522112221,-9223372036522112477,-9223372036522112733,-9223372036522112989,-9223372036522113245,-9223372036522113501,-9223372036522113757,-9223372036522114013,-9223372036522114269,-9223372036522114525,-9223372036522114781,-9223372036522115037,-9223372036522115293,-9223372036522115549,-9223372036522115805,-9223372036522116061,-9223372036522116317,-9223372036522116573,-9223372036522116829,-9223372036522117085,-9223372036522117341,-9223372036522117597,-9223372036522117853,-9223372036522118109,-9223372036522118365,-9223372036522118621,-9223372036522118877,-9223372036522119133,-9223372036522119389,-9223372036522119645,-9223372036522119901,-9223372036522120157,-9223372036522120413,-9223372036522120669,-9223372036522120925,-9223372036522121181,-9223372036522121437,-9223372036522121693,-9223372036522121949,-9223372036522122205,-9223372036522122461,-9223372036522122717,-9223372036522122973,-9223372036522123229,-9223372036522123485,-9223372036522123741,-9223372036522123997,-9223372036522124253,-9223372036522124509,-9223372036522124765,-9223372036522125021,-9223372036522125277,-9223372036522125533,-9223372036522125789,-9223372036522126045,-9223372036522126301,-9223372036522126557,-9223372036522126813,-9223372036522127069,-9223372036522127325,-9223372036522127581,-9223372036522127837,-9223372036522128093,-9223372036522128349,-9223372036522128605,-9223372036522128861,-9223372036522129117,-9223372036522129373,-9223372036522129629,-9223372036522129885,-9223372036522130141,-9223372036522130397,-9223372036522130653,-9223372036522130909,-9223372036522131165,-9223372036522131421,-9223372036522131677,-9223372036522131933,-9223372036522132189,-9223372036522132445,-9223372036522132701,-9223372036522132957,-9223372036522133213,-9223372036522133469,-9223372036522133725,-9223372036522133981,-9223372036522134237,-9223372036522134493,-9223372036522134749,-9223372036522135005,-9223372036522135261,-9223372036522135517,-9223372036522135773,-9223372036522136029,-9223372036522136285,-9223372036522136541,-9223372036522136797,-9223372036522137053|-9223372036516356228,-9223372036516355972,-9223372036516355716,-9223372036516355460,-9223372036516355204,-9223372036516354948,-9223372036516354692,-9223372036516354436,-9223372036516354180,-9223372036516353924,-9223372036516353668,-9223372036516353412,-9223372036516353156,-9223372036516352900,-9223372036516352644,-9223372036516352388,-9223372036516352132,-9223372036516351876,-9223372036516351620,-9223372036516351364,-9223372036516351108,-9223372036516350852,-9223372036516350596,-9223372036516350340,-9223372036516350084,-9223372036516349828,-9223372036516349572,-9223372036516349316,-9223372036516349060,-9223372036516348804,-9223372036516348548,-9223372036516348292,-9223372036516348036,-9223372036516347780,-9223372036516347524,-9223372036516347268,-9223372036516347012,-9223372036516346756,-9223372036516346500,-9223372036516346244,-9223372036516345988,-9223372036516345732,-9223372036516345476,-9223372036516345220,-9223372036516344964,-9223372036516344708,-9223372036516344452,-9223372036516344196,-9223372036516343940,-9223372036516343684,-9223372036516343428,-9223372036516343172,-9223372036516342916,-9223372036516342660,-9223372036516342404,-9223372036516342148,-9223372036516341892,-9223372036516341636,-9223372036516341380,-9223372036516341124,-9223372036516340868,-9223372036516340612,-9223372036516340356,-9223372036516340100,-9223372036516339844,-9223372036516339588,-9223372036516339332,-9223372036516339076,-9223372036516338820,-9223372036516338564,-9223372036516338308,-9223372036516338052,-9223372036516337796,-9223372036516337540,-9223372036516337284,-9223372036516337028,-9223372036516336772,-9223372036516336516,-9223372036516336260,-9223372036516336004,-9223372036516335748,-9223372036516335492,-9223372036516335236,-9223372036516334980,-9223372036516334724,-9223372036516334468,-9223372036516334212,-9223372036516333956,-9223372036516333700,-9223372036516333444,-9223372036516333188,-9223372036516332932,-9223372036516332676,-9223372036516332420,-9223372036516332164,-9223372036516331908,-9223372036516331652,-9223372036516331396,-9223372036516331140,-9223372036516330884,-9223372036516330628,-9223372036516330372,-9223372036516330116,-9223372036516329860,-9223372036516329604,-9223372036516329348,-9223372036516329092,-9223372036516328836,-9223372036516328580,-9223372036516328324,-9223372036516328068,-9223372036516327812,-9223372036516327556,-9223372036516327300,-9223372036516327044,-9223372036516326788,-9223372036516326532,-9223372036516326276,-9223372036516326020,-9223372036516325764,-9223372036516325508,-9223372036516325252,-9223372036516324996,-9223372036516324740,-9223372036516324484,-9223372036516324228,-9223372036516323972,-9223372036516323716,-9223372036516323460,-9223372036516323204,-9223372036516322948,-9223372036516322692,-9223372036516322436,-9223372036516322180,-9223372036516321924,-9223372036516321668,-9223372036516321412,-9223372036516321156,-9223372036516320900,-9223372036516320644,-9223372036516320388,-9223372036516320132,-9223372036516319876,-9223372036516319620,-9223372036516319364,-9223372036516319108,-9223372036516318852,-9223372036516318596,-9223372036516318340,-9223372036516318084,-9223372036516317828,-9223372036516317572,-9223372036516317316,-9223372036516317060,-9223372036516316804,-9223372036516316548,-9223372036516316292,-9223372036516316036,-9223372036516315780,-9223372036516315524,-9223372036516315268|-9223372036848314192|-9223372036845343312|||12.02.2008 00:00:00|12.02.2018 00:00:00||-9223372036846938592,-9223372036846938336||||138595030|||4|||1";

        int[] indexes = new int[] {0, 0, str.length()};
        for(int i=0; i<100; i++) {
            System.out.println(i + " = " + DelimetedStringParser.str(i, str, indexes));
        }



/*

        String str = "XXXX||YYYY||ZZ|ZZZ|123456|999999999999|false|true||123.456|01.01.2018 23:22:00";

        test(DelimetedStringParser.str(0, str, indexes), "XXXX");
        test(DelimetedStringParser.str(1, str, indexes), "");
        test(DelimetedStringParser.str(2, str, indexes), "YYYY");
        test(DelimetedStringParser.str(3, str, indexes), "");
        test(DelimetedStringParser.str(4, str, indexes), "ZZ");
        test(DelimetedStringParser.str(5, str, indexes), "ZZZ");
        test(DelimetedStringParser._int(6, str, indexes), 123456);
        test(DelimetedStringParser._long(7, str, indexes), 999999999999L);
        test(DelimetedStringParser.bool(8, str, indexes), Boolean.FALSE);
        test(DelimetedStringParser.bool(9, str, indexes), Boolean.TRUE);
        test(DelimetedStringParser._int(10, str, indexes), null);
        test(DelimetedStringParser._double(11, str, indexes), 123.456D);
        test(DelimetedStringParser.date(12, str, indexes),
            new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse("01.01.2018 23:22:00"));*/
    }

    private static <A> void test(A f, A s) {
        if (f == null && s != null)
            throw new RuntimeException(f + " != " + s);

        if (f != null && s == null)
            throw new RuntimeException(f + " != " + s);

        if (f == null && s == null)
            return;

        if (!f.equals(s))
            throw new RuntimeException(f + " != " + s);
    }
}
