package com.commanarray;

import java.util.Arrays;
import java.util.HashSet;

public class CommanArray {
	private static void FindCommonElemet(String[] arr1,String[] arr2)
	{
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					set.add(arr1[i]);
					break;
				}
			}
		}
		for (String i : set) {
			System.out.print(i + " ");
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr1 = { "Gopi", "java", "names", "Animals", "Hi" };
        String[] arr2 = { "java", "is", "Program", "Gopi", "names" };
 
        System.out.println("Display Array1 : " + Arrays.toString(arr1));
        System.out.println("Display Array2 : " + Arrays.toString(arr2));
 
        System.out.print("Display Common Elements Both Arrays: ");
        FindCommonElemet(arr1, arr2);
    }
}
