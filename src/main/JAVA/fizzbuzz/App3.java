package main.JAVA.fizzbuzz;

public class App3 {
    public static void main(String[] args) {
        int sum = 0, n = 100;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

