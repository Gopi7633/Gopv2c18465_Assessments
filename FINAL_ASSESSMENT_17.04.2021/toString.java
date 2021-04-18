package com.tostring;

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + "\t" + name; 
	}
}

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer n = 10;
//        System.out.println(n.toString() );
        
		Student s = new Student(1, "Srini");
		Student s1 = new Student(10, "Mani");
		System.out.println(s);
		System.out.println(s1);
		
		
	}

}
