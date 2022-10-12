package com.company.javaFundamentals.lesson7_1008.recap.example8;

public class Solder {

    public String name;
    public int age;

    public boolean isAlive() {
        return age > 18;
    }

    public void shootWithTank(Tank tank) {
        tank.shoot();
    }

    public Solder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Solder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
