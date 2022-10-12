package com.company.javaFundamentals.lesson7_1008.recap.example2;

public class FishingMain {

    public static void main(String[] args) {

        Fish fish = new Fish("Pike", 104);
        FisherMan justas = new FisherMan("Justas", 25);

        justas.goFishing();
        justas.sellFish(fish);
        System.out.println(justas);

    }
}
