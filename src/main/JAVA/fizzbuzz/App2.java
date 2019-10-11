package main.JAVA.fizzbuzz;

public class App2 {
    public static String Ex2(int i) {
        String s = "";
        if(i%3==0) {
            System.out.println("Pling");
        }
        if(i%5==0) {
            System.out.println("Plang");
        }
        if(i%7==0) {
            System.out.println("Plong");
        }
        if(i%3!=0 && i%5!=0 && i%7!=0){
            System.out.println(i);
        }
        return s;
        }

    public static void main(String[] args) {
        System.out.println(Ex2(105));
    }

    }
