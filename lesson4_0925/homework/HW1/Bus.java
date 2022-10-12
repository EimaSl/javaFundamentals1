package com.company.javaFundamentals.lesson4_0925.homework.HW1;

public class Bus {

    public int yearBuild;
    public int weight;
    public double price;
    public String Brand;
    public boolean fullElectric;

    public static void onCharging() {
        System.out.println("State:                          Charging");
    }

    public static void fullyCharged(int chargedLevel) {
        System.out.println("Ready to Go , charged level:    " + chargedLevel + " %");
        double drivableDistance = chargedLevel * 2.50;
        System.out.println("Can drive:                      " + drivableDistance + " km.");
    }

    public static void rentedByCustomer(String customersName) {
        System.out.println("Customer name's:                " + customersName);
    }

    public void rentPrice(int mileageDistance) {
        if (fullElectric == true) {
            System.out.println();
            System.out.println("Electric price                  0.85 Eur/km");
            System.out.println("Rent price =                    " + mileageDistance * 0.85 + " Eur.");

        } else {
            System.out.println();
            System.out.println("Diesel price                    1.21 Eur/km");
            System.out.println("Rent price =                    " + mileageDistance * 1.21 + " Eur.");
        }
    }

}
