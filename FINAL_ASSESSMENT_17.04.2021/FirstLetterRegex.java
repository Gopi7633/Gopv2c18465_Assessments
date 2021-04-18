package firstletterusingregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterRegex {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter sample text: ");
      String data = sc.nextLine();
      
      String regex = "\\b[a-zA-Z]";
      
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(data);
      
      System.out.println("First letter of each word Using Regex: ");
      while(matcher.find()) {
         System.out.print(matcher.group()+" ");
      }
   }
}
