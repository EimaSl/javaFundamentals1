package com.company.javaFundamentals.lesson7_1008.recap.example9;

public class App {

    public String name;
    public String description;

    public App(String name, String description) {
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
