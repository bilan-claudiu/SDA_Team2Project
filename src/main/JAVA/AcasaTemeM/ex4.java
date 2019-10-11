package main.JAVA.AcasaTemeM;

public class ex4 {
    public static void main(String[] args) {
        int z[] = {2, 3, 4, 6, 7, 8};
        int sum = 0;
        int sum1 = 0;
        for (int i=0; i <z.length; i++) {
            sum = sum + z[i];
                    }
        for (int j=2; j<=8; j++) {
           sum1 = sum1 + j;
        }
        System.out.println(sum1-sum);

    }
}