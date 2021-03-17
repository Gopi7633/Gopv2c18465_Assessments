import java.util.*;
class TreeSetExample{

    public static void main(String[] args)
    {
        TreeSet<String> ts
                = new TreeSet<String>();

        ts.add("Gopi");
        ts.add("Ganapathi");
        ts.add("Srini");

        System.out.println("Tree Set is " + ts);

        String check = "Ganapathi";


        System.out.println("Contains " + check
                + " " + ts.contains(check));

        System.out.println("First Value " + ts.first());

        System.out.println("Last Value " + ts.last());

        ts.remove("Srini");
        System.out.println("After removing Srini TreeSet " + ts);

    }
}
