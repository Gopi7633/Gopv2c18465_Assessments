//enum OUTside the class
//enum Days { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

class Main{
    //defining the enum inside the class
    enum Days { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

    public static void main(String[] args) {

    //traversing the enum
        for (Days s : Days.values())
            System.out.println(s);

        System.out.println("Index of Friday is " +Days.valueOf("FRIDAY").ordinal());
        System.out.println("Index of Friday is " +Days.valueOf("SATURDAY").ordinal());
    }
}
