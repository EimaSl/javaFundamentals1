package com.company.javaFundamentals.lesson7_1008.recap.basic_arrays.TeamWorkParking;

public class Car {

    public String brand;
    public String regNumber;

    public Car() {
    }

    public Car(String brand, String regNumber) {
        this.brand = brand;
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}
