package com.company.javaFundamentals.lesson2_0918.classGroup_gameSample.data;

public class Player {

    public String name;         //default null
    public int hp;           //default 0
    public boolean isAlive;     //default false

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
