package main.JAVA.compozitie;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSolts;
    private int cardSloats;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSolts, int cardSloats, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSolts = ramSolts;
        this.cardSloats = cardSloats;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSolts() {
        return ramSolts;
    }

    public void setRamSolts(int ramSolts) {
        this.ramSolts = ramSolts;
    }

    public int getCardSloats() {
        return cardSloats;
    }

    public void setCardSloats(int cardSloats) {
        this.cardSloats = cardSloats;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
    public void loadProgram(String programName) {
        System.out.println("Program" + programName + "is now loading...");
    }
}
