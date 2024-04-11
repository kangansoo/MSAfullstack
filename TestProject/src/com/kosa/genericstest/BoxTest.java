package com.kosa.genericstest;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {
	
	public static void printPersonList(List<?> list) {
		for (Object obj : list) {
			System.out.println(((Person)obj).getName());
		}
	}
	
	public static void printEmployeeList(List<? extends Employee> list) {
		for (Employee employee : list) {
			System.out.println(employee.getName() +" "+ employee.getSalary()+"원");
		}
	}
	
	public static void printlnEmployeeList(List<? super Employee> list) {
		for (Object obj : list) {
			System.out.println(((Employee)(obj)).getSalary());
		}
	}
	
	public static void printStudentList(List<? super Student> list) {
		for (Object obj : list) {
			System.out.println(((Student)obj).getGrade());
		}
	}
	
	public static void main(String[] args) {
		Box<Person> box = new Box<Person>();
		box.setData(new Person("김안수")); 
		System.out.println(box.getData());

		box.setData(new Employee("강안수", 1000000000)); 
		System.out.println(box.getData());
		
		box.setData(new Student("홍안수", 4));  
		System.out.println(box.getData());

		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("가안수"));
		personList.add(new Person("나안수"));
		personList.add(new Person("다안수"));
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("강안수", 1000000000));
		employeeList.add(new Employee("라안수", 100000));
		employeeList.add(new Employee("마안수", 10000000));
		
		printPersonList(personList); //Person과 그 하위 객체만 출력 가능
		printPersonList(employeeList);
		printEmployeeList(employeeList); //Employee와 그 하위 객체만 출력 가능
		
		printlnEmployeeList(personList); //Employee와 그 상위 객체만 출력 가능
		printlnEmployeeList(employeeList);
		printStudentList(personList); //Student와 그 상위 객체만 출력 가능
		
	}
}
