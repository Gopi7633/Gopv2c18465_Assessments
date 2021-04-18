package com.expthrows;

public class ExeThrows
{
	static void fun()
	{
		try
		{
			throw new NullPointerException("NullPoint Exeception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside fun().");
			throw e;
		}
	}

	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");
		}
	}
}
