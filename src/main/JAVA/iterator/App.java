package main.JAVA.iterator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        Iterator<String> it = animals.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
            if(value.equals("cat")) {
                it.remove();
            }
        }
        Iterator<String> it1 = animals.iterator();
        while (it1.hasNext()) {
            String value = it1.next();
            System.out.println(value);
        }
    }

}
