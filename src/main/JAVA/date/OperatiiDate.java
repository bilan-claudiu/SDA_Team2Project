package main.JAVA.date;

import java.text.DateFormatSymbols;

public class OperatiiDate {
    public static void main(String[] args) {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        for(int i =0; i<(shortMonths.length-1); i++) {
            String shortMonth = shortMonths[i];
            System.out.println("shortMonth= " + shortMonth);
        }
        String[] weekdays =new DateFormatSymbols().getWeekdays();
        for(int i=2; i<(weekdays.length-1); i++) { // daca int i=1; i<weekdays.length;i++ : se afiseazaa toate zilele)
            String weekday = weekdays[i];
            System.out.println("weekday= " + weekday);
        }
    }
}
