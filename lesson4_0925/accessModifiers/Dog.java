package com.company.javaFundamentals.lesson4_0925.accessModifiers;

public class Dog {

    // public leidzia pasiekti laukus bet kokioje vietoje
    public String name = "Fido";
    public String ownerName = "Greg";

    //default
    String adress = "Liepu g. 15";
    int age = 10;

    //private
    private boolean isHungry = true;

    public void sayHungryStatus(){
        System.out.println("I'm hungry - " + isHungry); //private pasiekiamas viduje
    }
}
