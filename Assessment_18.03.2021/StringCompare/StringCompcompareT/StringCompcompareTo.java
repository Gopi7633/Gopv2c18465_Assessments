public class StringCompcompareTo {
    public static void main(String args[])
    {
        String s1 = new String("Gopi");
        String s2 = new String("Ganapathi");
        String s3 = new String("Srini");
        String s4 = new String("Gopi");
        String s5 = new String("Srini");

        System.out.println("Comparing " + s1 + " and " + s2
                + " : " + s1.compareTo(s2));

        System.out.println("Comparing " + s3 + " and " + s4
                + " : " + s3.compareTo(s4));

        System.out.println("Comparing " + s4 + " and " + s5
                + " : " + s4.compareTo(s5));

        System.out.println("Comparing " + s1 + " and " + s4
                + " : " + s1.compareTo(s4));
    }
}
