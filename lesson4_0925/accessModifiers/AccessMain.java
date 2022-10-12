package com.company.javaFundamentals.lesson4_0925.accessModifiers;

public class AccessMain {

    public static void main(String[] args) {

        Dog dog = new Dog();

        //public /package level
        System.out.println("Dog's name: " + dog.name);
        System.out.println("Dog's owner: " + dog.ownerName);

        //default /package level
        System.out.println("Dog's address: " + dog.adress);
        System.out.println("Dog's age: " + dog.age);


        //private /package level - reikia getter/setter // pasiekiamas tik klases viduje
//        System.out.println("Dog is hungry" + dog.isHungry);
        dog.sayHungryStatus(); // public metodas pasiekiamas visur




    }
}
