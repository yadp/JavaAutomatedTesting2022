package com.company;

import java.util.concurrent.ThreadLocalRandom;

// This is my Main class
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello Yavor");
        int number = 4;
        int secondNumber = 5;
        System.out.println(number + secondNumber);
        System.out.println(number - secondNumber);
        System.out.println(number * secondNumber);
        System.out.println(number / secondNumber);
        System.out.println(number % secondNumber);
        // !true= false
        if(number!=secondNumber){
            System.out.println("That is true");
        }

        int randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        System.out.println("Random Number: "+ randomNum);

        double a=3.5;
        double b=2.0;

        a = a+1;
        System.out.println("A: "+ ++a);

        System.out.println("A: "+ a);
        a--;
        System.out.println("A: "+ a);

        System.out.println(a/b);


        a = a+b;
        a += b;


        System.out.println("Number "+ number);
        System.out.println("Second Number "+ secondNumber);


        secondNumber = number;

        System.out.println("Number "+ number);
        System.out.println("Second Number "+ secondNumber);

        float price = 2.5F;
        double priceSecond= 2.7;
        boolean var = false;

        String name;
        name = "Yavor";

        System.out.println(price);
        System.out.println(priceSecond);

        System.out.println(name);
        //Something has changed

        name = "Test";
        System.out.println(name);



    }
}
