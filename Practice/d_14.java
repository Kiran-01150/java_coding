import java.util.Scanner;
class Apr_14
{
	public static void main(String args[])
	{
		System.out.println(" Enter input here");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0)
			System.out.println(num+" even number");
		else
			System.out.println(num+" Odd number");
		System.out.println("enter double  number");
		double num1 = sc.nextDouble();
		//System.out.println("enter float  number");
		System.out.println(num1 +" Fractional  number");
		float num2 = sc.nextFloat();
		System.out.println(num2 +" Float number");	
		String letter = sc.next();
		System.out.println(letter+" enter word  number");


}
}