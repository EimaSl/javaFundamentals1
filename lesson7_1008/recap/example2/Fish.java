package com.company.javaFundamentals.lesson7_1008.recap.example2;

public class Fish {

    public String type;
    public double size;

    public Fish() {
    }

    public Fish(String type, int size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
