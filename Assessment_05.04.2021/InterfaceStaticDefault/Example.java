package Method.StaticAndDefault1.com;

interface InterfaceA{
	default void Addition(int a, int b) {
		System.out.println("Addition Operation in Default method : " + (a+b));
	}
	public void square(int a);
}

interface InterfaceB{
	static void Multiplication(int a, int b) {
		System.out.println("Multiplication Operation in Static method : " + (a*b));
	}
	public void add(int a,int b);
}
public class Example implements InterfaceA,InterfaceB {
	
	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println("Square root Value : " + (a*a));
	}
	
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition Value : " + (a+b));
	}
	
	public static void main(String[] args) {
		Example obj = new Example();
		obj.Addition(100, 100);
		obj.square(5);
		InterfaceB.Multiplication(10, 10);	
		obj.add(10, 25);
	}

}
