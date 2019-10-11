package main.JAVA.varrargs;

import javax.print.DocFlavor;

public class App3 {
    public static void main(String[] args) {
        StaticendfinalEx.description = "I am a thing";
        StaticendfinalEx.ShowInfo();
       // StaticendfinalEx.showName();
        System.out.println("Before creating objects," + "count is:" + StaticendfinalEx.count);
        StaticendfinalEx App3a = new StaticendfinalEx();
        StaticendfinalEx App3b = new StaticendfinalEx();
        System.out.println("After creating object," + "count is:" +  StaticendfinalEx.count);
        App3a.name = "Bob";
        App3b.name = "Sue";
        App3a.showName();
        App3b.showName();
        System.out.println(Math.PI);
        System.out.println(StaticendfinalEx.LUCKY_NUMBER);

    }
}
