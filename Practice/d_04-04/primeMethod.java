/*import java.util.Scanner;
class Student
{
	public static void main (String args[])
	{
		System.out.println("Enter the input to check the number is prime or not\n");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Prime prime = new Prime ();
		//int x = 15;
		prime.isPrime(input);

	}
}

class Prime
{
	void isPrime(int num)
	{	
		int count=0,end=num/2;
		for (int x=2;x<=end ; x++)
		{
			if(num%x==0)
			{
				count++;
			}
		}
		if (count==0)
			System.out.println(num+" is a Prime number");
		else 
			System.out.println(num+ " is not a Prime number");
	}
} 


import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{       
		System.out.println("Enter input");
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		Prime prime = new Prime();
		//prime.isPrimeNum(input);
		int res = prime.isPrimeNum(input);
		System.out.println(res);
		
		if(res==0)
			System.out.println(input+" is a prime number");
		else
			System.out.println(input +" is not a prime number");
		
	

	}
}

class Prime
{
	int isPrimeNum(int input)
	{
		int count=0, end=input/2;
		for(int x=2; x<=end; x++)
		{
			if(input%x==0)
				count++;
		}
		return count;
	}
}


		//Factors of a number

import java.util.Scanner;
class Student 
{
		public static void main (String args[])
		{	System.out.println(" Enter the number");
			Scanner sc = new Scanner (System.in);
			int input = sc.nextInt();
			Factors factors = new Factors();
			factors.sumOfFactors(input);
			int res = factors.sumOfFactors(input);
			System.out.println(res+" is the sum of factors of a "+input+" number");
		}
}
class Factors
{
		int sumOfFactors(int input)
		{
		   int sum=0,end=input/2;
		  for(int x=1;x<=end;x++)
		  {
			if( input%x==0)
			{
				sum+=x;
				
			}
		  }
			return (sum+input);
		}
}

		//palindrome		

import java.util.Scanner;

class Student 
{
	public static void main (String args[])
	{
		System.out.println("Enter the number here");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Reverse reverse = new Reverse();
		//reverse.Palindrome(num);
		int res = reverse.Palindrome(num);
		if (res == num)
			System.out.println(num+" is a palindrome and the reverse of the number is "+res );
		else 
			System.out.println(num+" is not a palindrome and the reverse of the number is "+res );

		
	}
}
class Reverse
{
	int Palindrome(int num)
	{	int temp=num,rev=0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;
	}
}




class Student

{
	public static void main(String args[])
	{
		Amstrong amstrong = new Amstrong();
		int y = 407;
		int count1=amstrong.isAmstrong(y);
		System.out.println("count of digits is"+count1);
		int num = amstrong.powerOfDigit(count1,y);
		System.out.println("sum of the power is "+num);
		amstrong.amstrongOrNot(y,num);
		
	}
}
class Amstrong
{	//int x =153;
	int isAmstrong(int x)
	{	int count=0;
		while(x!=0)
		{
			count++;
			x/=10;
		}
		return count;
	}
	int powerOfDigit(int count1,int x)
	{	//System.out.println(x);
		int power=0,sum=0;
		while(x!=0)
		{
			int rem = x%10;
			power = (int)Math.pow(rem,count1);
			sum = sum+power;
			x/=10;
		}
		//System.out.println(sum);
		return sum;
		
	}
	void amstrongOrNot(int x,int num)
	{
		if (x==num)
			System.out.println(x+" is  equal to "+num+" so it is a amstrong number");	
		else
			System.out.println(x+" is not equal to "+num+" so it is not a amstrong number");
	}

}

*/






































