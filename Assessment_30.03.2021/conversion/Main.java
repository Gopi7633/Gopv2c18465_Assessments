package Conversion.java;

public class Conversion {
    public static void main(String[] args) {
        //int to double
        int a = 111;
        double b = a;
        System.out.println("After converting int to double Value: " +b);

        //int to double object/valueof Method
        int c = 112;
        Double d = new Double(c);
        Double e = Double.valueOf(c);
        System.out.println("After converting int to double Value: " +d);
        System.out.println("After converting int to double Value: " +e);

        //Double to int
        double f = 113.5;
        int g = (int)f;
        System.out.println("After converting Double to int value: " +g);

        Double h=new Double(114.5);
        int i = h.intValue();
        System.out.println("After converting Double to int value: " +i);

        //Boolean to String
        boolean a1 = true;
        boolean a2 = false;

        String b1 = String.valueOf(a1);
        String b2 = String.valueOf(a2);
        System.out.println("Boolean to String: " +b1);
        System.out.println("Boolean to String: " +b2);

        String c1 = Boolean.toString(a1);
        String c2 = Boolean.toString(a2);
        System.out.println("Boolean to String: " +a1);
        System.out.println("Boolean to String: " +a2);

        //Long to int
        //  Long j = 78799868764428;
       // int k = (int) j;
       // System.out.println(k);

        Long l = new Long(10);
        int j = l.intValue();
        System.out.println("Long to int: " +j);

    }
}
