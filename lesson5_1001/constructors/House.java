package com.company.javaFundamentals.lesson5_1001.constructors;

public class House {

    public String name;
    public int year;
    public int price;
    public boolean isModern;

    //konstruktorius yra kiekvienoje klaseje, bet jis nematomas - default

    public House() {
        System.out.println("Iskvieciamas default konstruktorius.");
    }

    //parameterizuotas konstruktorius
    public House(String name, int year, int price, boolean isModern) {
        System.out.println();
        System.out.println("Iskvieciamas konstruktorius su parametrais");
        this.name = name;
        this.year = year;
        this.price = price;
        this.isModern = isModern;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isModern=" + isModern +
                '}';
    }
}
