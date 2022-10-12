package com.company.javaFundamentals.lesson7_1008.recap.example3;

import com.company.javaFundamentals.lesson4_0925.homework.calculator.methodsReturnType.Teacher;

public class Trainer {

    public String name;
    public String subject;

    public Trainer() {
    }

    public Trainer(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void introduction() {
        System.out.println("Hello mine name is " + name + ", I trainer on: " + subject);
    }

    public void callStudent(Student student) {
        System.out.println("Hello " + student.name + " you got evaluation: " + student.level);
        student.sayHi(this);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
