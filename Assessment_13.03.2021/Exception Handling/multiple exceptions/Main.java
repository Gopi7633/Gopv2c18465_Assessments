package ExceptionHandling;

public class Main {

    public static void main(String[] args) {

        try{
            int a[]=new int[5];

            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
            e.printStackTrace();
        }
    }
}
