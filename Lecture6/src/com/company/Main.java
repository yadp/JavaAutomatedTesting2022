package com.company;


import com.company.zoo.Monkey;
import com.company.zoo.Wolf;

public class Main {

    public static void main(String[] args) {


        Monkey monkey1= new Monkey();

        Wolf wolf1= new Wolf();
        com.company.forest.Wolf wolf2= new com.company.forest.Wolf();
	// write your code here
        String text = new String("Test String");

        int a = 5;
        float b = 5.0f;
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.age= 5;
        System.out.println(rex.name+ " is  "+ rex.age+ " years old");
        Guitar exampleG= new Guitar();


        System.out.println(text.charAt(4));
        System.out.println(rex.bark());
        System.out.println(exampleG.play());

        System.out.println(rex.running());

        int[] arr={5,2,3,4};
        System.out.println(findMin(arr));
    }


    public static int findMin(int[] arr){
        int min=10000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
