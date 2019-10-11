package main.JAVA.stringuri;

public class SearchlastString {
    public static void main(String[] args) {
        /*String strOriginal = "Hello world, Hello Reader, Hello";
        int lastIndex = strOriginal.lastIndexOf("Bye");

        if(lastIndex == -1) {
            System.out.println("Bye not found");
        } else {
            System.out.println("Last ocurrence of Bye" + " is at index " + lastIndex);
        }*/

        String str2 = "Hy all to you all";
                int Index = str2.indexOf("yo");

        if(Index == -1) {
            System.out.println(("yo not found"));
        } else {
            System.out.println("Found yo at index" + Index);
        }
    }
    }
