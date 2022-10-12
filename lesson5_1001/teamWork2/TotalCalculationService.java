package com.company.javaFundamentals.lesson5_1001.teamWork2;

public class TotalCalculationService {

    double calculateTotal(Product product) {

        return product.productQuantity * product.unitPrice * 1.15;

    }
}

