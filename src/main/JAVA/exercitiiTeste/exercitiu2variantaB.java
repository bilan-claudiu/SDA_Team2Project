package main.JAVA.exercitiiTeste;

import static java.lang.Math.pow;

   public class exercitiu2variantaB {
    static boolean exercitiu2variantaB(int numberToCheck) {
        double sum = 0;
        String numStr = Integer.toString(numberToCheck);
        for(Integer i=0; i<numStr.length(); i++) {
            String num = numStr.substring(i, i + 1);
            {
                sum += pow(Integer.parseInt(num), numStr.length());
            }

        }
            return sum == numberToCheck;

    }

    public static void main(String[] args) {
        System.out.println(exercitiu2variantaB(153));
    }
}
