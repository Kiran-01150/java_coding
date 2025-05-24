class Methods {

	static int num;
	static {
		
		num = 444;
		System.out.println(num+" iam static block");
	}
	{
		System.out.println("non-Static block");
	}
	Methods()
	{
		 num=29;
	}
	public static void main(String args[])
	{
		
		//System.out.println("\n"+Method2.y);
		Method2 m2 = new Method2();
		m2.calM1();
		
		
	}

}
class Method2 {
	//static int y=10;
	void calM1()
	{
		int x =100;
	}
}