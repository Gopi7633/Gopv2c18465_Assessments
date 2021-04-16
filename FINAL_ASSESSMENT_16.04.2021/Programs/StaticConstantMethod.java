package com.staticconstantmethod;

class Basic {

    static int id = 2321;

    public static void showInfo() {

        System.out.println("Static method Info");
        System.out.format("The Id is: %d%n", id);
    }
}

public class StaticConstantMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic.showInfo();
	}
}
