package com.company;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month; //1-12
        int day; // 1-31, 1-30 .... 1-28, 1-29
        int year;// All
        System.out.println("Enter your day:");
        day = sc.nextInt();
        System.out.println("Enter your month:");
        month = sc.nextInt();
        System.out.println("Enter your year:");
        year = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if ( day>= 1 && day<=31){
                    System.out.println("Data is ok");
                } else {
                    System.out.println("Date is not ok");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if ( day>= 1 && day<=30){
                    System.out.println("Data is ok");
                } else {
                    System.out.println("Date is not ok");
                }
                break;
            case 2:
                if ( year%4 ==0 && !(year%100 == 0 ^ year%400==0)){
                    if (day>=1 && day <=29){
                        System.out.println("Data is ok");
                    } else {
                        System.out.println("Date is not ok");
                    }
                } else {
                    if (day>=1 && day <=28){
                        System.out.println("Data is ok");
                    } else {
                        System.out.println("Date is not ok");
                    }
                }
                break;
            default:
                System.out.println("Data is invalid");
        }
    }
}
