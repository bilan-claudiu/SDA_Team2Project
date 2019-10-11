package main.JAVA.stringuri;

public class StringReverseExemple {
    public static void main(String[] args) {
        String stringSOS = "SOS";
        StringBuilder input1 = new StringBuilder();
        input1.append(stringSOS);
        input1 = input1.reverse();
        System.out.println("String before reverse: " + stringSOS);
        System.out.println("String after reverse: " + input1);
    }
}
