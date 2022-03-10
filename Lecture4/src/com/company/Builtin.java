package com.company;

import java.util.Scanner;

public class Builtin {

    public static void main(String[] args) {
        //next int
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        System.out.println("The input number is "+ number);



        //String example

        String exampleText = new String ( "Example text");

        /*
        Define a string. For example - "Example String"
        Check length of a string. And print it on the console.
        Print all of the symbols one by one on different lines.
         */

        System.out.println("Example of chartAr: " + exampleText.charAt(5));
        System.out.println("Example of length: "+ exampleText.length());



        //Math Example

        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);


        Math.sqrt(100);



        // test
        // 0123
        String testString= new String("test");
        System.out.println(testString.indexOf('t'));
        System.out.println(testString.indexOf('t',2));



    }
}
