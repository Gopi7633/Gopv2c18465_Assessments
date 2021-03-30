package Assessment.Typecating;

public class Widening {
    public static void main(String[] args) {
        int i = 16;
        long l = i;
        double d = l;

        System.out.println("int value " +i);
        System.out.println("After conversion, long value " +l);
        System.out.println("After conversion, float value " +d);
    }
}
