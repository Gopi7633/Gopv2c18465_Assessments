import java.sql.SQLOutput;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Gopi";
        String str2 = "Gopi";
        String str3 = "Srini";
        String str4 = "";
        String str5 = null;

        System.out.println(str1.contains("G"));
        System.out.println(str1.contains("g"));

        //contains Method
        if(str1.contains("Gopi")){
            System.out.println("Gopi is there");
        }else {
            System.out.println("String is not there");
        }

        //CompareTo
        System.out.println(str1.compareTo(str2));

        System.out.println(str2.compareTo(str3));

        //String Replace
        System.out.println(str3);
        System.out.println(str3.replace('S', 's'));

        //ReplaceAll
        System.out.println(str3);
        System.out.println(str3.replaceAll("Srini", "Ganapathi"));

        //Empty
        if(str4.isEmpty()){
            System.out.println("The String is Empty");
        }else {
            System.out.println("The String is not empty");
        }
        if(str5.isEmpty()){
            System.out.println("The String is Empty");
        }else {
            System.out.println("The string is not Empty");
        }
    }
}
