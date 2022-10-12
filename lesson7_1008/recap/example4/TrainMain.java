package com.company.javaFundamentals.lesson7_1008.recap.example4;

public class TrainMain {

    public static void main(String[] args) {
        Train train1 = new Train("Ecosolo", 85);
        Bridge bridgeSaules1 = new Bridge(true);
        Bridge bridgeKauno3 = new Bridge(false);

        train1.go(bridgeSaules1);
        train1.go(bridgeKauno3);
    }
}
