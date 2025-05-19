class Main{	
	public static void main (String args[])
	{
		Sub_Class sb= new  Sub_Class();
		sb.calM1();
		sb.calM1();
		sb.calM1();

		System.out.println("hello");
	}

} 
class Sub_Class extends Super_Class{
	
	void calM1()
	{
		System.out.println("Hello all im sub");
	}
	void calM2()
	{
		System.out.println("Hello all im sub ");
	}
	void calM5()
	{
		System.out.println("Hello all im sub ");
	}
	void calM3()
	{
		System.out.println("Hello all im sub ");
	}
	void calM4()
	{
		System.out.println("Hello all im sub ");
	}
}
class Super_Class{
	void calM8()
	{
		System.out.println("Hello all im super");
	}
	void calM2()
	{
		System.out.println("Hello all im super");
	}
	void calM5()
	{
		System.out.println("Hello all im super");
	}
	void calM3()
	{
		System.out.println("Hello all im super");
	}
	void calM9()
	{
		System.out.println("Hello all im super");
	}
}
