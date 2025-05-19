class Main{
	public static void main(String args[])
	{
		Sup sup; // reference check
		sup = new Sub(); // object initialize at runtime by jvm
		sup.calM1();
		sup.calM2();
		sup.calM3();
		
		
	}
}
class Sub extends Sup{
	void calM1()
	{
		System.out.println("hi i am sub");
	}
	void calM2()
	{
		System.out.println("hi i am sub");
	}
	void calM3()
	{
		System.out.println("hi i am sub");
	}
	void calM4()
	{
		System.out.println("hi i am sub");
	}
}
class Sup{
	void calM1()
	{
		System.out.println("hi i am sup");
	}
	void calM2()
	{
		System.out.println("hi i am sup");
	}
	void calM3()
	{
		System.out.println("hi i am sup");
	}
	void calM4()
	{
		System.out.println("hi i am sup");
	}
	
}
	