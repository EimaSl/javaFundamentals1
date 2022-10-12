package com.company.javaFundamentals.lesson7_1008.recap.examle6sun;

public class PanelsPowerCalculator {

    public int panelsPrice;
    public int panelsInstalationPrice;

    public PanelsPowerCalculator(int panelsPrice, int panelsInstalationPrice) {
        this.panelsPrice = panelsPrice;
        this.panelsInstalationPrice = panelsInstalationPrice;
    }

    public int totalPower(SunPanels sunPanels, House house) {
        return sunPanels.powerWats * house.numberOfPanels;
    }

    public int neededNumberOfMppt(House house, MPPT mppt) {
        return house.neededPower / mppt.maxPower;
    }

    public int neededNumberOfBatteries(House house, MPPT mppt, LiFePo4 liFePo4) {
        return (house.neededPower / mppt.maxPower)*mppt.maxPower / (liFePo4.maxDischargeCurrent*14);
    }

    @Override
    public String toString() {
        return "PanelsPowerCalculator{" +
                "panelsPrice=" + panelsPrice +
                ", panelsInstalationPrice=" + panelsInstalationPrice +
                '}';
    }
}
