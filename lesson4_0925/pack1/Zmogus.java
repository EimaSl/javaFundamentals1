package com.company.javaFundamentals.lesson4_0925.pack1;

public class Zmogus {

    String vardas;
    int amzius;
    long asmensKodas;
    int raumenuJega;
    int saugusSvoris;
    String sex;


    void nestiDaikta(Daiktas daiktas) {

        boolean arGaliPakelti = raumenuJega >= daiktas.svoris;
        boolean arSaugusSvoris = saugusSvoris >= daiktas.svoris;
        if (arGaliPakelti && arSaugusSvoris) {
            System.out.println(" // Nesiu " + daiktas.pavadinimas + " i garaza.");
            System.out.println(" ** Nesiu atsargiai nes virsijam saugu svori kuris: " + saugusSvoris);
            System.out.println();

        } else {
            System.out.println(" // Daiktas: " + daiktas.pavadinimas + " - Svoris per sunkus: "
                    + daiktas.svoris + " , deja galiu pakelti tik: " + raumenuJega);
            System.out.println();

        }
    }
}
