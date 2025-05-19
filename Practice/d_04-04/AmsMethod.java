class Student
{
	public static void main(String args[])
	{
		Amstrong amstrong = new Amstrong();
		int num =153;
		amstrong.countOfDigit(num);
		amstrong.isPower(num);
		int value = amstrong.isPower(num);
		System.out.println(amstrong.checkIs(num,value));
		System.out.println(amstrong.checkIs());
		System.out.println(amstrong.countOfDigit());

	}
}

class Amstrong
{
	//int num=153;
	void countOfDigit(int num)
	    {  
		while(num!=0)
		{
			count++;
			num/=10;
		}
		System.out.println(count);
	    }
	
	
	void isPower( int num)
	   {	//int count = countOfDigit();
		while(num!=0)
		{
			int rem = num%10;
			sum=sum+(rem*count);
			num/=10;	
		}
		//System.out.println(sum);
	  }
	void checkIs(int num,int result);
	{	//int result = isPower();
		if (num==result)
		 {
			System.out.println(num+" is a amstong");
		  }
		else
		{
			System.out.println(num+" is not aamstong");
		}
	  }
}



/*

		int start=1,power=1;
		for(start=1; start<=b; start++)
		{
			power*=a;
		}
		System.out.println(power);
	   }
			
	    {	

	void isAmstrong()
	   {
		int count=countOfDigit();
		int value=isPower();
		int power=0;
		
		while(value!=0)
		{
			int rem = value%10;
			power = power+(rem*count);
			value/=10;
		}
		if (power == value)
			System.out.println( " Is amstrong number");
		else
			System.out.println( " Is not a amstrong number");
	  }
		
		





}





void countOfDigit(int z)
	    {      int z=isPower();
		
		while(z!=0)
		{
			count++;
			z/=10;
		}
		System.out.println(count);

*/
