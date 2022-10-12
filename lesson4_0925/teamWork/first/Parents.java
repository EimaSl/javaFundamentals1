package com.company.javaFundamentals.lesson4_0925.teamWork.first;

import java.util.Objects;

public class Parents {
    String name;
    String parents;
    int powerLevel;
    int age;
    double cashAmount;

    public void tellJoke(String typeOfJoke) {
        System.out.println(" ... Name says: " + name + " : ");
        if (Objects.equals(typeOfJoke, "easy")) {
            System.out.println("Today we will not go outside :) - joking let go for walk");
        } else if (Objects.equals(typeOfJoke, "hard")) {
            System.out.println("Today rain take umbrella :), joking");
        } else {
            System.out.println("No jokes today");
        }
    }

}
