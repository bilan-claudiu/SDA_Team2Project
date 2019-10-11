package main.JAVA.varrargs;

public class StaticendfinalEx {
    public static int LUCKY_NUMBER = 7;
    public String name;
    public static String description;
    public static int count = 0;
    private int id;
    public StaticendfinalEx() {
        id = count;
        count++;
    }
    public void showName() {
        System.out.println("Object id:" + id + "," + description+ ":" + name);
    }
    public static void ShowInfo() {
        System.out.println(description);

    }
}
