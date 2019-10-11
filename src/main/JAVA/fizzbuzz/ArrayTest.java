package main.JAVA.fizzbuzz;

public class ArrayTest {
    public static void main(String[] args) {
        int [] [] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int dim = a.length - 1;
        for (int i = dim; i>=0; i--) {
            for (int j = dim; j>=0; j--) {
                System.out.println(a[i][j]);
            }
            System.out.println(1);
        }
    }
    }

