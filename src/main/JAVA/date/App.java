package main.JAVA.date;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);
        System.out.println("today is " +d1.toString());
        cl.add(Calendar.MONTH,1);
        System.out.println("date after a month will be "+cl.getTime().toString());
        cl.add(Calendar.HOUR,7);
        System.out.println("date after 7 hrs will be "+cl.getTime().toString());
        cl.add(Calendar.YEAR, 3);
        System.out.println("date after 3 years will be "+cl.getTime().toString());
    }
}
