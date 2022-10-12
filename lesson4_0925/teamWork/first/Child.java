package com.company.javaFundamentals.lesson4_0925.teamWork.first;

public class Child {

    String name;
    int age;
    String kids;

    double neededPocketMoney(double pocketMoney) {
        System.out.println("Ona says to Antanas give to "
                + name + ": pocket money to school, he need:" + pocketMoney + " Eur");
        return pocketMoney;
    }
}
