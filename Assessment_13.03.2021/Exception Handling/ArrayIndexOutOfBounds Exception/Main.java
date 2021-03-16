package ExceptionHandling;

public class Main {

    public static void main(String[] args)  {
        try{
            int a[]=new int[5];
            a[6] = 60;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds");
            e.printStackTrace();
        }
    }
}

/* java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
	at ExceptionHandling.Main.main(Main.java:8)
ArrayIndexOutOfBounds
*/
