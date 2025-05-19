class Con_Chaining
{
	public static void main(String ar[])
	{
		Chain c = new Chain(10);
		
	}
}
class Chain
{
	int num;
	Chain()
	{
		System.out.println("I am default con");
	}
	Chain(String x)
	{
		this();
		System.out.println("I am String parameterized  con");
	}
	Chain(int num)
	{
		this("Kiran");
		this.num=num;
		System.out.println("I am parametrized int con"+num);
	}
}