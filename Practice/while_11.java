class While
{
	public static void main(String arga[])
{

     /* 
     //print even factors of a number

      int num = 24 , start = 1 , end = num;
  
	while(start<=end)
	{
		if ( num%start == 0)
		{
			int res = start;
			if(res%2==0)
			{
			  System.out.println(res);
			}
		}  
   			start++;
	}



	// to print highest factor of the number other than than the number

	int num2 = 30 , start1 =1, end1 = num2/2;
		
	while (start1<end1)
	{
		if(num2%start1==0 )
		{
			int res = start1 ;
			//System.out.println(res);
		
		}
		start1++;
		//System.out.println(x);	
	}


		int num =12 , start = 1, end =num/2 , temp1=0, temp2=1,count=0;
		
	while (start <= end)
	{
		if (num%start == 0 )
		{
			
			count+=1;
			temp1 += start;
			temp2*=start;
		
		}		
		start++;
	} System.out.println("total count is " + count);
	if (count%2==0)
		System.out.println(count+" of the factors is even number " +temp1 + " is the sum of  the factors");
	else
		System.out.println(count+" of the factors is odd number " +temp2 + " is the product of  the factors");
	
	


	int n1 =11, n2=13,start = 1,end1= n1, end2=n2,count1=0,count2=0;
	
	while(start<=end1 || start<=end2 )
	{
		if(n1%start ==0)
			count1++;
		if( n2%start==0)
			count2++;

		start++;
	}
	System.out.println(count1);
	System.out.println(count2);
	if(count1==2 && count2==2)
	{
		if(n1-n2==2 || n2-n1 ==2 )
			{
				System.out.println(n1+"and"+n2+" are twin primes");
			}
		
	}
	else
		System.out.println("not a twin primes");


		int a =20,b=30,c=40,temp=0,max=0;
		
	if(a>b || a>c)
		max = a;
	else if (b>c)
		max=b;
	else 
		max=c;
				


	if(max==a)
		System.out.println(a);
	else if(max==b)
		System.out.println(b);
	else
		System.out.println(c);
	System.out.println("before swaping "+a +" "+b+" "+c);
	
	temp=c;
	c=a;
	a=temp;
	System.out.println("after swaping "+a+" "+b+" "+c);

*/

		int start = 1,num=10, end = num,sum = 0, prod=1,fact=0,count=0;
		while(start<=end)
		{
			if(start%2==0)
				sum+=start;
			if(start%2!=0)
				prod*=start;
			sum=sum/2;
				



			start++;

			if(sum%start==0)
				count++;
				if(count==2)
				System.out.println(sum+" is a prime number");
			else
				System.out.println(sum+" is not a prime number");}
		  
		
		System.out.println("sum of even numbers is "+sum);//30

		System.out.println("product of odd numbers is "+prod);//945
			
		

		

































				
}
}
