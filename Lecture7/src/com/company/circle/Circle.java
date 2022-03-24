package com.company.circle;

class Circle {
    private double radius;

    /*
    Constructor
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /*
    Get and Set Methods
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0)
        this.radius = radius;
    }

    /*
    The rest of the class
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


}
