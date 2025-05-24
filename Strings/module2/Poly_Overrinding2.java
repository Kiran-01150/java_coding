class Main{
	public static void main(String args[])
	{
		Sub sub; // reference check
		sub = new Sub(); // object initialize at runtime by jvm
		sub.calM1();
		sub.calM2();
		sub.calM3();
		sub.calM5();
		sub.calM6();
		
		
	}
}
class Sub extends Sup{
	void calM19()
	{
		System.out.println("hi i am sub_m19");
	}
	void calM2()
	{
		System.out.println("hi i am sub_m2");
	}
	void calM3()
	{
		System.out.println("hi i am sub_m3");
	}
	void calM7()
	{
		System.out.println("hi i am sub_m7");
	}
}
class Sup{
	void calM1()
	{
		System.out.println("hi i am sup_1");
	}
	void calM3()
	{
		System.out.println("hi i am sup_m3");
	}
	void calM5()
	{
		System.out.println("hi i am sup_m5");
	}
	void calM6()
	{
		System.out.println("hi i am sup_m6");
	}
	void calM2()
	{
		System.out.println("hi i am sup_m2");
	}

	
}
	