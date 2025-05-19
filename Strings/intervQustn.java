import java.util.Arrays;
class Main{
    public static void main(String args[])
    {  
	String s1= "hello all",s2="";
	//  o/p=    lla  olleh
	//  o/p2=   olleh lla
	String str[]=s1.split(" ");
	System.out.println(s1);
	for(int x=0;x<=str.length-1;x++)
	{
		StringBuffer sb = new StringBuffer(str[x]);
		sb.reverse();
		String rev = sb.toString();
		System.out.print(rev+" ");
	}
     }
}
