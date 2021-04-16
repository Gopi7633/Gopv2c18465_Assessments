public class Overloading {

	public int sum(int x, int y)
	{
		return (x + y);
	}

	public int sum(int x, int y, int z)
	{
		return (x + y + z);
	}

	public double sum(double x, double y)
	{
		return (x + y);
	}

	public static void main(String args[])
	{
		Overloading s = new Overloading();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(20, 30, 50));
		System.out.println(s.sum(100.5, 200.5));
	}
}
