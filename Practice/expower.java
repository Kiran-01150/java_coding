class Student
{
	public static void main(String args[])
	{
		Power power =  new Power();
		int input =123;
		int res1=power.powerNumber(input);
		int res2 = power.prodNumber(input);
		if(res1==res2)
			System.out.println(input +" is a power number "+ res1 +" "+ res2);
		else 
			System.out.println(input +" is not a power number "+res1+" "+res2);
	} 
}
class Power
{

	int powerNumber(int num)
	{	int sum=0;
		while(num!=0)
		{
			int rem =num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
		
	}

	int prodNumber(int num)
	{	int prod=1;
		while(num!=0)
		{
			int rem = num%10;
			prod*=rem;
			num/=10;
			
		}
		return prod;
	}
}