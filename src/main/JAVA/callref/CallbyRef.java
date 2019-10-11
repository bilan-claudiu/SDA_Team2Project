package main.JAVA.callref;

public class CallbyRef {
    int x;
    public void addition (int a) {
        x=a+5;
        System.out.println(x);
    }

    public static void main(String[] args) {
        CallbyRef cr=new CallbyRef();
        cr.addition(10);
        System.out.println(cr.x);
    }
}


// se pot pasa parametri : val si ref(a unui obiect-nu e ceva primitiv)


