package com.company.javaFundamentals.lesson5_1001.operations_basic;

public class OperatorsMainPart2 {

    public static void main(String[] args) {

        boolean idFunny = true;
        boolean idRich = true;
        boolean isPretty = false;

        extracted(idFunny, idRich, isPretty);
    }

    private static void extracted(boolean idFunny, boolean idRich, boolean isPretty) {
        if (idFunny ||(idRich && isPretty)){
            System.out.println("Invite to dealer");
        }
    }
}
