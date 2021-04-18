package com.multiplexception;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
            int a[] = new int[5];   
            a[1] = 15/0;
           }
		catch(ArithmeticException e)  
            {  
               System.out.println("Arithmetic Exception occurs");  
            }    
        catch(ArrayIndexOutOfBoundsException e)  
			{  
               	System.out.println("ArrayIndexOutOfBounds Exception occurs");  
			}    
        catch(Exception e)  
        	{  
            	System.out.println("Other Exception occurs");  
            }  
	}	

}
//a[7] = 20;
//a[1] = (Integer) null;
//System.out.println(a[1]);
