package com.company;

public class Switch {

    public static void main(String[] args) {
        int number=1;
        switch (number){
            case 5:
                System.out.println(number);
            case 4-6:
                System.out.println(number+1);
                break;
            default:
                System.out.println("Default");
        }
    }
}
