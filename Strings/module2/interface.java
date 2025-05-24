class Main{
	public static void main(String args[])
	{
		Sample sam = (a,b,c)->
		{
			return a+b+c;
		};
		System.out.println(sample.method2(5,9,88));
		
	}
}
@Fuctionalinterface
interface Sample
{
	public int method2(int a,int b,int c);
}