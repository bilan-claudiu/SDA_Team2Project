package main.JAVA.mostenire;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super("Nemo", 1, 1, 5, 8);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    public void rest() {
            System.out.println("rest method");
    }
    public void moveMuscles() {
            System.out.println("moveMuscles method");
    }
    public void moveBackFin() {
            System.out.println("moveBackFin method");
    }
    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);

}
}
