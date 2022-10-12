package com.company.javaFundamentals.lesson7_1008.recap.examle6sun;

public class LiFePo4 {

    public String brand;
    public int maxDischargeCurrent;
    public int capacity;
    public int batteryPrice;

    public LiFePo4(String brand, int maxDischargeCurrent, int capacity, int batteryPrice) {
        this.brand = brand;
        this.maxDischargeCurrent = maxDischargeCurrent;
        this.capacity = capacity;
        this.batteryPrice = batteryPrice;
    }

    @Override
    public String toString() {
        return "LiFePo4{" +
                "brand='" + brand + '\'' +
                ", maxDischargeCurrent=" + maxDischargeCurrent +
                ", capacity=" + capacity +
                ", batteryPrice=" + batteryPrice +
                '}';
    }
}
