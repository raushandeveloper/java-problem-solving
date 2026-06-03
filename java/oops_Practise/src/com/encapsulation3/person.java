package com.encapsulation3;

public class person {
    static void main() {
        Employee employee = new Employee("Ayush",19,150000);
        employee.getEmployeeDetails();
        employee.setEmployeeDetails("Suraj",21,4782);
        employee.getEmployeeDetails();

    }
}
