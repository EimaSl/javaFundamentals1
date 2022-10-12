package com.company.javaFundamentals.lesson5_1001.constructors;

public class HouseMain {

    public static void main(String[] args) {

        //new house yra specifinis metodas/kostruktorius kuris sukuria objekta atmintije

        House house = new House();
        house.name = "Fancy house";
        house.year = 2010;
        house.price = 150_000;
        house.isModern = true;
        System.out.println(house);

        House justoHouse = new House("Modern House",2020,200_000,false);
        System.out.println(justoHouse);

    }
}
