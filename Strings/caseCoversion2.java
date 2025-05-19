import java.util.Arrays;
class Main{
    public static void main(String args[])
    { 
	String s1= "helLO All 1 & Good MornING @ 234",s2="";
	for(int x=0; x<=s1.length()-1;x++)
	{
		char let = s1.charAt(x);
		if(Character.isUpperCase(let))
			s2+=Character.toLowerCase(let);
		else if(Character.isLowerCase(let))
			s2+= Character.toUpperCase(let);
		else 
			s2+=let;
	}
  		System.out.println(s2);

     }
}