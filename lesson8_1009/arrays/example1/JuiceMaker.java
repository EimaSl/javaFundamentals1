package com.company.javaFundamentals.lesson8_1009.arrays.example1;

public class JuiceMaker extends HomeAppliance{

    String owner;

    public JuiceMaker(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "JuiceMaker{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
