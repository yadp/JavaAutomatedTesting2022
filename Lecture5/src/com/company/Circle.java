package com.company;

public class Circle {
    public static void main(String[] args) {
        double area= area(2);
        System.out.println(area);
    }

    private static double area(double radius) {
        return radius * radius * Math.PI;
    }
}
