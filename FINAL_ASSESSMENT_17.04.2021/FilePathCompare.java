package com.filepathcomparison;

import java.io.File;
import java.io.IOException;

public class FilePathCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      File myObj1 = new File("D:\\Eclipse-New Work space\\Final Assessment1\\src\\com\\filepathcomparison\\file11.txt");
		      if (myObj1.createNewFile()) {
		        System.out.println("File created: " + myObj1.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      
		      File myObj2 = new File("D:\\Eclipse-New Work space\\Final Assessment1\\src\\com\\file21.txt");
		      if (myObj2.createNewFile()) {
		        System.out.println("File created: " + myObj2.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      
		      File myObj3 = new File("D:\\Eclipse-New Work space\\Final Assessment1\\src\\com\\filepathcomparison\\file11.txt");
//		      if (myObj3.createNewFile()) {
//		        System.out.println("File created: " + myObj3.getName());
//		      } else {
//		        System.out.println("File already exists.");
//		      }
		      
		      if (myObj1.compareTo(myObj2) == 0) 
		      	{
		            System.out.println("paths of file1 and file2 are same");
		      	}
		     else 
		     	{
		            System.out.println("Paths of file1 and file2 are not same");
		     	}
		      
		      if (myObj1.compareTo(myObj3) == 0) 
		      	{
		            System.out.println("paths of file1 and file2 are same");
		      	}
		     else 
		     	{
		            System.out.println("Paths of file1 and file2 are not same");
		     	}
		      }
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
