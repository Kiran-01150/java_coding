class Main{
	public static void main(String ara[])
	{
		byte a=9;
		byte b=101;
		Main main = new Main();
		System.out.println(main.m1(a));
		
	}
	String m1()
	{
		return "123";
	}
	float m1(float x)
	{
		System.out.println("i am float");
		return 123+x;
	}

	double m1(int x)
	{	System.out.println("i am double");
		return 123+x;
	}
	
	double m1(int x, int y)
	{
		return 50+x+y;
	}
}