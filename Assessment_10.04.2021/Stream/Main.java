package com.employeeagefilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
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
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
	
		empList.add(new Employee(1, "Employee1", 18));
		empList.add(new Employee(6, "Employee2", 65));
		empList.add(new Employee(8, "Employee1", 55));
		empList.add(new Employee(15, "Employee4", 60));
		empList.add(new Employee(19, "Employee1", 55));
		empList.add(new Employee(19, "Employee5", 54));
		
		List<Integer> empAgeList = empList.stream()
				.filter(a -> a.age > 50).map(a -> a.age).collect(Collectors.toList());
		System.out.println("Employee Age Greater then 50 List : " + empAgeList);
		
		Employee empMaxAge = empList.stream().max((a,b) -> a.age > b.age ? 1 : -1).get();
		System.out.println("Employee Maximum Age : " + empMaxAge.age);
		
		Employee empMinAge = empList.stream().min((a,b) -> a.age > b.age ? 1 : -1).get();
		System.out.println("Employee Minimum Age : " + empMinAge.age);
		
		Set<String> removeDuplicateName = empList.stream()
				.filter(a -> (a.name).equals(a.name))
				.map(a -> a.name).collect(Collectors.toSet());
		System.out.println("Without Dupilcation : " + removeDuplicateName);
		
	}

}
