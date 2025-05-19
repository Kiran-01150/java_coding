class Main
{
	public static void main(String args[])
	{
		String sr = "Hi guys I am KiraN KuMar234$3abcd",s2="";
		// Hi gUyS I Am kIrAn kUmAr => output
		for(int x=0;x<=sr.length()-1;x++)
		{
			char let = sr.charAt(x);
			if(x%2==0)
			{
				if(let>='a' && let<='z')
					s2=s2+(char)(let-32);
				else
					s2+=let;
			}
			else
			{
				if(let>='A' && let<='Z')
					s2=s2+(char)(let+32);
				else
					s2=s2+let;
			}
		}	
		System.out.println(s2);
	}
}		