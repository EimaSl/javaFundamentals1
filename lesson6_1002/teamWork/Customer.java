package com.company.javaFundamentals.lesson6_1002.teamWork;

public class Customer {

    String customerName;
    String customerDye;
    String customerHairStyle;
    int customerHairLength;
    boolean makeUp;

    public Customer() {
    }

    public Customer(String customerName, String customerDye, String customerHairStyle,
                    int customerHairLength, boolean makeUp) {
        this.customerName = customerName;
        this.customerDye = customerDye;
        this.customerHairStyle = customerHairStyle;
        this.customerHairLength = customerHairLength;
        this.makeUp = makeUp;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerDye='" + customerDye + '\'' +
                ", customerHairStyle='" + customerHairStyle + '\'' +
                ", customerHairLength=" + customerHairLength +
                ", makeUp=" + makeUp +
                '}';
    }
}
