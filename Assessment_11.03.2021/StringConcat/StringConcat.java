public class Concat {  
    public static void main(String[] args) {      
        String str1 = "Hi";  
        String str2 = "Hello";  
        String str3 = "Everyone"; 
 
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  

        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);  
    }  
}
