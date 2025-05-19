class Diff
{
	public static void main ( String args[])
		{
	int num1 = 14000, rem=0 ,rev = 0, count1=0,num2=num1,rem1=0,rev1=0,count2=0,last=1,gap=0,final1=0,temp=num1;
		while (num1>0)
		{
			rem = num1%10;
			rev = rev*10+rem;
			count1+=1;
			num1=num1/10;
		}
		System.out.println(" Number before reversing " + temp);
		
		System.out.println(rev);
	
		while(rev>0)
		{
			rem1=rev%10;
			rev1=rev1*10+rem1;
			count2++;
			rev=rev/10;
	
		}
			System.out.println(rev1);

*/
			gap=count1-count2;
			final1 =(int)Math.pow(10,gap);
			last = rev1*final1;
			System.out.println("number after reverseing " +last);

			

		while (last>=0)
		{
			int res3 = (int)Math.pow(10,count1-1);
			count--;
			int rem3 = rev3/rev3;
			String digits = (rem3==0)?"zero":(rem3==1)?"one":(rem3==2)?"two":(rem3==3)?"three":(rem3==4)?"four":
(rem==5)?"five":(rem3==6)?"six":(rem3==7)?"seven":(rem3==8)?"eight":(rem3==9)?"nine":"invalid";
			rev3=rev3%rev3;
		System.out.println(digits);


		}

/*






























}
}