package com.company.javaFundamentals.lesson7_1008.recap.example7;

public class Driver {

    public String name;
    public int experienceLevel;

    public Driver(String name, int experienceLevel) {
        this.name = name;
        this.experienceLevel = experienceLevel;
    }

    public void turnOnTractor(Tractor tractor) {
        System.out.println("Ar gali " + name + "uzvesti " + tractor.brand);
        tractor.isTurnOn = true;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experienceLevel=" + experienceLevel +
                '}';
    }
}
