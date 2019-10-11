package main.JAVA.stringuri;

public class StringReplaceEmp {
    public static void main(String[] args) {
        String str = "Hello World Hello Berti";
        System.out.println(str.replace("H", "B"));
        System.out.println((str.replaceFirst("He", "Be")));
        System.out.println(str.replace("He", "Beee"));
        System.out.println(str.replace("He", "Meeee"));
    }
}
