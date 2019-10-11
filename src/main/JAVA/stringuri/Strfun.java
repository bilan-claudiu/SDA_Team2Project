package main.JAVA.stringuri;

public class Strfun {
    public static void main(String[] args) {
        String s = "Hello ";
        String s1 = "This World is mad crazy!!!";
        String[] temp = s1.split("\\s");
        s = s.concat("Adelina,");
        System.out.println(s);
        System.out.println(" ");
        for(int i=0; i<temp.length; i++) {
            System.out.println(temp[i]);
            System.out.println(" ");
        }
    }
}
