package com.reversearraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>(); 
		
		arrayList.add("Gopi");
		arrayList.add("Prabha");
		arrayList.add("Sunil");
		arrayList.add("Arun");
		arrayList.add("Elango");
		
		System.out.println("Array List : " + arrayList);
//		for (String a : arrayList) {
//			System.out.println(a);
//		}
		
		Collections.reverse(arrayList);
		System.out.println("\nReverse Arraylist : " + arrayList);
	}

}
