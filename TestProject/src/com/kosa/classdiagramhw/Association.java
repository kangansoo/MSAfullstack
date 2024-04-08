package com.kosa.classdiagramhw;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
    public String getName() {
    	return name;
    }
}

public class Association {
    public static void main(String[] args) {
        School school = new School("가나다고등학교");

        Student student1 = new Student("가");
        Student student2 = new Student("나");
        Student student3 = new Student("다");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        List<Student> students = school.getStudents();
        for (Student student : students) {
            System.out.println(school.getName()+"에 다니는 " + student.getName());
            
        }
    }
}
