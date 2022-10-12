package com.company.javaFundamentals.lesson7_1008.recap.examle6sun;

public class SunPanels {
    public String name;
    public int powerWats;
    public double voltage;
    public double price;
    public boolean doubleSide;

    public SunPanels(String name, int powerWats, double voltage, boolean doubleSide) {
        this.name = name;
        this.powerWats = powerWats;
        this.voltage = voltage;
        this.doubleSide = doubleSide;
    }

    public void sunPanelJinko(){
        System.out.println("Saulės panelė Jinko Solar JKM450M-60HL-4-V 450W 41V, kaina = " + price + "Eur");
    }

    @Override
    public String toString() {
        return "SunPanels{" +
                "name='" + name + '\'' +
                ", powerWats=" + powerWats +
                ", voltage=" + voltage +
                ", doubleSide=" + doubleSide +
                '}';
    }
}
