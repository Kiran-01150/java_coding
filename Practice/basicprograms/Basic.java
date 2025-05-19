import java.util.Scanner;
class Basic_programs
{
	public static void main (String args[])
	{
		/*int p_amount = 10000;
		float time = 2.5f , intrest = 4.5f;
		float s_intrest =( p_amount*time*intrest/100);
		System.out.println( s_intrest  );

		//rectangle area= l*b , perimeter = 2*(l*b)
		//circle  area = pi * radius*radius , circum = 2 * pi * radius

		int length = 5 , breadth = 6, radius = 8 ;
		float pi = 3.14f;
		int area_rect = length * breadth,
		perimeter = 2*(length * breadth);
		System.out.println("area of a rectangle is "+area_rect + " cm");
		System.out.println("perimeter of a rectangle is "+perimeter+" cm");

		float area_circle = pi*(radius*radius);
		float circum = 2*pi*(radius);
		System.out.println(area_circle);
		System.out.println(circum);

		// marks and percentage
		int m1 = 76,m2=74,m3=56 , m4=84, m5 = 89, m6=69;
		int total = m1+m2+m3+m4+m5+m6;
		double max=600.0;
		double percentage = total/max*100.0;
		System.out.println((int)percentage+"marks are "+ total);

		
		//swaping

		String a = "hello" , b= "world";
		String temp ="";
		temp=a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);




		f. Murali's basic salary is input through the keyboard. His dearness allowance is 40% of basic salary, and house rent allowance 		   is 20% of basic salary. Write a program to calculate remaining amount of his salary.
*/		
		System.out.println(" provide the input as salary of kiran ");

		Scanner sal = new Scanner(System.in);
		int salary = sal.nextInt();
		int dearness =(int) (40.0/salary*100);
		System.out.println("His dearness allowance is 40% of his salary is "+ dearness+" Rs");
		int house = (int)(20.0/salary)*100;
		System.out.println("His house rent allowance is 20% of his salary is 20% of his basic salary is "+ house +" Rs\n");
		System.out.println("The total salary that he have after all expences is "+(salary-dearness-house)+" is the savings he have");






		

	}
} 