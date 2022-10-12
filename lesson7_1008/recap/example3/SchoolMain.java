package com.company.javaFundamentals.lesson7_1008.recap.example3;

public class SchoolMain {

    public static void main(String[] args) {

        Student tomas = new Student("Antanas", 4);
        Trainer edvinas = new Trainer("Edvinas", "Java");

        edvinas.introduction();
        edvinas.callStudent(tomas);
    }
}
