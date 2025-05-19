class Amstrong1
{
     public static void main(String args[])
	{
		Student student = new Student();
		student.roll = 30;
		student.branch= "ECE";
		student.e_mail = "kirankumar.mataparthi@mail.com";
		student.gender="Male";
		student.name = "Kiran";
		student.change();
		student.result();
		student.instance();

	}
}
	
class Student 
{
	int roll;
	String name,branch,e_mail,gender;
	
	
  void change()
	{
		roll+=10;
	}
  void instance ()
	{
			System.out.println("name is "+name+"\n"+"roll no is "+ roll+"\n"+branch+"\n"+e_mail+"\n"+gender);
	}
  void result()
	{
		roll*=5;
	}
}
	





























/*

	void amstrong()
	{
		System.out.println(num);
	}











	void amstrong()
	{
		if(num!=0)
		{
			count++;
			num/=10;
			
		}
		num=temp;
			while(num!=0)
			{
			int rem = num%10;
			int power = (int) Math.pow(rem,count);
			sum=sum + power;
			num/=10;
			}
			if (sum==temp)
				System.out.println("Amstrong number");
	}
*/













			