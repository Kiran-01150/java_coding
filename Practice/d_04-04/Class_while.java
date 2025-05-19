class While
{
	public static void main(String args[])
	{
	
	int start = 100, end = 1;
	int num = 0;
	while (start >= end)
	{
		
		int last = start%10 ;
		int remain = start/10;
		start = remain+last;
		start -- ;
	}
	System.out.println(start);

		//even
	int start = 20 , end = 30 , count = 0;
		
	while(start<=end)
	{
		if(start%2==0)
		{
			count+=1;
		}
		start++;
	}
		System.out.println(count);
	if(count%2==0)
		System.out.println(count+" is a even number");
	else
		System.out.println("count is not even number");
 }
}