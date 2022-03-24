package com.company.circle;

import java.util.concurrent.ThreadLocalRandom;

public class CircleMain {
    public static void main(String[] args) {

        Circle circle = new Circle(1);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());



        Circle[] circles= new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i]= new Circle(ThreadLocalRandom.
                    current().nextInt(1,11));
        }
        Circle maxRad= new Circle(0);
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Radius is "+ circles[i].getRadius());
            if(circles[i].getRadius()>maxRad.getRadius()){
                maxRad=circles[i];
            }
        }
        System.out.println(maxRad.getArea());
    }
}
