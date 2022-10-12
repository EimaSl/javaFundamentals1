package com.company.javaFundamentals.lesson7_1008.recap.example9;

import java.util.Objects;

public class Phone {

    public String brand;
    public int version;

    public Phone(String brand, int version) {
        this.brand = brand;
        this.version = version;
    }

    public void useApp(App app){
        if(app.name.equals("IOS")){
            System.out.println(" We use app - " + app.description);
        }else {
            System.out.println("Not meet requirements");
        }

    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", version=" + version +
                '}';
    }
}
