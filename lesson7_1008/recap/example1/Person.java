package com.company.javaFundamentals.lesson7_1008.recap.example1;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
