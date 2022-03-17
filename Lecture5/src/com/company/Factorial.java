package com.company;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        long factorial = factorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static long factorial(int num)
    {
        if (num >= 1) {
            long facNumber = factorial(num - 1);
            System.out.println("Our number is "+ num);
            System.out.println("Factorial of num-1 is: " + facNumber);
            return num * facNumber;
        }
        else {
            return 1;
        }
    }
}
