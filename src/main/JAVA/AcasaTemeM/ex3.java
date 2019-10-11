package main.JAVA.AcasaTemeM;

public class ex3 {
    public static void main(String[] args) {
        int nrs[] = {2, 7, 12, 14, 19, 23};
        for (int i = 0; i < nrs.length; i++) {
            if (nrs[i] % 2 == 0) {
                System.out.println(nrs[i] + "este par");
            } else {
                System.out.println(nrs[i] + "este impar");
            }
        }
    }
}