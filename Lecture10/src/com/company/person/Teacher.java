package com.company.person;

public class Teacher extends Person {

    private String teachingClass;

    public Teacher(double height, String name, int age, String teachingClass) {
        super(height, name, age);
        this.teachingClass= teachingClass;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teachingClass='" + teachingClass + '\'' +
                '}';
    }
}
