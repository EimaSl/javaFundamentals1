package com.company.javaFundamentals.lesson7_1008.recap.example1;

public class Bus {

    public String brand;
    public int price;
    public boolean isElectrical;

    public Bus() {
    }

    public Bus(String brand, int price, boolean isElectrical) {
        this.brand = brand;
        this.price = price;
        this.isElectrical = isElectrical;
    }

    public void ridePerson(Person person){
        System.out.println(person);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isElectrical=" + isElectrical +
                '}';
    }
}
