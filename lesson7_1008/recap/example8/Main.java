package com.company.javaFundamentals.lesson7_1008.recap.example8;

public class Main {
    public static void main(String[] args) {

        Solder solder = new Solder("Jonas", 40);
        Tank tank = new Tank("Type59", false);

        System.out.println("Solder status - " + solder.isAlive());

        solder.shootWithTank(tank);

        System.out.println();
        System.out.println(solder);
        System.out.println(tank);
    }
}
