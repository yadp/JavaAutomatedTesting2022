package com.company;

import java.util.Scanner;

public class NumberInput {

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        number = scan.nextInt();
        System.out.print("Number is:");
        System.out.println(number);
        if ( number >0 ) {
            // number is greater then zero
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
        //only once
        scan.close();
    }
}
