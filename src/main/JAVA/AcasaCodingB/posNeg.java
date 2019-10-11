package main.JAVA.AcasaCodingB;

public class posNeg {
    public static boolean posNeg(int a, int b, boolean negative){
       // int a = 0;
        // int b = 0;
       //  boolean negative = true;
        if (negative) {
            return (a<0 && b<0);
    } else
        return ((a<0 && b<0)||(a>0 && b>0));
        }

    public static void main(String[] args) {
        System.out.println(posNeg(3, 7, true));
    }
    }
