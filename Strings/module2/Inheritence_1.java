class Main{
	public static void main (String ae[])
	{
		int r = 50;
		String s = "rk";
		Sub_Class s1 = new Sub_Class();
		System.out.println(s1.call());
		
	}
}
class Sub_Class1 extends Super_Class
{
	Sub_Class1()
	{
		super();
	}
}
class Super_Class{
	int roll;
	String name;
	Super_Class()
	{
		roll = 20444;
		name = "Kiran";
	}
	String call()
	{
		//this.roll=roll;
		//this.name = name;
		return roll +" "+name;
		
	}
}
		 