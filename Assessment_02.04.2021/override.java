package Add.com;

class Add{
    public void mul(int a,int b,int c) {
        System.out.println("base mul is: "+a*b*c);
    }
}
class Multi extends Add{
    public void mul(int a,int b,int c) {
        System.out.println("derived mul is: " + a*b*c);
    }
}
public class Override {
    public static void main(String[] args) {
        Add obj1 =new Add();
        obj1.mul(2, 4, 3);

        Multi obj2 =new Multi();
        obj2.mul(4, 5, 6);

    }

}
