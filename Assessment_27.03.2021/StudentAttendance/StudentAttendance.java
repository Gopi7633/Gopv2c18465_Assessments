package StudentArray;

import jdk.jshell.Snippet;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> Stu = new ArrayList<Student>();
        Student s1 = new Student(1,"prathap","CSE", Student.Status.PRESENT);
        Student s2 = new Student(2,"prabha","IT", Student.Status.ABSENT);
        Student s3 = new Student(3,"Arun","CSE", Student.Status.ABSENT);
        Student s4 = new Student(4,"Ganapathi","EEE", Student.Status.PRESENT);
        Student s5 = new Student(5,"Srini","EEE", Student.Status.PRESENT);

        Stu.add(s1);
        Stu.add(s2);
        Stu.add(s3);
        Stu.add(s4);
        Stu.add(s5);

        for(Student s : Stu){
            System.out.println("RollNo " + s.rollNo + "\t Name " + s.Name + "\t Department " + s.Department + " \tAttendance Status " + s.status);
        }

    }
}
class Student{
    int rollNo;
    String Name;
    String Department;
    Status status;

    enum Status
    {
        PRESENT,ABSENT
    }

    public Student(int rollNo, String name, String department, Status status) {
        super();
        this.rollNo = rollNo;
        this.Name = name;
        this.Department = department;
        this.status = status;
    }
}

