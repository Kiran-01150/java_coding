import java.util.Arrays;
class Main{
    public static void main(String args[])
    {  
	String s1= "madam arora teaches malayalam mom and dad",s2="";
	String str[]=s1.split(" ");
	for(int x=0;x<=str.length-1;x++)
	{
		if (x%2==0)
			s2+=str[x].toUpperCase();
		else
			s2+=str[x];
	}
	System.out.println(s2);
     }
}