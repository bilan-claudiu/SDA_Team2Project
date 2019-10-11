package main.JAVA.Probleme;

public class Distance {

    public static int HelloWorld(String str1, String str2, String str3) {
        String cuvinte[] = str3.split("\\s");
        int poz1 = 0;
        int poz2 = 0;
        int rez = -1;
        for (int i = 0; i < cuvinte.length; i++) {
            if (cuvinte[i].equals(str1)) {
                poz1 = i;
            } else if (cuvinte[i].equals(str2)) {
                poz2 = i;
            } else {
                continue;
            }
            if (poz1 != 0 && poz2 != 0) {
                rez = Math.abs(poz1 - poz2) - 1;
            }
        }
        return rez;
    }

    public static void main(String[] args) {
        System.out.println(HelloWorld("helo", "world", "helo, cat, world, dog, dog, cat, world"));
    }
}

/*Find an efficient algorithm to find the smallest distance (measured in number of words) between any two given words in a string.
For example, given words "hello", and "world" and a text content of "dog cat hello cat dog dog hello cat world", return 1 because there's only one word "cat" in between the two words. */

