package com.interrupt;

class MyClass extends Thread {
	public void run()
	{
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread executing");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("InterruptedException occur");
		}
	}
}

class Main {
	public static void main(String[] args)
			throws InterruptedException
	{
		MyClass thread = new MyClass();
		thread.start();
		thread.interrupt();
		System.out.println("Main thread execution completes");
	}
}
