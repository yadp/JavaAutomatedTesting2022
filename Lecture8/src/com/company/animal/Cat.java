package com.company.animal;

public class Cat extends Animal{

    public Cat(){

    }


    @Override
    public String makeSound() {
        return "Meow";
    }

    public String drink(){
        return "Milk";
    }
}
