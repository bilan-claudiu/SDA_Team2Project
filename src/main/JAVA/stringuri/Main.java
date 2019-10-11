package main.JAVA.stringuri;

public class Main {
    public static void main(String[] args) {
        String str = "thiss is Valkirie";
        System.out.println(removeCharAt(str, 5));
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(2, pos) + s.substring(pos + 2);
    }
}
