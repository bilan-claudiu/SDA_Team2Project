package main.JAVA;

public class Student {
    public static int NUMBER = 2;
    private int age;
    private String name;
    public Student() {
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void calculate() {
        int numberofFriends = age * NUMBER;
        System.out.println("Num of friends:" + numberofFriends);
    }
}
