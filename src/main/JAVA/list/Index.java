package main.JAVA.list;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Index {
    public static int Index(List<Integer>num, int n) {
       for (int i=0; i<num.size(); i++) {
           if(num.contains(n)) {
               return num.indexOf(n);
           }
       }
       return -1;
    }

    public static void main(String[] args) {
    List<Integer> num = new ArrayList<>();
    num.add(20);
    num.add(10);
    num.add(15);
        System.out.println(Index(num, 7));
    }

}
