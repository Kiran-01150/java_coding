Class Strong
{
	public static void main ( String args[])
	{
     
	for(int start=1;start<=100000;start++)      
	 {
       		int num=start,temp=num,sum=0;      
	 	while(num>0)
       		{          int rem=num%10;
          		int fact=1;          
		while(rem>0)
         	 {            
		fact=fact*rem;
           	 rem--;          
		}
         	 sum=sum+fact;         
		num=num/10;
     	  }          if(sum==temp)
        		System.out.println(temp+" is strong number");

		
	
	
		





































	
	}
}