package com.company.javaFundamentals.lesson6_1002.teamWork;

public class BeautySalonMain {

    public static void main(String[] args) {

        Customer jonas = new Customer("Jonas", "Flamingo",
                "Pixie cut", 15, false);
        BeautySpecialist daiva = new BeautySpecialist("&BEST BEAUTY SHOP&", "Daiva");

        welcomeWordToCustomer(jonas, daiva);
        daiva.dyeHair(jonas);
        daiva.hairStyleChange(jonas);
    }

    private static void welcomeWordToCustomer(Customer jonas, BeautySpecialist daiva) {
        System.out.println("---------------------------------------------------------");
        System.out.println("Welcome " + jonas.customerName + " to " + daiva.saloonName);
        System.out.println("---------------------------------------------------------");
    }
}

