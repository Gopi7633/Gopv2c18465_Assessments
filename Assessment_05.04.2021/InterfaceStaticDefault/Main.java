package Method.StaticAndDefault.com;

interface InterfaceA {
	public void add(int a, int b);
}

interface InterfaceB{
	public void sub(int a, int b);
	public void mul(int a,int b);
}

interface InterfaceC{
	public void div(int a, int b);
	public void add1(int a,int b, int c);
	default void Dmethod() {
		System.out.println("Default Method is called");
	}
}

class TestInterface implements InterfaceA,InterfaceB,InterfaceC{

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Divsion : " + (a/b));
	}

	@Override
	public void add1(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("Addition1 : " + (a+b+c));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Subtraction : " + (a-b));
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication : " + (a*b));
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition : " + (a+b));
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface obj = new TestInterface();
		obj.add(15, 25);
		obj.sub(75, 25);
		obj.div(100, 2);
		obj.mul(10, 10);
		obj.Dmethod();
	}

}
