package com.exceptioninthread;

class Thread1 extends Thread{
	   public void run(){
	      System.out.println("Thread is running");
	      throw new RuntimeException();
	   }
	}

public class ExceptionThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t = new Thread1();
		t.start();
		try{
	         Thread.sleep(1000);

	     }
		catch (Exception e) 
		{
	         System.out.println("Exception" + e);
	     }
		System.out.println("Exit Thread Program");
	}

}
