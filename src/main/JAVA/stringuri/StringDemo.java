package main.JAVA.stringuri;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        String s = "welcome";
        int len = s.length();
        System.out.println(len);

        String s1 = "welcome";
        String s2 = " to Saint Tropez";

        System.out.println(s1+s2);
        System.out.println(s1+""+s2);
        System.out.println("welcome" + " to Saint Tropez");

        s="    java programming    ";
        System.out.println(s);
        System.out.println(s.trim());

        s="welcome";
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(2));
        System.out.println(s.contains("come"));
        System.out.println(s.contains("abc"));
        System.out.println(s.equals("Welcome"));
        System.out.println(s.equals("welcome"));
        System.out.println(s.equalsIgnoreCase("Welcome"));
        System.out.println(s.equalsIgnoreCase("welcome"));

        s="welcome to java welcome to Saint Tropez";
        System.out.println(s.replace("e", "a"));
        System.out.println(s.replace("e", "a"));
        System.out.println(s.replace("welcome", "xyz"));

        s="welcome";
        System.out.println(s.substring(2,4));
        System.out.println(s.substring(0,4));

        s="WELCOME";
        System.out.println(s.toLowerCase());

        s="welcome";
        System.out.println(s.toUpperCase());

        s="welCOME";
        System.out.println(s.toLowerCase());

        }

}