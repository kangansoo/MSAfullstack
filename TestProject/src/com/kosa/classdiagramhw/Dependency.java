package com.kosa.classdiagramhw;

class StudentDependency {
    private String name;

    public StudentDependency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class SchoolDependency {
    private String name;

    public SchoolDependency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printStudentName(StudentDependency student) {
        System.out.println("학교: " + name + ", 학생 이름: " + student.getName());
    }
}

public class Dependency {
    public static void main(String[] args) {
        StudentDependency student1 = new StudentDependency("가");
        StudentDependency student2 = new StudentDependency("나");
        StudentDependency student3 = new StudentDependency("다");

        SchoolDependency school = new SchoolDependency("가나다고등학교");

        school.printStudentName(student1);
        school.printStudentName(student2);
        school.printStudentName(student3);
    }
}
