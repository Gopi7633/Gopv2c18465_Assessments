package com.mapforeach;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> days = new HashMap<>();
		
		days.put(11, "monday");
		days.put(22, "thuesday");
		days.put(33, "wednesday");
		days.put(44, "thursday");
		days.put(55, "friday");
		
		days.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v));
	}

}
