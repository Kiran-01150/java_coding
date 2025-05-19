//auto.java
class Student
{
	public static void main (String args[])
	{
		Student1 s1 = new Student1();
		int input=25;//(76*76)
		int res = s1.autoMat(input);
		int res2 = s1.autoMat2(input,res);
		if(res2==input)
			System.out.println(input + " is a automatic number");
		else
			System.out.println(input + " is not a automatic number");
	}
}
class Student1
{
	int autoMat(int num)
	{	int temp=num,count=0;
		
		while(num!=0)
		{
			count++;
			num/=10;
			
		}
		return count;
				
	}
	int autoMat2(int num1,int num2)
	{	int sum = 0,rem=0,res=0;
		sum = (int)Math.pow(num1,2);
		while(sum!=0)
		{
			res = (int)Math.pow(10,num2);
			rem = sum%res;
			break;	
		}
		System.out.println(sum);
		System.out.println(sum);
		return rem;
		
	}
}