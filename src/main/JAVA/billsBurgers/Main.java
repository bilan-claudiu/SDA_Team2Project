package main.JAVA.billsBurgers;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger ("pita", "chicken", 3);
        burger.addingredient1("lettuce", 2);
        burger.addingredient2("tomato", 1);
        burger.addingredient3("carrot", 1);
        burger.addingredient4("onion", 2);
        System.out.println("Pretul final este " + burger.pretulfinal());
    }

}
