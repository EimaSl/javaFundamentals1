package com.company.javaFundamentals.lesson7_1008.recap.example9;

public class Main {

    public static void main(String[] args) {

        App app = new App("Facebook","Communication");
        Phone phone = new Phone("Nokia", 2);

        phone.useApp(app);

    }
}
