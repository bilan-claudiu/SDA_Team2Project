package main.JAVA.AcasaCodingB;

public class nearHundread {
    public static void main(String[] args) {
        int n = 97 ;
        if (Math.abs(100 - n) <= 10) {
            System.out.println("true");
        } else if (Math.abs(200 - n) <= 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}