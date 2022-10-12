package com.company.javaFundamentals.lesson7_1008.recap.example7;

public class Tractor {
    public String brand;
    public int power;
    public boolean isTurnOn;

    public Tractor(String brand, int power, boolean isTurnOn) {
        this.brand = brand;
        this.power = power;
        this.isTurnOn = isTurnOn;
    }

    public void ride(){
        System.out.println("Traktorius vaziuoja");
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", isTurnOn=" + isTurnOn +
                '}';
    }
}
