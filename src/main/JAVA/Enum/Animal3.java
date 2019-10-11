package main.JAVA.Enum;

public enum Animal3 {
    CAT ("Pisi"),
    DOG ("Kim"),
    MOUSE ("Jerry");
    private String name;
    Animal3(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "This animal is called: " + name;
    }
}
