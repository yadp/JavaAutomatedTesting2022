package com.company.animal;

public class Cat extends Mammal {

    public Cat(){

    }


    public String drink(){
        return "Milk";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String walk(int distance) {
        return "";
    }
}
