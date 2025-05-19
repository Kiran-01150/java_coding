 class Main
{
	public static void main (String args[])
{

/* 
// Sum of the factors between 1 to 100
for (int x=1;x<=100;x++)
       {
            System.out.println("factor of " + x + " is");
            int num = x ,end=x, start=1;
             int sum=0;
            while(start<=end)
            {
                 if (num%start==0)
                 {
                     sum=sum+start;
                 }
                 start++;
            }
         System.out.println(sum);
       }



	// Amstrong between 1 to 100
	//for (int x=100;x<=200;x++)
	  for (int x=1;x<=10000;x++)

         {
            
            int num = x,temp=x,rem=0,sum=0,count=0 ;
             
            while(num!=0)
            {   
                count++;
                num/=10;
            }
            num=temp;
            while(num!=0)
            {
             rem=num%10;
             int res = (int)Math.pow(rem,count);
             sum+= res;
             num/=10;
		}
            //System.out.println(sum);
                if (x==sum)
                {
                System.out.println(x+" is a amstrong number");
                }
            
       }

	// Factors of every number between 1 to 100

	for (int x=1;x<=100;x++)
      	{
       		System.out.println("factors of " + x + " is");
           	 int start=1,end =x,num = x ;
             
            	while(start<=end)
           	 {  
               		 if (num%start==0)
               		 {
                		System.out.println(start);
               		 }
                	start++;
           	 }
       }*/




		//palindrom prime or not 
		 
       for (int x=1;x<=1000;x++)
       {
       
           int start = 1 , num=x ,temp=num,res=0,rem=0,
           count=0;
       
       // System.out.println(sum);
       		 while (num!=0)
        	{
            		rem = num%10;
            		res = res*10+rem;
            		num/=10;
        	}
        	num=temp;
        	while(start<=num) 
        	{
            		if(num%start==0)
            		{
               			 count+=1;
           		 }
           		start++;
        	}
       		 if (count==2 && x==res)
           	 System.out.println(x + " is a palandrom,prime ");
        
       }



















	
}
}