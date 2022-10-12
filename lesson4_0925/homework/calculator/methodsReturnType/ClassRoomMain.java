package com.company.javaFundamentals.lesson4_0925.homework.calculator.methodsReturnType;

public class ClassRoomMain {

    public static void main(String[] args) {

        Teacher edvinas = new Teacher();
        edvinas.name = "Edvinas Miller";
        edvinas.knowledgeField = "Java Development";

        System.out.println();
        edvinas.greetStudents();
        edvinas.sayTodayTopic(": JAVA FUNDAMENTALS FROM SCRATCH");

        System.out.println();
        System.out.println("Is tired? - " + edvinas.isTired);
        System.out.println();
        edvinas.drinkSomeCoffee();
        System.out.println("Is tired? - " + edvinas.isTired);

        int favouriteNumber = edvinas.getTeacherFavouriteNumber();
        System.out.println("Treinerio miegstamiausias sveikas skaicius: " + favouriteNumber);

    }
}
