package java8.com;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Gopi",75.7f));
        studentList.add(new Student(2,"Ganapathi",95.2f));
        studentList.add(new Student(3,"Srini",45.7f));

        System.out.println("ArrayList sort by name : ");
        Collections.sort(studentList, (s1,s2) -> {
            return s1.name.compareTo(s2.name);
        });

        // for (Student s : studentList) {
        // System.out.println("RollNo : " + s.rollNo + " Name : " + s.name + " Mark " + s.mark);
        //}
        studentList.forEach((s) -> {
                    System.out.println("RollNo : " + s.rollNo + " Name : " + s.name + " Mark " + s.mark);
        });


        System.out.println("\nArray List sort by Marks :");
        Collections.sort(studentList, (s1,s2) -> {
            return s1.mark.compareTo(s2.mark);
        });

        studentList.forEach((s) -> {
            System.out.println("RollNo : " + s.rollNo + " Name : " + s.name + "Mark " + s.mark);
        });
    }
}

class Student{
    int rollNo;
    String name;
    Float mark;

    public Student(int rollNo, String name, Float mark) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}
