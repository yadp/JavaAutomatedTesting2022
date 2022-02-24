package com.company;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        int number2;
        System.out.println("Enter any number:");
        number = scan.nextInt();

        System.out.println("Enter any number:");
        number2 = scan.nextInt();

        scan.close();
        System.out.println(number);
    }
}
