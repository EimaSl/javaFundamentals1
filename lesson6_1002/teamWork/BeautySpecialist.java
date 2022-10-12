package com.company.javaFundamentals.lesson6_1002.teamWork;

import java.util.Scanner;

public class BeautySpecialist {

    String saloonName;
    String specialistName;

    public Scanner scanner = new Scanner(System.in);

    public BeautySpecialist(String saloonNameOfSpecialist, String specialistName) {
        this.saloonName = saloonNameOfSpecialist;
        this.specialistName = specialistName;
    }

    public void dyeHair(Customer customer) {
        System.out.println("    What dye color would you like? Please select from options below: ");
        System.out.println("    1. Tulip 2.Plum 3.Atlantic 4.Lagoon 5.White 6.Ebony 7.String 8.Other? ");
        int neededDyeCustomerHair = scanner.nextInt();
        selectionOfDyeColor(customer, neededDyeCustomerHair);
    }

    public void hairStyleChange(Customer customer) {
        System.out.println("    What style would you like: 1.Pixie cut.  2.Bob  3.Medium length. 4.Other? ");
        int neededHairStyle = scanner.nextInt();
        selectionOfHairStyle(customer, neededHairStyle);
    }

    private void selectionOfHairStyle(Customer customer, int neededHairStyle) {
        if (neededHairStyle == 1) {
            customer.customerHairStyle = "Pixie cut";
            hairStyleInfo(customer);
        }
        else if (neededHairStyle == 2) {
            customer.customerHairStyle = "Bob";
            hairStyleInfo(customer);
        }
        else if (neededHairStyle == 3) {
            customer.customerHairStyle = "Medium length";
            hairStyleInfo(customer);
        }
        else if (neededHairStyle == 4) {
            System.out.print("What hair style you want? ");
            customer.customerHairStyle = scanner.next();
            hairStyleInfo(customer);
        } else {
            System.out.println(" You need to choose something :)");
        }
    }

    private void selectionOfDyeColor(Customer customer, int neededHairDye) {
        if (neededHairDye == 1) {
            customer.customerDye = "Tulip";
            dyeColorInfo(customer);
        } else if (neededHairDye == 2) {
            customer.customerDye = "Plum";
            dyeColorInfo(customer);
        } else if (neededHairDye == 3) {
            customer.customerDye = "Atlantic";
            dyeColorInfo(customer);
        } else if (neededHairDye == 4) {
            customer.customerDye = "Lagoon";
            dyeColorInfo(customer);
        } else if (neededHairDye == 5) {
            customer.customerDye = "White";
            dyeColorInfo(customer);
        } else if (neededHairDye == 6) {
            customer.customerDye = "Ebony";
            dyeColorInfo(customer);
        } else if (neededHairDye == 7) {
            customer.customerDye = "String";
            dyeColorInfo(customer);
        } else if (neededHairDye == 8) {
            System.out.print("Please put color you want: ");
            customer.customerDye = scanner.next();
            dyeColorInfo(customer);
        } else {
            System.out.println("You need to choose something :)");
        }
    }

    private void dyeColorInfo(Customer customer) {
        System.out.println("Thank you, now you color is " + customer.customerDye);
    }

    private void hairStyleInfo(Customer customer) {
        System.out.println("Thank you, now you color is " + customer.customerHairStyle);
    }

    @Override
    public String toString() {
        return "BeautySpecialist{" +
                "saloonName='" + saloonName + '\'' +
                ", specialistName='" + specialistName + '\'' +
                ", scanner=" + scanner +
                '}';
    }
}
