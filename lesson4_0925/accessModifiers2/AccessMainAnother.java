package com.company.javaFundamentals.lesson4_0925.accessModifiers2;

import com.company.javaFundamentals.lesson4_0925.accessModifiers.Dog;

public class AccessMainAnother {
    public static void main(String[] args) {

        //pasiekt is package Access modifier

        Dog dog = new Dog();

        //public /package level
        System.out.println("Dog's name: " + dog.name);
        System.out.println("Dog's owner: " + dog.ownerName);

        //default /package level / PASIEKT NEGALIU is kito package
//        System.out.println("Dog's address: " + dog.adress);
//        System.out.println("Dog's age: " + dog.age);

        //private /package level - reikia getter/setter
        dog.sayHungryStatus();
    }
}
