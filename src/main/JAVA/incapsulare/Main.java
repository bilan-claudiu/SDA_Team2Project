package main.JAVA.incapsulare;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car skoda = new Car();
        porsche.setModel("PORSCHE");
        System.out.println("Model is " + porsche.getModel());
        skoda.setModel("112");
        System.out.println("Model found " + skoda.getModel());
    }
}


