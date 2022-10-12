package com.company.javaFundamentals.lesson4_0925.homework.HW1;

public class Main {
    public static void main(String[] args) {

        Bus nr021 = new Bus();
        nr021.Brand = "Volvo";
        nr021.fullElectric = false;
        nr021.price = 250_000;
        nr021.weight = 19_000;
        nr021.yearBuild = 2022;

        BusStops busStops1 = new BusStops();
        busStops1.stopName = "Saulietikio st.";
        busStops1.distance = 25;

        BusStops busStops2 = new BusStops();
        busStops2.stopName = "Zveryno st.";
        busStops2.distance = 50;

        Passengers nr21 = new Passengers();
        nr21.numberOfPassengers(2,busStops1);

        System.out.println();
        nr021.onCharging();
        nr021.fullyCharged(100);
        nr021.rentedByCustomer("UAB VVT");
        nr021.rentPrice(125);


    }
}
