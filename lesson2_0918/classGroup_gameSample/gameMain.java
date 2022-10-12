package com.company.javaFundamentals.lesson2_0918.classGroup_gameSample;

import com.company.javaFundamentals.lesson2_0918.classGroup_gameSample.data.Player;

public class gameMain {

    public static void main(String[] args) {

        //objekto tipo sukurimas => ObjektoTipas ObjektoVardas = Objekto sukurimas.
        Player firstPlayer = new Player();
        firstPlayer.hp = 100;
        firstPlayer.name = "Vitalijus";
        firstPlayer.isAlive = true;

        System.out.println("Player statistics");
        System.out.println("> HP = " + firstPlayer.hp);
        System.out.println("> Name = " + firstPlayer.name);
        System.out.println("> Is alive = " + firstPlayer.isAlive);
        System.out.println("Viso objekto atvaizdavimas: " + firstPlayer);

        System.out.println();

        Player ignas = new Player();
        ignas.hp = 200;
        ignas.name = "Ignas";
        ignas.isAlive = true;

        System.out.println("Player statistics");
        System.out.println("> HP = " + ignas.hp);
        System.out.println("> Name = " + ignas.name);
        System.out.println("> Is alive = " + ignas.isAlive);
        System.out.println("Viso objekto atvaizdavimas: " + ignas);

    }
}
