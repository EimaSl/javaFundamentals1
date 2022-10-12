package com.company.javaFundamentals.lesson7_1008.recap.example5;

public class Main {
    public static void main(String[] args) {

        Airport vln = new Airport("Lithuania", "VLN");
        Plane boeing = new Plane("Boeing", 300);

        vln.printPlaneSeatNumber(boeing);
        boeing.fly(vln);
    }

}
