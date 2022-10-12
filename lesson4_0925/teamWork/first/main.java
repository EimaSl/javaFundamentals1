package com.company.javaFundamentals.lesson4_0925.teamWork.first;

public class main {
    public static void main(String[] args) {

        //parents
        Parents antanas = new Parents();
        antanas.name = "Antanas";
        antanas.age = 35;
        antanas.powerLevel = 1;
        antanas.parents = "Farther";
        antanas.cashAmount = 50;
        antanas.tellJoke("easy");

        Parents ona = new Parents();
        ona.name = "Ona";
        ona.age = 30;
        ona.powerLevel = 2;
        ona.parents = "Mather";
        ona.tellJoke("easy");

        //kids
        Child jonas = new Child();
        jonas.name = "Jonas";
        jonas.age = 15;
        jonas.kids = "son";

        Child eva = new Child();
        eva.name = "Eva";
        eva.age = 10;
        eva.kids = "daughter";

        System.out.println();
        double jonasPocketMoney = jonas.neededPocketMoney(10);
        double evaPocketMoney = eva.neededPocketMoney(10);


        if (antanas.cashAmount - jonasPocketMoney > 0) {
            System.out.println("We have given to kid = " + jonasPocketMoney);

            antanas.cashAmount = antanas.cashAmount - jonasPocketMoney;
            System.out.println("Tecio likutis = " + antanas.cashAmount);
        }
        else {
            System.out.println("Nera pinigu");
        }

    }
}
