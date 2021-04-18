package com.finallyblock;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = 25 / 5;
			System.out.println(num);
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Number should not be divided by zero");
		} finally 
		{
			System.out.println("This is finally block");
		}

	}
}
