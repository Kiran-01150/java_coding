
class Student1
{
	public static void main(String args[])
	{
	
		Exam exam = new Exam();
		
		int num = 155;
		int res = exam.method1(num);
		

		if(res==num)
			System.out.println(num+" is a amstrong number");
		else
			System.out.println(num+" is not a amstrong number");

  }
}
class Exam
{
	
	int method1(int num)
	{
	  int temp=num,count=0,sum=0;
	    while(num!=0)
	    {
		count++;
		num/=10;
	    }
	  num=temp;
	//System.out.println(num);
	  while(num!=0)
	  {
		int rem = num%10;
		sum+= (int)Math.pow(rem,count);
		num/=10;
	  }
		//System.out.println(sum);
	  return sum;	
	}
}




	



