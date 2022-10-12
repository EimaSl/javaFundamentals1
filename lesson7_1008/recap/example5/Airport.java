package com.company.javaFundamentals.lesson7_1008.recap.example5;

public class Airport {

    public String country;
    public String name;

    public Airport(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public void printPlaneSeatNumber(Plane plane) {
        System.out.println("Plane: " + plane.model + " has " + plane.seatNumber + " seats");
    }

    @Override
    public String toString() {
        return "Airport{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
