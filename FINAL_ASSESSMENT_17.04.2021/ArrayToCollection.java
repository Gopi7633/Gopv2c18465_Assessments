package com.arraytocollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayToCollection {
	
	public static void main(String[] args)
    {
        int[] arr = { 11, 22, 33, 44, 55 };
 
        List<Integer> list = new ArrayList<>(arr.length);
 
        for (int i: arr) {
            list.add(Integer.valueOf(i));
        }
 
        System.out.println(list);
    }

}
