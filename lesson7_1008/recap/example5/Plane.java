package com.company.javaFundamentals.lesson7_1008.recap.example5;

public class Plane {

    public String model;
    public int seatNumber;

    public Plane(String model, int seatNumber) {
        this.model = model;
        this.seatNumber = seatNumber;
    }

    public void fly(Airport airport) {
        System.out.println("Airport: " + model + " is flying to " + airport.country + " " + airport.name);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
