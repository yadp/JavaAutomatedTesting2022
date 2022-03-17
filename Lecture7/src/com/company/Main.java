package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RectangleNotOOP rectangleNotOOP= new RectangleNotOOP();
        System.out.println(rectangleNotOOP.area(4,5));
        System.out.println(rectangleNotOOP.area(3,5));

        Rectangle rectangle = new Rectangle(4,5);
        //rectangle.a = 4;
        //rectangle.b = 5;

        System.out.println(rectangle.area());
        System.out.println(rectangle.area());
        System.out.println(rectangle.area());
        System.out.println(rectangle.area());
    }
}
