package com.company.rectangle;

public class RecMain {



    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(4,5);

        rectangle.setA(-1);
        System.out.println(rectangle.area());
        rectangle2.setA(-1);


        System.out.println(rectangle2.area());






       /* RectangleNotOOP rectangleNotOOP= new RectangleNotOOP();
        System.out.println(rectangleNotOOP.area(4,5));
        System.out.println(rectangleNotOOP.area(3,5));

        Rectangle rectangle = new Rectangle(4,5);
        //rectangle.a = 4;
        //rectangle.b = 5;

        System.out.println(rectangle.area());
        System.out.println(rectangle.area());
        System.out.println(rectangle.area());
        System.out.println(rectangle.area());

           *//*
Create array of rectangles with this examples:
Rectangle 1:  a=5, b=2
Rectangle 2: a=3, b=4
Rectangle 3: a=3, b=3
Print all of the areas of the rectangles.

     *//*

        Rectangle[] rectangles= new Rectangle[3];

        rectangles[0] = new Rectangle(5,2);
        rectangles[1] = new Rectangle(3,4);
        rectangles[2] = new Rectangle(3,3);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Area of rectangle with sides"+
                    " "+ rectangles[i].a+ " "+ rectangles[i].b+ " is "+
                    rectangles[i].area());

        }*/
    }
}
