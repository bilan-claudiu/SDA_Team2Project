package main.JAVA.incapsulare;

public class Car {
    private int wheels;
    private String model;
    private int engine;
    private int colour;
    private int dooors;

    public int getDoors() {
        return dooors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public int getEngine() {
        return engine;
    }

    public int getColour() {
        return colour;
    }


    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("112")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
}