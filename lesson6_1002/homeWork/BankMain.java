package com.company.javaFundamentals.lesson6_1002.homeWork;

public class BankMain {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Jam", 15_567.23, 0001);
        ATM atm = new ATM();

        atm.accountMoneyActions(creditCard);
    }

}
