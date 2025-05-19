class Main
{
	public static void main(String args[])
	{
	  String s = "Hello all i am kiran ll kk jj",str="",str2="";
	for(int x=0; x<=s.length()-1;x++)
	{
		char let = s.charAt(x);
		int index1 = s.indexOf(let);
		int index2 = s.lastIndexOf(let);
		if(index1==index2)
			str2=str2+let;
			
		else if (index1 != index2)
		{
			if(str.indexOf(let)==-1)
			   str=str+let;
				
		}
	}
	System.out.println("dublicate char of a string are =>"+str+str2);
	System.out.println("unique char of a string are =>"+str2);
}
}