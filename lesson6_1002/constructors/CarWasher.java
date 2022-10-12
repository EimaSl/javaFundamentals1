package com.company.javaFundamentals.lesson6_1002.constructors;

public class CarWasher {

    public void printOutCarDetails(String brand, String color, int price, boolean isClean, double weight){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(price);
        System.out.println(isClean);
        System.out.println(weight);
        System.out.println();
    }

    public void printOutCarDetails(Car car){
        System.out.println(car.brand);
        System.out.println(car.color);
        System.out.println(car.price);
        System.out.println(car.isClean);
        System.out.println(car.weight);
        System.out.println(car.isDamaged);
    }

    public void washCar(Car auto){
        System.out.println("Plaunam masina " + auto.brand);
        if (auto.isClean){
            System.out.println("Nera ko plauti ir taip grazi.");
        }else {
            auto.isClean=true;
            System.out.println("Masina plauname, dabar yra svari.");
        }
    }

}
