package com.company.javaFundamentals.lesson4_0925.homework.calculator;

public class Methods {
    public static void main(String[] args) {

        welcome();
        multiply(5, 10);
        devide(100, 20);


    }

    public static void multiply(int a, int b) {
        System.out.println("a+b=" + a * b);
    }

    public static void devide(double a, double b) {
        System.out.println("a/b=" + a / b);
        System.out.println("b/a=" + b / a);
    }

    public static void welcome(){
        System.out.println("Welcome to our calculator");
    }

}
