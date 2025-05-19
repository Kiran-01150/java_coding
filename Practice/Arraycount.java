import java.util.Arrays;
class MyClass
{
	public static void main(String args[])
	{
		//Myclass my =new MyClass();
		char ch[]= new char []{'a','A','1','3','%','$','e','O','u'};
		if(ch>='A' && ch<='Z')
		{
			count++;
			if(ch=='A'||cha=='E'||ch=='I'||ch=='O'||ch=='U')
			{
					count1++;
				System.out.println("vowels count of capital letter is "+count1);
			}
				
			else{

					count2++;
				System.out.println("consonant count in capital letter  is "+count2);
			}
			
		}
		System.out.println("capital letter count is "+count);

		else if(ch>='a' && ch<='z')
		{
				counta++;
				count++;
			if(ch=='a'||cha=='e'||ch=='i'||ch=='o'||ch=='u')
			{
					countb++;
				System.out.println("vowels count of Small letter count is "+countb);
			}
			else{

					countc++;
				System.out.println("consonant count in capital letter  is "+countc);
			}
			
		}
		System.out.println("capital letter count is "+counta);
		
		else
			System.out.println("special");		
	}
}
