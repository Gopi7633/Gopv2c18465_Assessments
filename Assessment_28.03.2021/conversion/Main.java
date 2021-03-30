package Assessment.Typecating;

public class Conversion {
    public static void main(String args[]){
        //String to int Using Integer.parseInt()
        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println(i);
        //String to int Using Integer.valueOf()
        String y = "200";
        Integer j = Integer.valueOf(y);
        System.out.println(j);

        //Int to String
        int a = 200;
        String b=String.valueOf(a);
        System.out.println(a);
        System.out.println(b);

        int c = 200;
        String d = Integer.toString(c);
        System.out.println(c);
        System.out.println(d);

        //String to long
        String e = "129377490";
        long f = Long.parseLong(e);
        System.out.println(f);

        //long to String
        long g = 2534559399L;
        String h = String.valueOf(g);
        System.out.println(h);

        long k = 154257399L;
        String l = Long.toString(k);
        System.out.println(l);
    }
}
