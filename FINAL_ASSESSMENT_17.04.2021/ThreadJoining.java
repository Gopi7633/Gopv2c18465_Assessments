package com.threadjoining;

public class ThreadJoining extends Thread {
	 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
			   Thread.sleep(500);  
		   	}
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }  
		   		System.out.println(i);  
		  	}  
		 } 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadJoining t1 = new ThreadJoining();
		 ThreadJoining t2 = new ThreadJoining(); 
		 t1.start();  
		 try{  
		  t1.join();  
		 }
		 catch(Exception e)
		 {
			System.out.println(e);
		 }  
		  t2.start();
		  }
}
