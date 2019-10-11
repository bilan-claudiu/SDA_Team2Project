package main.JAVA.AcasaTemeM;

public class ex5 {
    public static void main(String[] args) {
        int a [] = {4, 7, 14, 24, 36, 18};
        int max = a[0];
        int min = a[0];
        for ( int i=1; i<a.length; i++) {
            if (max<a[i]) {
                max=a[i];
            }
            if (min>a[i]) {
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
            }
}
