package com.company.javaFundamentals.lesson5_1001.teamWork2;

public class Product {

    String productName;
    int productQuantity;
    double unitPrice;

    public Product() {
    }

    public Product(String productName, int productQuantity, double unitPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.unitPrice = unitPrice;

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

