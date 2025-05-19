//exevil.java
class Student 
{
	public static void main(String args[])
	{
		Evil evil = new Evil ();
		int input = 45;
		int res=evil.evilNumber(input);
		if(res==input)
			System.out.println(input +" is a evil number "+res);
		else 
			System.out.println(input + " is not a evil number "+res);
	

	}
}
class Evil
{
	int evilNumber(int num)
	{	int sum=0,rev=0;
		sum+=(int)Math.pow(num,2);
	
		while(sum!=0)
		{
			int rem=sum%10;
			rev=rev+rem;
			sum/=10;
		}
		return rev;
	}
}
		
			