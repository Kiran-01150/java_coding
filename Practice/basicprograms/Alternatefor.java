class Alternatextract
{
	public static void main (String args[])
	{
		
	int num = 1738965,rev=0;
	while (num>0)
	{
		int rem = num%100;
		System.out.println(rem);
		char let = (char)rem;
		System.out.println(let);
		
		while(rem!=0)
		{
			int rem1= rem%10;
			
			//System.out.println(rem1);
			rev=rev*10+rem1;
			//System.out.println(rev);
			rem/=10;	
		}
			System.out.println(rev);
       		        char let2 = (char)rev;
			System.out.println(let2);
			
		rev/=100;
		num/=100;
	}


 }
}