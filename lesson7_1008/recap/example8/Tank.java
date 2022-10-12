package com.company.javaFundamentals.lesson7_1008.recap.example8;

public class Tank {

    public String brand;
    public boolean isGoing;

    public Tank(String brand, boolean isGoing) {
        this.brand = brand;
        this.isGoing = isGoing;
    }

    public void shoot(){
        System.out.println("Tank is shooting");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "brand='" + brand + '\'' +
                ", isGoing=" + isGoing +
                '}';
    }
}
