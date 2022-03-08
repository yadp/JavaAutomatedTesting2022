package com.company;

public class Switch {

    public static void main(String[] args) {
        int number=3;
        switch (number){
            case 2:
                System.out.println("Bag grade");
                break;
            case 3:
                System.out.println("Avg");
                break;
            case 6:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Wrong grade");
        }
    }
}
