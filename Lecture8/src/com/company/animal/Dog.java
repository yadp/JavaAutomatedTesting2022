package com.company.animal;

public class Dog extends Animal{

    public Dog(String name,int age, String breed){
        super(name,age,breed);
    }

    @Override
    public String makeSound() {
        return "Bark";
    }

    //walk methods
    public String walk(){
        return "Walk was 5 km";
    }

    public String walk(int distance){
        return "Walk was "+ distance+ " km";
    }

    public String walk ( String newDistance){
        return newDistance;
    }

    @Override
    public String toString() {
        return " Dog ";
    }
}
