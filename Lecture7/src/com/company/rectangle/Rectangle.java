package com.company.rectangle;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        setA(a);
        setB(b);
    }

    public Rectangle() {

    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        if(a > 0) {
            this.a = a;
        } else {
            System.out.println("Wrong Argument. Will use the old value " + this.a );
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int area(){
        return a*b;
    }

    public int perimeter(){
        return 2*a+2*b;
    }
}
