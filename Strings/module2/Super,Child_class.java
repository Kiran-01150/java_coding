class Con_Chaining
{
	public static void main(String ar[])
	{
		Sub_Class sub= new Sub_Class();
		sub.cal1(19,"kiran");
				//Chain c = new Chain(10);
		
	}
}

class Sub_Class extends Super_Class
{
	Sub_Class()
	{
		super(int num,String name);
	}
	
}
class Super_Class
{
	int num;
	String name;
	Super_Class()
	{
		num=101;
		name="Kiran";	
	}
	void cal1(int num,String name)
	{
		this.num=num;
		this.name=name;
		System.out.println(num+" "+name);
	}
}