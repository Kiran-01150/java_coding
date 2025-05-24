//Abstract 
class Child extends Sample 
{
	Child()
	{
		System.out.println("child cont");
	}
	public void m2()
	{
		System.out.println("hello all");
	}
	public static void main(String args[])
	{
		Child child = new Child();
		child.m1();
		child.m2();
	}
}

abstract class Sample{
	Sample()
	{
		System.out.println("Sample");
	}
	public void m2()
	{
		System.out.println("Sample-M2");
	}
}