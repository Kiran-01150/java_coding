class Student
{
	public static void main (String args[])
	{
		Techno tec = new Techno();
		int input = 1325;
		int res1=tec.splitNum(input);
		if(input == res1)
			System.out.println(input + " is a Technology number");
		else
			System.out.println(input + " is not a Technology number");


	
	}
}
class Techno
{
	int splitNum(int num)
	{	int count=0,temp=num;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=temp;
		int sum=0,count1=count/2;
		System.out.println(count);
		while(num!=0)
		{
			int result=(int)Math.pow(10,count1);
			int rem =num%result;
			sum+=rem;
			num/=result;
		}
		int sum1 =0;
			sum1+=(int)Math.pow(sum,2);
		
		System.out.println(sum1);
		return sum1;
	}
}











