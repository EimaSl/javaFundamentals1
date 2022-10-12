package com.company.javaFundamentals.lesson6_1002.homeWork;

public class CreditCard {

    String ownerName;
    double balance;
    int pinCode;

    public CreditCard(String ownerName, double balance, int pinCode) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", pinCode=" + pinCode +
                '}';
    }
}
