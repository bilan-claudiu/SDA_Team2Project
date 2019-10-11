package main.JAVA.computerPrinter;
/*
public class Printer {
    public int toner;
    public int pages;
    public boolean type;

    public Printer(int toner, int pages, boolean type) {
        this.toner = toner;
        this.type = type;
    }

    public void addt (int addt)
        this.toner = toner;
        if (int addt>100) {
        System.out.println("Capacitate maxima atinsa");
        if (int addt<=100) {
            System.out.println("Toner ramas"+toner+%);
        }
    }
}*/

/* public class Printer {
    private int toner;
    private int nrPag;
    private  boolean duplex;
    private int printPages;

    public Printer(int toner, int nrPag, boolean duplex) {
        this.toner = toner;
        this.nrPag = nrPag;
        this.duplex = duplex;
    }

    public void addToner(int z) {
        if (z>100-toner){
            System.out.println("prea mult toner");
        }
        if (z<=100-toner) {
            System.out.println("Toner deajuns");
        }
    }

    public  void printPages(int printPages) {
        if (duplex==true) else {
            System.out.println("Au fost consumate " + printPages + " foi.");
        }
        this.printPages=this.printPages+printPages;
    }

    public void totalPrintedPages(){
        System.out.println("Total pagini printate: "+printPages);
    }

    public static void main(String[] args) {
        Printer p1=new Printer(0,0,true);
        p1.addToner(7);
        p1.printPages(200);
        p1.printPages(10);
        p1.totalPrintedPages();
    }
} */


/*// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors,
//and anything else you think is needed. */