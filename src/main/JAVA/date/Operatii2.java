package main.JAVA.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Operatii2 {
    public static void main(String[] args) throws Exception {
        Date d1=new Date();
        System.out.println("today is " + d1.toString());

        Locale locItalian = new Locale("it", "ch");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language " + "in Switzerland Format: " + df.format(d1));

        Locale locItalianFull = new Locale("it");
        DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL, locItalianFull);
        System.out.println("today is " + dfFull.format(d1));
    }
}

//codechi - milisec