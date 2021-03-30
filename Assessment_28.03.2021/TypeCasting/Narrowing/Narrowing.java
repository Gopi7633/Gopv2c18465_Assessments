package Assessment.Typecating;

public class Narrowing {
    public static void main(String args[])
    {
        double d = 199.99;
        long l = (long)d;
        int i = (int)l;

        System.out.println("Before conversion: " +d);
        System.out.println("After conversion into long type: " +l);
        System.out.println("After conversion into int type: " +i);

    }
}
