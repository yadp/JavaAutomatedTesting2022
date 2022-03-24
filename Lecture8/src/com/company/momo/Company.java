package com.company.momo;

public class Company {
    private String name;
    private Employee[] employees;

    public Company(int number) {

        employees = new Employee[number];
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
       addEmployee(employee,employees);
    }

    private void addEmployee(Employee employee,Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                arr[i]=employee;
                break;
            }
        }
    }

    public Employee[] employeesFromTeam(String team){
        Employee[] toReturn= new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null && employees[i].getTeam()==team){
                addEmployee(employees[i],toReturn);
            }

        }
        return toReturn;
    }
}
