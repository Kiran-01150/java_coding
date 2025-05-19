class Main
{
	public static void main(String args[])
	{
		String s = "abacdefg abcdefg",s2="";
		for(int x=0;x<=s.length()-1;x++)
		{
			char let = s.charAt(x);
			if(s2.indexOf(let)==-1)
				s2+=let;
		}
		System.out.println(s2);
	}
}
	