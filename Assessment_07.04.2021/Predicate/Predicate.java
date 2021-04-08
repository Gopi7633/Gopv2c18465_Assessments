package java8.predicate;
import java.util.ArrayList;
import java.util.List;

class Student {
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}	
}

public class Predicate {
	public static void main(String[] args) {
		List<Student> StuList = new ArrayList<Student>();
		StuList.add(new Student(19, "Gopi", 25));
		StuList.add(new Student(20, "Prathap", 30));
		StuList.add(new Student(8, "Srini", 15));
		StuList.add(new Student(15, "Ganapathi", 19));
		StuList.add(new Student(18, "Shankar", 16));
		
		java.util.function.Predicate<Student> a1 = a -> (a.age >= 18);
		java.util.function.Predicate<Student> a2 = b -> (b.age < 18);

		System.out.println("Students Allowed to watch movie:");
		for (Student s : StuList) {
			if (a1.test(s)) {
				System.out.println("Student Name : " + s.name  + " Student Age : " + s.age);
			}
		}
		
		System.out.println("\nStudents NotAllowed to watch movie:");
		for (Student s : StuList) {
			if (a2.test(s)) {
		System.out.println("Student Name : " + s.name + " Student Age : " + s.age);
			}
		}
		
//		for(Student s : StuList) {
//			if(a1.test(s)) {
//				System.out.println("Student Name : " + s.name + " Student Age : " + s.age);
//				System.out.println("Allowed to watch Movie\n");
//			}
//			else if(a2.test(s)) {
//				System.out.println("Student Name : " + s.name + " Student Age : " + s.age);
//				System.out.println("Not Allowed to watch Movie\n");	
//			}
//		}
		
	}
}
