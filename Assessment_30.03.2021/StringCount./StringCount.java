package Conversion.java;

public class StringCount {
    public static void main(String[] args) {
        String s = "Happy";
        int c = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'p')
                c++;
        }
        System.out.println("HOW MANY TIMES P CONTAINS IN STRING: " + c + " TIMES");

        String a = "MUMMY";
        int d = 0;

        for (int j = 0; j <= a.length() - 1; j++) {
            if (a.charAt(j) == 'M')
                d++;
        }
        System.out.println("HOW MANY TIMES M CONTAINS IN STRING: " + d + " TIMES");
    }
}
