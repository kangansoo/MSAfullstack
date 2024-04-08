package com.kosa.classdiagramhw;

import java.util.List;
import java.util.ArrayList;

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Company {
    private String companyName;
    private List<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees of " + companyName + ":");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId() + ", Name: " + employee.getName());
        }
    }
}

// 메인 클래스
public class Aggregation {
    public static void main(String[] args) {
        Company company = new Company("횬다이 모터스");

        Employee employee1 = new Employee("김현대", 101);
        Employee employee2 = new Employee("김기아", 102);
        company.addEmployee(employee1);
        company.addEmployee(employee2);

        company.displayEmployees();
    }
}

