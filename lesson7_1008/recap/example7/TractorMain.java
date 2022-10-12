package com.company.javaFundamentals.lesson7_1008.recap.example7;

public class TractorMain {

    public static void main(String[] args) {
        Tractor tractor = new Tractor("John", 160, false);
        Driver driver = new Driver("Edvinas" , 10);

        driver.turnOnTractor(tractor);
        tractor.ride();
    }
}
