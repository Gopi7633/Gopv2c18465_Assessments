package com.nexthasnextmethod;

import java.util.ArrayList;
import java.util.Iterator;

public class NextHasNextMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); 
		
		 list.add("Jan");  
		 list.add("Feb");    
		 list.add("Mar");    
		 list.add("Apr"); 
		 list.add("May");
		 list.add("june");
		 list.add("July");
		 list.add("Aug");
		 list.add("Sep");
		 
		 Iterator<String> itr = list.iterator();
		 while (itr.hasNext()) {
			System.out.println(itr.next());
			}
	}

}
