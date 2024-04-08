package com.kosa.classdiagram;

//Java program to illustrate
//Concept of Composition

//Importing required classes
import java.io.*;
import java.util.*;

//Class 1
//Department2 class
class Department2 {

 // Attributes of Department2
 public String Department2Name;

 // Constructor of Department2 class
 public Department2(String Department2Name)
 {
     this.Department2Name = Department2Name;
 }

 public String getDepartment2Name()
 {
     return Department2Name;
 }
}

//Class 2
//Company class
class Company {

 // Reference to refer to list of books
 private String companyName;
 private List<Department2> Department2s;

 // Constructor of Company class
 public Company(String companyName)
 {
     this.companyName = companyName;
     this.Department2s = new ArrayList<Department2>();
 }

 // Method
 // to add new Department2 to the Company
 public void addDepartment2(Department2 Department2)
 {
     Department2s.add(Department2);
 }

 public List<Department2> getDepartment2s()
 {
     return new ArrayList<>(Department2s);
 }

 // Method
 // to get total number of Department2s in the Company
 public int getTotalDepartment2s()
 {
     return Department2s.size();
 }
}

//Class 3
//Main class
class CompositionExample {

 // Main driver method
 public static void main(String[] args)
 {
     // Creating a Company object
     Company techCompany = new Company("Tech Corp");

     techCompany.addDepartment2(new Department2("Engineering"));
     techCompany.addDepartment2(new Department2("Operations"));
     techCompany.addDepartment2(new Department2("Human Resources"));
     techCompany.addDepartment2(new Department2("Finance"));

     int d = techCompany.getTotalDepartment2s();
     System.out.println("Total Department2s: " + d);

     System.out.println("Department2 names: ");
     for (Department2 dept : techCompany.getDepartment2s()) {
         System.out.println("- " + dept.getDepartment2Name());
     }
 }
}

