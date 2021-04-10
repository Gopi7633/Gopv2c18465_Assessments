package com.consumerInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> names = a -> System.out.println(a);
		names.accept("Hi...");
		names.accept("How are You");
		// System.out.println(names.accept("blue"));

		
		  Consumer<Integer> myValue = b -> System.out.println(b);
		  myValue.accept(100);
		 
	}

}
