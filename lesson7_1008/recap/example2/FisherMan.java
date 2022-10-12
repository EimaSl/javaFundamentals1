package com.company.javaFundamentals.lesson7_1008.recap.example2;

public class FisherMan {

    public String name;
    public int experience;

    public FisherMan() {
    }

    public FisherMan(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void goFishing() {
        System.out.println("Going fishing");
    }

    public void sellFish(Fish fish) {
        if (fish.size > 50) {
            System.out.println("parduodu zuvi uz " + fish.size * 3.5);

        } else {
            System.out.println("Paleidziu");
        }
    }

    @Override
    public String toString() {
        return "FisherMan{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
