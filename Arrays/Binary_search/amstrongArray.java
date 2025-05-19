import java.util.Arrays;
class Main
{
	public static void main (String []args)
	{
		Main main = new Main ();
		int num = 408,count=0,prod=0;
		int countOf= main.countCheck(num,count);
		int res= main.productOfAmstrong(num,countOf,prod);
		//System.out.println(res);
		main.checkAmstrongOrNot(num,res);
		main.range(1,1000,0);
		
	}
	public void range(int start,int end,int sum)
	{
		if(start<=end)
		{
			int countOf= countCheck(start,0);
			int res= productOfAmstrong(start,countOf,sum);
			checkAmstrongOrNot(start,res);
			range(start+1,end,0);
		}
		else
		{  }
	}
	int countCheck(int num,int count)
	{
		if(num==0)
			return count;

		else
		{
			num/=10;
			return countCheck(num,count+1);
		}
	}

	int productOfAmstrong(int num ,int countOf,int product)
	{
		if(num==0)
			return product;
		else
		{
			int rem = num%10;
			int res = (int)Math.pow(rem,countOf);
			product=product+res;
			num/=10;
			return productOfAmstrong(num,countOf,product);
		}

	}
	void checkAmstrongOrNot(int num,int result)
	{
		if (num==result)
			System.out.println(num+"   Amstrong Number");
		else{}
	}
	



}