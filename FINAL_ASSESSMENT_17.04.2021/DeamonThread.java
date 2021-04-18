package com.deamonthread;

public class DeamonThread extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " Daemon thread executing");
		} else {
			System.out.println(getName() + " normal thread executing");
		}
	}

	public static void main(String[] args) {
		DeamonThread t1 = new DeamonThread();
		DeamonThread t2 = new DeamonThread();

		t1.setDaemon(true);
		t1.start();
		t2.start();
	}
}
