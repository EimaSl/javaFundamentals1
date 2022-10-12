package com.company.javaFundamentals.lesson7_1008.recap.examle6sun;

public class MPPT {

    public String model;
    public int operatingVoltage;
    public int price;
    public int maxPower;

    public MPPT(String model, int operatingVoltage, int price, int maxPower) {
        this.model = model;
        this.operatingVoltage = operatingVoltage;
        this.price = price;
        this.maxPower = maxPower;
    }

    @Override
    public String toString() {
        return "MPPT{" +
                "model='" + model + '\'' +
                ", operatingVoltage=" + operatingVoltage +
                ", price=" + price +
                ", maxPower=" + maxPower +
                '}';
    }
}
