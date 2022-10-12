package com.company.javaFundamentals.lesson5_1001.operations_basic;

public class OperationsMain {

    public static void main(String[] args) {

        int niceNumber = 24; // "=" - priskiriomo operatorius
        System.out.println(24 == niceNumber); // == - palyginimo operatorius

        int suma = 5 + 9;
        int skirtimas = 10 - 15;
        int daugyba = 10 * 5;
        int dalyba = 10 / 5;
        System.out.println(5 % 2);

        int age = 15;
        age = age + 10;
        age += 10;
        System.out.println(age);

        int inkrement = 10;
        System.out.println("inkrement");
        System.out.println(inkrement);
        System.out.println(inkrement++); // pirma atspausdins tada padidins
        System.out.println(++inkrement); // pirma padidins, paskui atspaudins
        System.out.println(inkrement + 10);

        System.out.println();
        double price = 1.5;
        System.out.println(++price);
        System.out.println("------LOGICAL OP");
        //Ligical operators
        System.out.println(5 > 2);
        boolean isTrue = 5 > 2;
        System.out.println(isTrue);

        if (2 > 2 && 10 > 8) {
            System.out.println("Salyga Teisinga");
        } else {
            System.out.println("Salyga Neteisinga");
        }

        System.out.println();
        int personAge = 160;
        if (personAge < 18) {
            System.out.println("Alcohol can't be sold, you too young");
        } else if (18 <= personAge && personAge <= 70) {
            System.out.println("Accepted to sell");
        } else if (personAge >= 70 && personAge <= 150) {
            System.out.println("You are old");
        } else {
            System.out.println("You are zombie");
        }

    }
}
