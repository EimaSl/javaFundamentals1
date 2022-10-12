package com.company.javaFundamentals.lesson7_1008.recap.example3;

import com.company.javaFundamentals.lesson4_0925.homework.calculator.methodsReturnType.Teacher;

public class Student {

    public String name;
    public int level;

    public Student() {
    }

    public Student(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void sayHi(Trainer trainer){
        System.out.println("Hello " + trainer.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
