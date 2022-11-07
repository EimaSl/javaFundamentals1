package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.stringExerscises;

public class Contains9 {
    public static void main(String[] args) {

        String string = "102ses";
        //0-99
        //  i= 1 .. 9
        //        j= 1..9  => 1-99

        if (string.endsWith(".ji")){
            System.out.println(string);
        }
        //iteruoti 1-9
        else if ((string.endsWith("ses") == true)||(string.endsWith(".2") == true)) {
            String output = string.concat("0");
            System.out.println(output);
            //System.out.println("Yes, given string ends with 'ses'");
        }
        //iteruoti 1-9
        else if (string.endsWith("2") == true) {
            String output = string.concat(".00");
            System.out.println(output);
            //System.out.println("Yes, given string ends with 'ses'");
        }
    }
}
