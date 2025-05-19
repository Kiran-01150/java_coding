class Student
{
	public static void main (String args[])
	{	
		Busy busy=new Busy();
		int num = 112457;
		int res = busy.busyOf(num);
		if(res==7 || num%7==0)
			System.out.println(num + " is a Busy number");
		else
			System.out.println(num + " is not a Busy number");

	}
}
class Busy
{
	int busyOf(int num)
	{	
		int temp =num,store=0;
		while(num!=0)
		{
			int rem = num%10;
			store = rem;
			break;
		}
		return store;

	}
}