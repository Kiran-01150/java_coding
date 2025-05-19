import java.util.Arrays;
class Main{
    public static void main(String args[])
    { 
	String s1= "hello all 1 & Good Morning @ 234";
	int c=0, s=0 ,d=0, sy=0, sp=0;
	for(int x=0; x<=s1.length()-1;x++)
	{
		char letter = s1.charAt(x);
		if(Character.isUpperCase(letter))
			c++;
		else if(Character.isLowerCase(letter))
			s++;
		else if(Character.isDigit(letter))
			d++;
		else if(letter==' ')
			sp++;
		else
			sy++;
	}
		System.out.println("small letters count is "+s+"\n capital letters count is "+c+"\n total digit count is "+d+"\n total spaces count is "+sp+"\n total special symbols are "+sy);
     }
}