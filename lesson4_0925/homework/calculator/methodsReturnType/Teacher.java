package com.company.javaFundamentals.lesson4_0925.homework.calculator.methodsReturnType;

public class Teacher {

    public String name;
    public String knowledgeField;
    public boolean isTired = true; // priskiriam pradine reiksme objektui
    private String mindset = "Today we learn lots of new things"; // private - tik sioje klaseje

    public void greetStudents(){
        System.out.println("Hello Everyone!!");
    }

    public void sayTodayTopic(String topicName){
        System.out.println("Today we will talk about " + topicName);
    }

    public void drinkSomeCoffee(){
        System.out.println("Drinking coffee ...");
        isTired = false;
        thinkAboutSomething();
    }

    //vietoj void nurodome grazinomu duomenu tipa
    public int getTeacherFavouriteNumber(){
        System.out.println("-------------------------------------");
        return 24;
    }

    private void thinkAboutSomething() {
        System.out.println();
        System.out.print("Think about: ");
        System.out.println(mindset); // galiu pasiekti private lauka tik sitoje klaseje
    }

}
