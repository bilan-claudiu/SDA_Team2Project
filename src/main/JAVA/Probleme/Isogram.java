package main.JAVA.Probleme;

import java.util.ArrayList;
import java.util.List;


public class Isogram {
    static boolean Isogram(String r) {
        if (r.length() == 0)
            return true;

        List<Character> list = new ArrayList<>();
        for (char ch : r.toLowerCase().toCharArray()) {
            if (list.contains(ch))
                return false;
            if (ch != ' ' && ch != '-')
                list.add(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Isogram("abracAdabra"));
    }
}

