package main.JAVA.exercitiiTeste;

import static java.lang.Math.pow;

public class exercitiu2 {
        static boolean exercitiu2 ( int numberToCheck) {
            String numberToCheckString = numberToCheck + "";
            int howManyDigits = numberToCheckString.length();
            int sum = 0;
            for (int i = 0; i < howManyDigits; i++) {
                sum += (int) pow(
                        (double) Character.getNumericValue(numberToCheckString.charAt(i)),
                        (double) howManyDigits);
            } return (sum == numberToCheck);
        }

    public static void main(String[] args) {
        System.out.println(exercitiu2(153));
       }
    }
