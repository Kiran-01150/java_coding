class Methods{
	public static void main(String args[])
	{
		Con c1 = new Con();
		c1.calM1();
		
		//System.out.println("hello");
	}
	

class Con
{
	String loation ;
	String company_name;
	Con()
	{
		lacation="Hyderabad";
		company_name = "infosys";
	}
	void calM1()
	{
		System.out.println(location+"\n"+company_name);
	}
}
}