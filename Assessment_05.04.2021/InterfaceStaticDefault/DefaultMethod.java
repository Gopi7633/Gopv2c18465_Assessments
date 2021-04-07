package Method.StaticAndDefault.com;
interface Interface1
{
	default void show()
	{
		System.out.println("Interface1 is called");
	}
}
interface Interface2
{
	default void show()
	{
		System.out.println("Interface2 is called");
	}
}
public class DefaultMethod implements Interface1,Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod obj = new DefaultMethod();
		obj.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
		Interface2.super.show();
	}

}

