package main.JAVA.AcasaTemeM;

public class ex2 {
    public static void main(String[] args) {
        int [] a = {3, 4, 7, 9, 12, 15};
        double sum = 0;
        double average = 0;
        for (int i = 0; i<a.length; i++) {
            sum = sum + a[i];
        }
        average = sum / a.length;
        System.out.println(average);
    }
    }
