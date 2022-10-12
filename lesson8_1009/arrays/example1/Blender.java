package com.company.javaFundamentals.lesson8_1009.arrays.example1;

public class Blender extends  HomeAppliance{

    public String brand;

    public Blender(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Blender{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
