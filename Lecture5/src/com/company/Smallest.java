package com.company;

public class Smallest {

    public static void main(String[] args) {
        int small= smallest(-1,1,0);
        System.out.println("Smallest is "+ small);
    }

    private static int smallest(int a, int b, int c) {
        if(a < b){
            if(a < c){
                return a;
            }
        } else {
            if(b < c){
                return b;
            }
        }
        return c;
    }
}
