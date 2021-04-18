package com.commanarrayusinghashsets;

import java.util.Arrays;
import java.util.HashSet;

class HashSetCommanArray {
	
	public static void FindCommonElements(int[] array1,int[] array2)
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();

		for (int i : array1) {
			set1.add(i);
		}
		for (int i : array2) {
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println("Common elements in Both Array : " + set1);
	}
	
	public static void main(String[] args)
	{
		int[] array1 = { 10, 36, 98, 88, 250, 16, 4, 786, 811, 92 };
		int[] array2 = { 36, 260, 10, 7, 811, 98, 12, 65, 68, 11 };

		System.out.println("Display Array 1 : " + Arrays.toString(array1));
		System.out.println("Display Array 2 : " + Arrays.toString(array2));
		
		FindCommonElements(array1, array2);
	}
}
