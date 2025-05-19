//exmax
class Student
{
	public static void main (String args[])
	{
		Digit digit = new Digit();
		int num=5641329;
		int res = digit.maxOfDigit(num);
		System.out.println(res + " is a max digit of the given "+num+" number");



	}
}
class Digit
{
	int maxOfDigit(int num)
	{	int max =0;
		while(num!=0)
		{
			int rem = num%10;
			if (rem>max)
			{
				max=rem;
			}
			num/=10;
		}
		return max;
	}
}