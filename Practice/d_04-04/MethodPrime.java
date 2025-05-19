class Student 
{
	public static void main(String args[])
	{
		Factors factors = new Factors();
		int input = 155;
		int res1 = factors.fact(input);
		System.out.println(res1);
		String ams=factors.amstrong(res1);
		String prm = factors.primeOrNot(res1);
		if(res1%2==0)
			System.out.println( input+" is the input number "+res1 +" is even number "+ams); 
			
		else
			System.out.println(input+" is the input number "+res1 +" is Odd number" + prm);

	}
}
class Factors 
{
	int fact(int num)
	{
		int sum = 0;
		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
				sum=sum+i;
			
		}	
		return sum;
		
	}  
	String amstrong(int num)
	{	int count=0,sum=0,temp=num;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=temp;
		while(num!=0)
		{
			int rem = num%10;
			sum=sum+(rem*count);
			num/=10;
		}
		System.out.println(sum);
		if (sum==num)
			return " Amstrong number";
		else 
			return "Not a Amstrong number";
	}
	String primeOrNot(int num)
	{	int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				count++;
			break;
		}
		if(count==0)
			return num+" is prime number";
		else
			return num+" is prime number";
	}
}

















/*


{
	/*public static void main(String args[])
	{
		Digit digi = new Digit();
		int x = 246;
		digi.sum(x);
		digi.prod(x);
	}
}
calss Digit
{
	int sum(int a )
	{
		int sum=0;
		while(a!=0)
		{
			int rem = a%10;
			sum+=rem;
			a/=10;
		}
		return sum;
	}
	int prod(int b)
	{
		int prod=1;
		while(b!=0)
		{
			int rem =
*/
