package com.company.javaFundamentals.lesson7_1008.recap.example1;

public class BusMain {
    public static void main(String[] args) {

        Bus volvo123 = new Bus("Volvo",200000,true);
        Person andrius = new Person("Andrius");
        volvo123.ridePerson(andrius);
    }
}
