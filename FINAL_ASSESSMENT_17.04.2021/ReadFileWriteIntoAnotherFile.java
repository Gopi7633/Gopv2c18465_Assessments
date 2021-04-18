package com.readonewriteanotherfile;

import java.io.File;
import java.io.IOException;

public class ReadFileWriteIntoAnotherFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      File myObj = new File("D:\\Eclipse-New Work space\\Final Assessment1\\src\\com\\readonewriteanotherfile\\filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }

		      File myObj1 = new File("D:\\Eclipse-New Work space\\Final Assessment1\\src\\com\\readonewriteanotherfile\\namefile.txt");
		      if (myObj1.createNewFile()) {
					System.out.println("File created: " + myObj1.getName());
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
