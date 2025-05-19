class Sum 
{
	public static void main (String args[])
	{
	
		int start = 0, end = 10, sum= 0;
		while ( start<= end)
		{
			sum = sum+start;
			start++;
		}
		    System.out.println(sum);

		if (sum%2==0)
		{
			System.out.println(sum+" is even number");	
		}
		else
		{
			System.out.println(sum+" is odd number");
		}
	}
}
	