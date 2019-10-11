package main.JAVA;

public class FirstProgram extends Object {
    private String s;
    public FirstProgram() {
        s = "FirstProgram!";
    }
    public void sayFirstProgram1() {
        System.out.println(s);
    }
    public static void main(String[] args) {
    FirstProgram FirstProgram1 = new FirstProgram();
    FirstProgram1.sayFirstProgram1();
    }
}
