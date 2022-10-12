package com.company.javaFundamentals.lesson7_1008.recap.example4;

public class Train {

    public String name;
    public double length;

    public Train() {
    }

    public Train(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public void go(Bridge bridge) {
        if (bridge.isExploded) {
            System.out.println("route 1 can't go, it exploded = " + bridge.isExploded);
        }else {
            System.out.println("route 2 all is good i go, is exploded = " + bridge.isExploded);
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
