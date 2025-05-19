class Practice 
{
	public static void main (String args[])
	{
	/*int num =66,prod =3,end=1,temp=num;
	while(temp>end)
	{
	
		if (num%2==0)
			num=num/2;
		else if(num%2!=0)
			num=num*prod+1;
		temp=num;
		System.out.println("The numbers are " + temp);
	}
	System.out.println("Fibonacci Series");
	

	

	int n=10,first=0,sec=1,count=0;
	while(count<n)
	{
		int sum1=first+sec;
		first = sec ;
		sec=sum1;
		count +=1;

	 System.out.println(sum1);}*/
	
	int num=123456788,rem=0,sum=0;
	long num1=123456139978999l,rem1=0,sum1=1,count=0;
	while (num!=0)
	{	rem=num%10;
		sum += rem;
		num/=10;}
	while(num1>0)
{
		rem1 = num1%10;
		sum1 *=rem1;
		num1/=10;
		count++;

} 	System.out.println(count);
	//System.out.println(sum1);	

if(sum1%2==0)
		System.out.println(sum1+" is even");

else

		System.out.println(sum1+" is odd");




	//int num = (int)Math.pow(9,4);
	//System.out.println(num);


	























}
}