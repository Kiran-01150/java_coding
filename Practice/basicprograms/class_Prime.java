import java.util.Random;
class Prime
{
  	public static void main (String args[])
	{
			
		/*Random ran = new Random();
		int num = ran.nextInt(1,100);
		//int num = 15;
		System .out .println("Random number is "+num);
		int start =2 , end =num/2, count =0;
	
	    for(start=2 ; start<=end ;start++)
	   {
		if ( num%start==0)
			count +=1;
	    }
	    if (count == 0)
		System .out .println("prime number");
	   else 
		

		System .out .println(" not a prime number");
*/

		// Amstrong number 
		
		

		Random r = new Random ();
		int num = r.nextInt(1000),rem=0,temp=num,rem1=0;
		int p = 1,sum=0,count=0;
		System .out .println(num + " is  Random input to check amstrong number");
		while(num!=0)
		{
			rem=num%10;
			count++;
			num/=10;
		}
		num=temp;
		//System .out .println(count);
		while(num!=0)
		{
			rem1=num%10;
			 p = (int)Math.pow(rem1,count);
			sum = sum+p;
			num/=10;

		}
		//System .out .println(sum);
		if (temp==sum)
		System .out .println(temp+" it is a amstrong number");

		else
		System .out .println(temp + " is not a amstrong number");





















}
}