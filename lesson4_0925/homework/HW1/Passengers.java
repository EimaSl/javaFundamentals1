package com.company.javaFundamentals.lesson4_0925.homework.HW1;

public class Passengers {

    char gender;
    int age;
    public BusStops busStops;

    public int numberOfPassengers(int passengers,BusStops busStops) {
        int sum = 0;
        if (passengers > 0) {
            sum+=passengers;
        } else if (passengers < 0) {
            sum-=passengers;
        }
        return sum;
    }

}
