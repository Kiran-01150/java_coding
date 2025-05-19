class D_24
{
	public static void main (String args[])
	{
		Amstrong object = new Amstrong();
		object.num = 153;
		object.temp = object.num;
		object.temp1 = object.num;
		object.method1();

	}


}
class Amstrong 
{
	int num;
	int temp,temp1;
	void method1()
	{
		int count=0,sum=0;
		while(num!=0)
		{
			//int temp=num;
			count+=1;
			num/=10;
		}
		 num =temp;
		//System.out.println(num);	
		while(temp!=0)
		{	
		
			int rem = temp%10;
			int power = (int)Math.pow(rem,count);
			sum =sum+power;
			temp/=10;
		  }
	            //System.out.println(temp);
			if (sum==temp1)
		  {
			System.out.println(num);
			System.out.println("Amstrong Number");
		   }
		else
		{
			System.out.println(num);
			System.out.println("Not a Amstrong Number");
		}

   	 }
}

		