package com.company.javaFundamentals.lesson7_1008.recap.examle6sun;

public class House {

    public String address;
    public int numberOfPanels;
    public int neededPower;

    public House(String address, int numberOfPanels, int neededPower) {
        this.address = address;
        this.numberOfPanels = numberOfPanels;
        this.neededPower = neededPower;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", numberOfPanels=" + numberOfPanels +
                ", neededPower=" + neededPower +
                '}';
    }
}
