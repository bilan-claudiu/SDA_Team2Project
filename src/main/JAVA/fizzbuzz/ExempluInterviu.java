package main.JAVA.fizzbuzz;

public class ExempluInterviu {
    public static String FizzBuzz(Integer i) {
        String s = "";
        if (i % 3 == 0) {
            System.out.println("Fizz");
        }
        if (i % 5 == 0) {
            System.out.println("Buzz");
        }
        if (i % 3 != 0 && i % 5 != 0) {
            return i.toString();
        }
            return s;
     }
        public static void main (String[]args){
            System.out.println(FizzBuzz(17) );
        }
     }
