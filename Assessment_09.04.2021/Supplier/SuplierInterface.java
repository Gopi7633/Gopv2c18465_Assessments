package com.supplierInterface;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> empid1 = () -> {
			String otp = "";
			for(int i=0; i<6; i++) {
				otp += (int)(Math.random()*10);
			}
			return otp;
		};
		
		//System.out.println(empid1.get());
		System.out.println("Employee Id 1 : " + empid1.get());
		System.out.println("Employee Id 2 : " + empid1.get());
		System.out.println("Employee Id 3 : " + empid1.get());
		System.out.println("Employee Id 4 : " + empid1.get());
		System.out.println("Employee Id 5 : " + empid1.get());
	}

}
