package com.company.javaFundamentals.lesson5_1001.teamW1;

public class Country {

    public String countryName;
    public boolean isIndependent;
    public long altiduesA;
    public long altiduesB;
    public long countryPopulation;
    public int countryCode;
    public char countryShortName;
    public double economicalSituationFactor;

    public Country() {
    }

    public Country(String countryName, boolean isIndependent, long altiduesA, long altiduesB, long countryPopulation,
                   int countryCode, char countryShortName, double economicalSituationFactor) {
        this.countryName = countryName;
        this.isIndependent = isIndependent;
        this.altiduesA = altiduesA;
        this.altiduesB = altiduesB;
        this.countryPopulation = countryPopulation;
        this.countryCode = countryCode;
        this.countryShortName = countryShortName;
        this.economicalSituationFactor = economicalSituationFactor;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", isIndependent=" + isIndependent +
                ", altiduesA=" + altiduesA +
                ", altiduesB=" + altiduesB +
                ", countryPopulation=" + countryPopulation +
                ", countryCode=" + countryCode +
                ", countryShortName=" + countryShortName +
                ", economicalSituationFactor=" + economicalSituationFactor +
                '}';
    }
}
