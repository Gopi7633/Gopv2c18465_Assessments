package ExceptionHandling;

public class Main {

    public static void main(String args[])
    {
        try{
            String str = "StringIndexOutOfBoundsException";
            System.out.println(str.length());
            char c = str.charAt(0);
            c = str.charAt(35);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
            e.printStackTrace();
        }
    }
}
