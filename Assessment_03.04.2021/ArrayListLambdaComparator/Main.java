import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
public class Main {
	public static void main(String[] args) {
	ArrayList<Employee> EmpList = new ArrayList<>();
	EmpList.add(new Employee(10,"Ganapathi",23));
    EmpList.add(new Employee(14,"Prathap",13));
    EmpList.add(new Employee(45,"Srini",24));
    EmpList.add(new Employee(11,"Maini",29));
    
    for(Employee z : EmpList)
 	   System.out.println("Emp Id : " + z.id  + " Emp Name : " 
    + z.name +  "Emp Age:" + z.age);
    
    //Employee Age Comparator Using Lambda 
    System.out.println("\nEmployees based on theie Age");
    Comparator<Employee> e1 = (a1,a2)->{
 	   return (a1.age == a2.age)?0:(a1.age > a2.age)?1:-1;
    };
   Collections.sort(EmpList , e1);
   for(Employee e : EmpList)
 	   System.out.println("Emp Id : " + e.id  
 			   + " Emp Name : " + e.name +  "Emp Age:" + e.age);
   
 //Employee Name Comparator Using Lambda 
   System.out.println("\nEmployees based on theie Name");
   Comparator<Employee> e2 = (b1,b2)->{
	   return (b1.name.compareTo(b2.name));
   };
   Collections.sort(EmpList , e2);
   for(Employee f : EmpList)
 	   System.out.println("Emp Id : " + f.id  + " Emp Name : " 
   + f.name +  "Emp Age:" + f.age);
   
 //Employee Id Comparator Using Lambda 
   System.out.println("\nEmployees based on theie Age");
   Comparator<Employee> e3 = (c1,c2)->{
	   return (c1.age == c2.age)?0:(c1.age > c2.age)?1:-1;
   };
  Collections.sort(EmpList , e3);
  for(Employee g : EmpList)
	   System.out.println("Emp Id : " + g.id  
			   + " Emp Name : " + g.name +  "Emp Age:" + g.age);
    
}
}
