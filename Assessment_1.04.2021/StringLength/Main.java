package lambdaExpression.com;

public class StringLength {
    public static void main(String args[])
    {
        Length a = (s)->
        {
            int len=s.length();
            System.out.println("Length of the String is: " + s.length());
        };
        a.length("GopiT");
    }
}

interface Length
{
   public void length(String s);
}
