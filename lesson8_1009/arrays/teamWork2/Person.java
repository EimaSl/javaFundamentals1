package com.company.javaFundamentals.lesson8_1009.arrays.teamWork2;

public class Person {

    public String name;
    public int customerNumber;

    public Person(String name, int customerNumber) {
        this.name = name;
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", customerNumber=" + customerNumber +
                '}';
    }
}
