class Practice
{
	public static void main(String args[])
	{
		int a1 = 0;
		if(a1==0)
		{
		System.out.println("This is equal to Zero");
		}

		else if(a1>0)
		System.out.println("this is positive integer");

		else
		{
		System.out.println("This is negative integer");
		}
               
		//int num=0;

		// Divisable By 3 or 5
		int num= 9;
		int div1 = num%3, div2 =num%5;
		if ((div1==0) || (div2==0))
		System.out.println(num+" is divisable ");
		else 
		System.out.println(num+" is not divisable by 3 or 5");
			
		// The person is child or adult and senior citizen
		int age = 60;
		if(age<=12)
			System.out.println("This person is Kid");
		else if(age<=59)
				System.out.println("This person is Adult");
		else
			System.out.println("This person is Senior citizen");
			





		// Scholarship

               String college_name= "St.peter's enhineering college",C_code="54AVK98";
		String branch ="CSE";
		int scholar = 0;
		


		if((branch=="ECE")||(branch=="EEE"))
		{
			scholar=25000;
			System.out.println(scholar+"Rs");
		}
		else if ((branch=="IT")||(branch=="CSE"))
		{
			scholar=30000;
			System.out.println(scholar+"Rs");
		}
		else if ((branch=="Civil")||(branch=="Mech"))
		{
			scholar=35000;
			System.out.println(scholar+"Rs");
		}
		else if ((branch=="Mtech")||(branch=="MSE"))
		{
			scholar=40000;
			System.out.println(scholar+"Rs");
		}
		else
		{
			scholar=15000;
			System.out.println(scholar+"Rs"+" For remaining Branches");
			}
			

		// odd or evem

		int num = 8;
		if(num%2==0)
			{
				System.out.println(nun+" is a even number");
			}	
		else
			{
				System.out.println(num+" is a odd number");
			}
		

















	
	}
}