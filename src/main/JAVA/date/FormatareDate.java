package main.JAVA.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatareDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
        SimpleDateFormat sdf2 = new SimpleDateFormat("SSS");
        System.out.println("seconds in ss format : " + sdf2.format(date));
        System.out.println("hour in h format : " + sdf.format(date));
        System.out.println("Current Month in MMMM format : " + sdf1.format(date));

        String strDateFromat = "HH:mm:ss a";
        SimpleDateFormat sdfCustom = new SimpleDateFormat(strDateFromat);
        System.out.println(sdfCustom.format(date));
    }
}
