package Add.com;

 class Add{
    public int test1(int a, int b){
        return a+b;
    }
    public int test2(int a, int b, int c){
        return (a+b)-c;
    }
    public int test3(int a, int b, int c, int d){
        return (a*b)+(c*d);
    }
}

public class Addition {
    public static void main(String[] args) {
        Add obj = new Add();
        int y = obj.test1(10,20);
        System.out.println("Test1 : " + y);

        int z = obj.test2(100,50,100);
        System.out.println("Test1 : " + z);

        int x = obj.test3(10,10,5,5);
        System.out.println("Test3 : " + x);
    }

 }
