package com.company.javaFundamentals.lesson6_1002.constructors;

public class Car {

    public String brand;
    public String color;
    public int price;
    public boolean isClean;
    public  double weight;
    public boolean isDamaged;

    public Car(String brand, String color, int price, boolean isClean, double weight, boolean isDamaged) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.isClean = isClean;
        this.weight = weight;
        this.isDamaged = isDamaged;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", isClean=" + isClean +
                ", weight=" + weight +
                ", isDamaged=" + isDamaged +
                '}';
    }
}
