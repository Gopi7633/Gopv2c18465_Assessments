package com.removegivenchar;

public class RemoveGivenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GopiT";  
        System.out.println(charRemoveAt(str, 4));  
     }  
     static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  
}
