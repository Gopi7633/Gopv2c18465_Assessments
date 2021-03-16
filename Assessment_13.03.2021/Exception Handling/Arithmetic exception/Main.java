package FileHandling;

public class Main {
    public static void main(String args[])
    {
        try{
            int a=30, b=0;
            int output = a/b;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("You Shouldn't divide a number by zero");
            e.printStackTrace();
        }
    }
}
/*
You Shouldn't divide a number by zero
java.lang.ArithmeticException: / by zero
	at FileHandling.Main.main(Main.java:8)
*/
