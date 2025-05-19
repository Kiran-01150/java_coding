import java.util.Scanner;
class University
{
	public static void main (String args[])
	{	System.out.println(" Welcome to KLM University\n"+" Here we offer UG and PG courses Enroll below");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Choose PG or UG");
		Admission admission = new  Admission();
		String input = sc.next();
		admission.underGrad(input);
		if(input=="UG" || input == "ug")
		{
			return("Select any of these courses \n"+"B Tech\n"+"B com\n"+"B sc\n"+"BBA");
		}
		return "Choose correct one";

		System.out.println(admission.underGrad(input));
		
		
	}
}
class Admission
{
	String underGrad(String input)
	{
		if(input=="UG" || input == "ug")
		{
			return("Select any of these courses \n"+"B Tech\n"+"B com\n"+"B sc\n"+"BBA");
		}
		return "Choose correct one";
	}
}