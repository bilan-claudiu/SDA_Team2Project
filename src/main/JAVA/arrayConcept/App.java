package main.JAVA.arrayConcept;

import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        String[] Makeup = {"Concelar", "Blush", "Eyeliner", "Bronzer", "Powder"};
        String[] Makeup1 = new String[3];
        Makeup1[0] = "Concelar";
        Makeup1[1] = "Blush";
        Makeup1[2] = "Eyeliner";
        int[] numbers = {1, 5, 3, -2, 10, 8};
        for (int i = 0; i <= Makeup.length - 1; i++) {
            System.out.println(Makeup[i]);
        }
        Collections.sort(Arrays.asList(Makeup1));
        Arrays.sort(numbers);

        for (Integer i : numbers) {
            System.out.println(i);
        }
        for (String name : Makeup) {
            System.out.println(name);
        }
    }
}


