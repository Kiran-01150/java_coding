/*
class Student
{
	public static void main(String args[])
	{
		Practice practice = new Practice();
		//System.out.println(practice.majorOrMinor());
		  int res = practice.majorOrMinor();
		  System.out.println(res>=18&&res<=59?"major":res<=17?"Minor":res>=60&&res<=120?"Senior":"Invalid age");
	}
}
class Practice
{
	int majorOrMinor()
	{	int num=88;
		

		return num;
	}
	
}

import java.util.Scanner;
class Student
{
	public static void main(String argsp[])
	{	System.out.println("Enter the input here");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Extract ex = new Extract();
		//int x = 123456;
		int res = ex.add(x);
		System.out.println(" The addition of two even number is "+res);
	}
}
class Extract
{
	int add(int num)
	{
		int temp = num;
		int count=0;  
		while(num!=0)
		{	
			count++;
			num/=10;
		}
		num=temp;
		count=count/2;
		int sum=0;
		while(num!=0)
		{	int power=0;
			power = (int)Math.pow(10,count);
			int rem = num%power;
			sum=sum+rem;
			num/=power;
		}
		return sum;
	}
}
			
*/

	//caluclate the sum of the digits and product
import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		System.out.println("Enter the input values");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Addition addition = new Addition();
		int res = addition.add(input);
		int res1=addition.prod(res);
		int two_sums=addition.addBothSumAndProd(res,res1);
		System.out.println(res+" Is the sum of given the given "+input+" number \n"+res +" Is the addition of "+input+" number\n"+res1+" is the product of the "+res+" number\n"+two_sums +" is the sum of both sum and product of "+res+" and"+res1); 
		
	}
}
class Addition
{
	int add(int num)
	{	int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			sum +=rem;
			num/=10;
		}
		return sum;
	}
	int prod(int num1)
	{	int product=1;
		while(num1!=0)
		{
			int rem = num1%10;
			product *=rem;
			num1/=10;
		}
		return product; 
	}
	int addBothSumAndProd(int num1,int num2)
	{
		int sum=num1+num2;
		return sum;
	}
}

















