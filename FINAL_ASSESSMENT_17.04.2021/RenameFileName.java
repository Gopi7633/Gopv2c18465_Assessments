package com.renamefile;

import java.io.File;
import java.io.IOException;

public class RenameFileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      File myObj = new File("D:\\Eclipse-New Work space\\Final Assessment1\\src\\com\\renamefile\\filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      
		      File myObj1 = new File("D:\\Eclipse-New Work space\\Final Assessment1\\src\\com\\renamefile\\namefile.txt");
		      if (myObj.renameTo(myObj1)) {
					System.out.println("File is Renamed: " + myObj1.getName());
				}
		      else {
		    	  System.out.println("Error");
		      }
		      }
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
