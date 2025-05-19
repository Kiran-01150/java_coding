class Construct
{
	public static void main(String arg[])
	{
		Person p1= new Person();
		System.out.println(p1.value());
	}
}

class Person
{
	int age;
	int height;
	String name,gender,location;
	Person()
	{
		age=24;
		height=5;
		name="abcd";
		gender="Male";
		location="hyderbad";
		
	}
	String value()
	{
		return age+" \n"+height+"\n"+name+"\n" +gender+"\n" +location;
	}
}
