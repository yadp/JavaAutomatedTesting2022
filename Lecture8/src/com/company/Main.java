package com.company;

import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog rex=new Dog("Rex",5,"ExampleBreed");

        rex.setName("Rex");

        System.out.println(rex.getName());
        System.out.println(rex.makeSound());

        Cat cat= new Cat();
        cat.setName("Foxy");
        System.out.println(cat.getName());
        System.out.println(cat.makeSound());
        cat.drink();

        System.out.println(rex.toString());



        System.out.println(rex.walk(10));
        System.out.println(rex.walk());

        Animal newAnimal = new Animal("Name",5,"Breed");
        System.out.println(newAnimal.toString());
    }
}
