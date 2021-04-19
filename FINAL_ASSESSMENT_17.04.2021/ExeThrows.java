package com.expthrows;

class ExeThrows{  
	   void method1() throws ArithmeticException
	   {  
		throw new ArithmeticException("Error"); 
	   }  
	   
	   void method2() throws ArithmeticException
	   {  
		method1();  
	   }  
	   
	   void method3()
	   {  
		   try{  
			   method2();  
		   }
		   catch(ArithmeticException e){
			   System.out.println("ArithmeticException Exception");
		   }  
	   }  
	   
	   public static void main(String args[])
	   {  
		   ExeThrows obj = new ExeThrows();  
		   obj.method3();  
		   System.out.println("Throws keyword is executed"); 
		}  
	}
