package com.company.javaFundamentals.lesson8_1009.arrays.loops;

public class LoopsMain {

    public static void main(String[] args) {

        Fish[] aquarium = new Fish[3];
        aquarium[0] = new Fish("Lydeka", 52);
        aquarium[1] = new Fish("Starkis", 45);
        aquarium[2] = new Fish("Pleksne", 1000);


        int totalFishesLength = 0;
        for (Fish singleFish : aquarium) {
            singleFish.swim();
            System.out.print("Using for each // Pagavau: " + singleFish.name + " / ");
            totalFishesLength += singleFish.length;
            System.out.println(singleFish);
            System.out.println("Total fishes length: " + totalFishesLength
                    + "cm, or aproximatelly: " + totalFishesLength / 1000 + " meters.");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < aquarium.length; i++) {
            System.out.println("Using fori // Pagavau: " + aquarium[i].name);

        }
        System.out.println();
        String[] vardai = {"Vacys", "Ignas", "Linas"};
        // iter
        for (String vardas : vardai) {
            System.out.println("Using iter // Name is: " + vardas);
        }

    }
}

class Fish {
    String name;
    int length;

    public void swim(){
        System.out.println("I'm swimming to Africa");
    }

    public Fish(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
