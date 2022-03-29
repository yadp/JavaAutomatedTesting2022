package com.company.person;

import java.util.Arrays;

public class Student extends Person{

    private String[] classes;


    public Student(double height, String name, int age, String[] classes) {
        super(height, name, age);
        this.classes= classes;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classes=" + Arrays.toString(classes) +
                '}';
    }
}
