package com.company.javaFundamentals.lesson5_1001.teamW1;

public class Main {

    public static void main(String[] args) {

        Country baltarusija = new Country();
        baltarusija.countryName = "Belarusija";
        baltarusija.altiduesA = 152425512;
        baltarusija.altiduesB = 152425512;
        baltarusija.countryPopulation = 15_015_000;
        baltarusija.economicalSituationFactor = 12.5;
        baltarusija.countryShortName = 'B';
        baltarusija.countryCode = 2525;

        System.out.println(baltarusija);


        Country danija = new Country("Danija",true, 25255252,35355353,
                8_000_000,5636,'D',25.3);
        System.out.println(danija);




    }
}
