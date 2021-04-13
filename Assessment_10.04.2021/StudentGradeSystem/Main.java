package com.marksgradesystem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> markSystem = new ArrayList<Student>();
		
		markSystem.add(new Student(1, "Studet1", 76));
		markSystem.add(new Student(4, "Studet2", 85));
		markSystem.add(new Student(5, "Studet3", 70));
		markSystem.add(new Student(6, "Studet4", 30));
		markSystem.add(new Student(9, "Studet5", 85));
		markSystem.add(new Student(18, "Studet6", 60));
		markSystem.add(new Student(13, "Studet7", 32));
		markSystem.add(new Student(11, "Studet8", 55));
		markSystem.add(new Student(15, "Studet9", 90));
		markSystem.add(new Student(10, "Studet10", 40));
		
		Predicate<Student> a1 = (a) -> (a.marks >= 80);
		Predicate<Student> b1 = (b) -> (b.marks >= 60 && b.marks < 80);
		Predicate<Student> c1 = (c) -> (c.marks >= 50 && c.marks < 60);
		Predicate<Student> d1 = (d) -> (d.marks >= 35 && d.marks < 50);
		Predicate<Student> e1 = (e) -> (e.marks < 35 );
		
		for(Student s : markSystem) {
			if(a1.test(s)) {
				System.out.println("Destinction : " + s.name + "\t" + s.marks);
			}else if (b1.test(s)) {
				System.out.println("First Class : " + s.name + "\t" + s.marks);
			}else if (c1.test(s)) {
				System.out.println("Second class : " + s.name + "\t" + s.marks);
			}else if (d1.test(s)) {
				System.out.println("Third class : " + s.name + "\t" + s.marks);
			}else if (e1.test(s)) {
				System.out.println("students didnot get PassMarks : " + s.name + "\t" + s.marks);
			}
		}
		
//		Predicate<Student> a1 = (a) -> (a.marks >= 80);
//		System.out.println("Destinction Students");
//		for(Student s : markSystem) {
//			if(a1.test(s)) {
//				System.out.println(s.name +"\t"+ s.marks);
//			}
//		}
//		
//		Predicate<Student> b1 = (b) -> (b.marks >= 60 && b.marks < 80);
//		System.out.println("\nFirst Class Students");
//		for(Student s : markSystem) {
//			if(b1.test(s)) {
//				System.out.println(s.name +"\t"+ s.marks);
//			}
//		}
//		
//		Predicate<Student> c1 = (c) -> (c.marks >= 50 && c.marks < 60);
//		System.out.println("\nSecond Class Students");
//		for(Student s : markSystem) {
//			if(c1.test(s)) {
//				System.out.println(s.name +"\t"+ s.marks);
//			}
//		}
//		
//		Predicate<Student> d1 = (d) -> (d.marks >= 35 && d.marks < 50);
//		System.out.println("\nThird Class Students");
//		for(Student s : markSystem) {
//			if(d1.test(s)) {
//				System.out.println(s.name +"\t"+ s.marks);
//			}
//		}
//		
//		Predicate<Student> e1 = (e) -> (e.marks < 35 );
//		System.out.println("\nStudent did not get PassMarks :");
//		for(Student s : markSystem) {
//			if(e1.test(s)) {
//				System.out.println(s.name);
//			}
//		}
		
	}
}
