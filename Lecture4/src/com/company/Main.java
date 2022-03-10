package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a=5;
        int b=3;

        System.out.println("Simple sum: "+ (a+b));

        int c = sum(a,b);
        System.out.println("Sum with method: "+c);

        System.out.println("A-B= "+ subtract(a,b));
        System.out.println("A*B= "+ multi(a,b));
        System.out.println("A/B= "+ divide(a,b));
        System.out.println("A/B= "+ divide(c,b));
        System.out.println("A/B= "+ divide(a+b,b));
        System.out.println("A/B= "+ divide(15,5));

    }








    public static int sum(int number1, int number2){

        int result=number1+number2;

        return result;

    }
    public static int divide(int number1, int number2){

        int result=number1/number2;

        return result;

    }
    public static int multi(int number1, int number2){

        int result=number1*number2;

        return result;

    }
    public static int subtract(int number1, int number2){

        int result=number1-number2;

        return result;

    }
}
