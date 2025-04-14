package org.example;

public class Dishwasher extends Appliance{
    private int programs;

    public Dishwasher(String name, int power, String brand, int programs) {
        super(name, power, brand);
        this.programs = programs;
    }

    public Dishwasher() {
        this("Dishwasher", 1800, "Bosch", 5);
    }

    public int getPrograms() {
        return programs;
    }

    public void setPrograms(int programs) {
        this.programs = programs;
    }

    @Override
    public void turnOn() {
        System.out.println("Посудомоечная машина включена.");
    }

    @Override
    public void turnOff() {
        System.out.println("Посудомоечная машина выключена.");
    }

    // Переопределение метода для вывода информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество программ: " + programs);
    }
}
