package main.JAVA.override;

public class App3 {
    public static void main(String[] args) {

        App1 person = new App1();
        person.sayHello();

        App1 student = new App2();
        student.sayHello();
    }
}
