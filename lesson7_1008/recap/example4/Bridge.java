package com.company.javaFundamentals.lesson7_1008.recap.example4;

public class Bridge {

    public boolean isExploded;

    public Bridge(boolean isExploded) {
        this.isExploded = isExploded;
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "isExploded=" + isExploded +
                '}';
    }
}
