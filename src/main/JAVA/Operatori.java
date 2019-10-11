package main.JAVA;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Operatori {
public static void main(String[]args){
    int a = 10;
    int b = 20;
    System.out.println("Sum :" + (a + b));
    System.out.println("Diff:" + (b-a)); //10
    System.out.println("Multiply:" + (a*b));
    System.out.println("Div" + (a/b)); //quotient
    System.out.println("Mod Div" + (a % b)); //reminder

    System.out.println(a > b); //false
    System.out.println(b > a); //true
    System.out.println(a != b); //true
    System.out.println(a < b); //true
    System.out.println(a > b ); //false

    boolean x = true;
    boolean y = false;

    System.out.println(x && y); //false
    System.out.println(x || y); //true
    System.out.println(!x); //false

    a = 100;
    int resPost=a++; // post increment
    int resPre=++a; // pre increment

    System.out.println(a);
    System.out.println(resPost);
    System.out.println(resPre);

    b = 100;
    int resBPost = b--;
    int resBPre = --b;

    System.out.println(resBPost);
    System.out.println(resBPre);
    System.out.println("abc" instanceof String);
}
}
