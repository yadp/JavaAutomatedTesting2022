package com.company.geometry;

public class Rectangle extends GeometryFigure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a+b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
