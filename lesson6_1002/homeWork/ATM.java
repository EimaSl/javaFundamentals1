package com.company.javaFundamentals.lesson6_1002.homeWork;

import java.util.Objects;
import java.util.Scanner;

public class ATM {

    public String brand;
    private double cashBalance;

    Scanner scanner = new Scanner(System.in);

    boolean userAuthenticated(CreditCard creditCard) {

        System.out.println("           USER AUTHENTICATION PROCESS....");
        System.out.print("Please enter login name:     ");
        String loginName = scanner.next();
        System.out.print("Please enter login password: ");

        int loginPassword = scanner.nextInt();

        if (Objects.equals(creditCard.ownerName, loginName) && creditCard.pinCode == loginPassword) {
            System.out.println("         User " + creditCard.ownerName + " connected.");
            System.out.println();
            return true;
        } else {
            return false;
        }

    }

    void accountMoneyActions(CreditCard creditCard) {
        if (userAuthenticated(creditCard)) {
            showMenu();

            int optionFromMenu = scanner.nextInt();

            if (optionFromMenu == 1) {
                balanceData(creditCard);
                accountMoneyActions(creditCard);
            } else if (optionFromMenu == 2) {
                processAddMoney(creditCard);

            } else if (optionFromMenu == 3) {
                processWithdraw(creditCard);
            } else {
                System.out.println("There are no such option, please select from menu");
                accountMoneyActions(creditCard);
            }
        } else {
            System.out.println("User is not authenticated, please contact office support");
        }
    }

    private void processWithdraw(CreditCard creditCard) {
        System.out.println("Enter cash you need: ");
        int cashToTake = scanner.nextInt();
        if (creditCard.balance < cashToTake || cashToTake < 0) {
            System.out.println("Balance is smaller than amount you need or negative");
        } else {
            creditCard.balance -= cashToTake;
            balanceData(creditCard);
            accountMoneyActions(creditCard);
        }
    }

    private void processAddMoney(CreditCard creditCard) {
        System.out.println("Enter amount of money to transfer to account: ");
        int transferToAccount = scanner.nextInt();
        if (transferToAccount > 0) {
            creditCard.balance += transferToAccount;
            balanceData(creditCard);
        } else {
            System.out.println("Input can't be negative");
        }
        accountMoneyActions(creditCard);
    }

    private void showMenu() {
        System.out.println("Select from menu");
        System.out.println("1. Current balance");
        System.out.println("2. Add money to balance");
        System.out.println("3. Take cash");
    }

    private void balanceData(CreditCard creditCard) {
        System.out.println("Current balance is: " + creditCard.balance + "Eur.");
    }
}
