package main.JAVA.varrargs;

public class VarrArgs {
    public static void main (String... args) {
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1));
        System.out.println(sum());
        }
        static int sum(int...elements) {
        int result = 0;
        for (int i : elements) {
            result +=1; }
       return result;
    }
}
