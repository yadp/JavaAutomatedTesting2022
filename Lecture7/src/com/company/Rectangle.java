package com.company;

public class Rectangle {

    int a;
    int b;

    public Rectangle(int inputA,int inputB){
        a=inputA;
        b=inputB;
    }

    public int area(){
        return a*b;
    }

    public int perimeter(){
        return 2*a+2*b;
    }
}
