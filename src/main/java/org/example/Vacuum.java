package org.example;

public class Vacuum extends Appliance{
    private int suctionPower;

    public Vacuum(String name, int power, String brand, int suctionPower) {
        super(name, power, brand);
        this.suctionPower = suctionPower;
    }

    public Vacuum() {
        this("Vacuum Cleaner", 1200, "Dyson", 200);
    }

    public int getSuctionPower() {
        return suctionPower;
    }

    public void setSuctionPower(int suctionPower) {
        this.suctionPower = suctionPower;
    }

    @Override
    public void turnOn() {
        System.out.println("Пылесос включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Пылесос выключен.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Мощность всасывания: " + suctionPower + " Вт.");
    }
}
