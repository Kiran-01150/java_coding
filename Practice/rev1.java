class Diff1
{
	public static void main ( String args[])
		{
/*
     int num=164000,count=0,count1=0,count2=0,rev=0,rev2=0,rev3=0,temp=num;
     while(num>0)
     {
        int rem1=num%10;
        rev=rev*10+rem1;
        count1++;
        num=num/10;
     }
      System.out.println(rev);
     while(rev>0)
     {
        int rem2=rev%10;
        rev2=rev2*10+rem2;
        count2++;
        rev=rev/10;

     }
        count=count1-count2;
        int res=(int)Math.pow(10,count);
        rev3=rev2*res;
        System.out.println(rev3);
      
      while(rev3>=0)
      {
         int res3=(int)Math.pow(10,count1-1);
          count1--;
         int rem3=rev3/res3;
         String digits=(rem3==0)?"zero":(rem3==1)?"one":(rem3==2)?"two":(rem3==3)?"three":(rem3==4)?"four":(rem3==5)?"five":(rem3==6)?"six":(rem3==7)?"seven":(rem3==8)?"eight":(rem3==9)?"nine":"Invalid";
          rev3=rev3%res3;
        System.out.println(digits);
      } 
  
     */



		int num0 = 153121,result=0,count0=0,reverse=0,temp=num0  ;
          
		while (num0>0)
		{
			result = num0%10;
			reverse = reverse*10+result;
			count0++;
			num0/=10;
		}	
			System.out.println(reverse);
			System.out.println(count0);
		
		while (reverse>0)
		{
			remain= reverse%10;
			count2++;
			reverse/=10;


























}
}