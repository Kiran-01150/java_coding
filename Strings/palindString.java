import java.util.Arrays;
class Main{
    public static void main(String args[])
    {  
	String s1= "madam arora teaches malayalam",s2="";
	String str[]=s1.split(" ");
	for(int x=0;x<=str.length-1;x++)
	{
		//System.out.println(str[x]);
		StringBuffer sb=new StringBuffer(str[x]);
		sb.reverse();
		String rev= sb.toString();
		//System.out.println(rev);
		System.out.println(rev.equals(str[x])?str[x]+" plindrome":str[x]+" not a palindrome");
		if(rev.equals(str[x]))
			System.out.println(str[x]+" Is palindrome");
	}
     }
}	
		
		