package com.company.javaFundamentals.lesson7_1008.recap.examle6sun;

public class Main {
    public static void main(String[] args) {

        House house1 = new House("Taikos 20", 25, 10000);
        SunPanels sunPanels = new SunPanels("Jinko", 450, 41, false);
        PanelsPowerCalculator panelsPowerCalculator = new PanelsPowerCalculator(299, 150);
        MPPT mppt = new MPPT("GREEN CELL", 24, 619, 3000);
        LiFePo4 liFePo4 = new LiFePo4("PKNERGY", 60, 172, 2500);

        int totalPower = panelsPowerCalculator.totalPower(sunPanels, house1);
        int totalNumberOfMppt = panelsPowerCalculator.neededNumberOfMppt(house1, mppt);
        int totalNeededNumberOfBatteries = panelsPowerCalculator.neededNumberOfBatteries(house1, mppt, liFePo4);
        int total = (totalPower * panelsPowerCalculator.panelsPrice / 1000) + (totalPower *
                panelsPowerCalculator.panelsInstalationPrice / 1000) + (totalNumberOfMppt * mppt.price)
                + (totalNeededNumberOfBatteries * liFePo4.batteryPrice);

        System.out.println("OffGrid system");
        System.out.println("Total power output sun panels : " + totalPower / 1000 + " kW");
        System.out.println("Total panels price:             " + totalPower * panelsPowerCalculator.panelsPrice / 1000 + " Eur");
        System.out.println("Workship:                       " + totalPower *
                panelsPowerCalculator.panelsInstalationPrice / 1000 + " Eur");
        System.out.println("Number of MPPT:                 " + totalNumberOfMppt);
        System.out.println("Total price MPPT:               " + totalNumberOfMppt * mppt.price + " Eur");
        System.out.println("Needed number of batteries:     " + totalNeededNumberOfBatteries);
        System.out.println("Total batteries price:          " + totalNeededNumberOfBatteries * liFePo4.batteryPrice + "Eur");
        //System.out.println("Total batteries capacity:       " + totalNeededNumberOfBatteries * liFePo4.capacity + "Ah");
        System.out.println("Total batteries capacity:       " + (totalNeededNumberOfBatteries * liFePo4.capacity * mppt.operatingVoltage) / 1000 + "kWh");
        System.out.println("---------");
        System.out.println("Total : " + total + " Eur");

    }
}
