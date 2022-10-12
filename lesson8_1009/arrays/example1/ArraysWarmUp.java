package com.company.javaFundamentals.lesson8_1009.arrays.example1;

import java.util.Objects;

public class ArraysWarmUp {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Justas";
        names[2] = "Nikolajus";
        names[1] = "Linas";

//        System.out.println(Arrays.toString(names));
        ArrayPrinter.printArray(names);

        Object[] objects = new Object[3];
        objects[0] = new Blender("Bocsh");
        objects[1] = new JuiceMaker("Vacys");
        objects[2] = "Tomas";
//        System.out.println(Arrays.toString(objects));
        ArrayPrinter.printArray(objects);

        HomeAppliance[] homeAppliances = new HomeAppliance[3];
        homeAppliances[0] = new Blender("Siemiens");
        homeAppliances[1] = new Blender("Nikolajus");
//        System.out.println(Arrays.toString(homeAppliances));
        ArrayPrinter.printArray(homeAppliances);

        Integer[] savaitesDienos = {1,2,3,4,5,6,7};
        ArrayPrinter.printArray(savaitesDienos);



    }


}
