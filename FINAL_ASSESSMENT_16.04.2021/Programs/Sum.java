package com.sumofdigits;

public class Sum {
	public static void main(String[] args) {
		int n = 123;
		System.out.println("The sum of digits : " + getSumofdigits(n));		
	}
	
	static int getSumofdigits(int n) {
		int sum = 0;
		
		for (sum = 0; n > 0; sum += n % 10, n /= 10);
		
//		while (n != 0)
//		{
//			sum = sum + n % 10;
//			n = n/10;
//		}
	
		return sum;
	}

}


