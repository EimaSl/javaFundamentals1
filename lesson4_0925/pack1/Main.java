package com.company.javaFundamentals.lesson4_0925.pack1;

public class Main {

    public static void main(String[] args) {



        Daiktas stalas = new Daiktas();
        stalas.pavadinimas = "Medinis stalas";
        stalas.tipas = "Madiena";
        stalas.svoris = 15;

        Zmogus justas = new Zmogus();
        justas.vardas = "Justas";
        justas.raumenuJega = 30;
        justas.saugusSvoris = 25;
        justas.sex = "Male";

        Daiktas variklis = new Daiktas();
        variklis.pavadinimas = "Variklis V8";
        variklis.svoris = 80;

        System.out.println();
        justas.nestiDaikta(stalas);
        justas.nestiDaikta(variklis);
    }

}
