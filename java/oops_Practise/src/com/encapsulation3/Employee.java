package com.encapsulation3;

public class Employee {
    private String name;
    private int age;
    private int salary;

     Employee(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void  getEmployeeDetails(){;
        System.out.printf("Name: %s \nAge: %d \nsalary: %d \n",name,age,salary);
    }
    public void setEmployeeDetails(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}
