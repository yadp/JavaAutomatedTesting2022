package com.company.momo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee Tom = new Employee("Tom","Google");
        Employee Bob = new Employee("Bob", "Facebook");

        Company momo= new Company(5);
        momo.setName("Momo");
        momo.addEmployee(Tom);
        momo.addEmployee(Bob);

        System.out.println(
                Arrays.toString(
                        momo.getEmployees()));

        System.out.println(
                Arrays.toString(
                        momo.employeesFromTeam("Facebook")));
    }
}
