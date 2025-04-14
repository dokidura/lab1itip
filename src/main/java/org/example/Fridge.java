package org.example;

public class Fridge extends Appliance{
    private int capacity;

    public Fridge(String name, int power, String brand, int capacity) {
        super(name, power, brand);
        this.capacity = capacity;
    }

    public Fridge() {
        this("Fridge", 150, "LG", 300);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Реализация абстрактных методов
    @Override
    public void turnOn() {
        System.out.println("Холодильник включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Холодильник выключен.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Объем холодильника: " + capacity + " литров.");
    }
}
