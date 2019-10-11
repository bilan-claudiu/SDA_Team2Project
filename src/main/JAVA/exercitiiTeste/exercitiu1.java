package main.JAVA.exercitiiTeste;

public class exercitiu1 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i<=10; i++) {
            sum = sum + i;
        }
        for (int j = 1; j<=10; j++) {
            sum1 = sum1 + j*j;
        }

        sum=sum*sum;

         System.out.println("A="+sum);
         System.out.println("B="+sum1);
         System.out.println("A-B=" + (sum-sum1));
      }
   }
