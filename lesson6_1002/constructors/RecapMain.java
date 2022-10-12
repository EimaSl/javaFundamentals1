package com.company.javaFundamentals.lesson6_1002.constructors;

public class RecapMain {

    public static void main(String[] args) {

        CarWasher carWash = new CarWasher();
//        carWash.printOutCarDetails("BMW", "Black", 15000, true, 2.1);

        Car volvo125 = new Car("Volvo", "Black", 15000, true, 2.1,true);
        Car bmw258 = new Car("BMW", "Purpule", 15000, false, 2.5,false);
//        carWash.printOutCarDetails(volvo125);
//        System.out.println(volvo125);


        carWash.washCar(volvo125);
        System.out.println();

        taskSplitter();
        System.out.println("Check, if car before wash is clean - " + bmw258.isClean);
        carWash.washCar(bmw258);
        System.out.println("Check, if car after wash is clean - " + bmw258.isClean);

        taskSplitter();
        CarPainter carPainter = new CarPainter();
        System.out.println("Before painting color is - " + volvo125.color);
        carPainter.paintCar(volvo125,"White");

        taskSplitter();
        carPainter.paintCarUsingScanner(volvo125);

    }

    private static void taskSplitter() {
        System.out.println("----------------------------------------------------");
        System.out.println("                                         new Sample ");
    }
}
