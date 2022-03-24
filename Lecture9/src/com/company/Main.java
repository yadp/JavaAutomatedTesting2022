package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GeometryFigure figure = new Circle(1);
        System.out.println(figure.getArea());

        int a = 5;
        a = 6;

        figure = new Rectangle(1,2);

        System.out.println(figure.getArea());

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getArea());

        figure.getArea();
        rectangle.getA();

        GeometryFigure[] figures= new GeometryFigure[4];
        figures[0]= new Circle(1);
        figures[1]= new Rectangle(1,1);
        figures[2]= new Rectangle(9,0.1);
        figures[3]= new Square(10);

        double maxArea = findMaxArea(figures);
        System.out.println("Max area is" + maxArea);

    }


    private static double findMaxArea(GeometryFigure[] figures) {
        double maxArea=0;

        for (int i = 0; i < figures.length; i++) {
            if ( figures[i]!= null && maxArea < figures[i].getArea()){
                maxArea = figures[i].getArea();
            }
        }
        return maxArea;
    }
}
