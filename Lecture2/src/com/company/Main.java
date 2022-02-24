package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 6;
        String name = "Yavor";
        String lastName = new String("Petrov");
        System.out.println(lastName.length());

        int randomNumber = ThreadLocalRandom.current().nextInt(-100,101);




        if( 6 == number){
            System.out.println("The number is 6");
        }

        if(lastName.equals("Petkov")){
            System.out.println("Last name is Petkov");
        }

        if(!lastName.equals("Petkov")){
            System.out.println("Last name is different from Petkov");
        }

        if(lastName.equals("Petkov")){
            System.out.println("Last name is Petkov");
        } else {
            System.out.println("Last name is different from Petkov");
        }

        if(lastName.equals("Petkov")){
            System.out.println("Last name is Petkov");
        } else if(lastName.equals("Petrov")) {
            System.out.println("Last name is Petrov");
        } else if(lastName.equals("Todorov")){
            System.out.println("Last name is Todorov");
        } else {
            System.out.println("Unknown last name");
        }



        String result = lastName.equals("Petkov") ? "Last name is Petkov" : "Last name is different from Petkov";
        System.out.println(result);



        if ( name.equals("Yavor") && lastName.equals("Petkov") ){
                System.out.println("Name is Yavor Petkov");
        }



        int inputNumber = -1;

        if ( inputNumber < 0 ) {
            System.out.println("Input number is under 0");
        }

    }

}


