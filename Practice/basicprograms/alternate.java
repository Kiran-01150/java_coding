
class Alternate
{
	public static void main (String args[])
	{
		/*int num = 2389671,temp=num, rev=0;
	while(num>0)
	{
		int rem = num%10;
		rev = rev*10+rem;
		num=num/10;
	}
		num=rev;
	while(num!=0)
	{
		int rem1 =num%10;
		System.out.println(rem1);
		num/=100;
	}
		*/



		int num = 1738965,rev=0;
	

	while (num>0)
	{
		int rem = num%100;
		System.out.println(rem);
		char let = (char)rem;
		System.out.println(let);
		
		while(let!=0)
		{
			int rem1= let%10;
			
			//System.out.println(rem1);
			rev=rev*10+rem1;
			//System.out.println(rev);
			let/=10;	
		}
			System.out.println(rev);
       		        char let2 = (char)rev;
			System.out.println(let2);
			
		rev/=100;
		num/=100;
	}


 }
}