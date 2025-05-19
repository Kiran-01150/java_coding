import java.util.Arrays;
class Main
{
	public static void main(String []args)
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=0;c<=4;c++)
			{
				if(r%2==0)
					System.out.print("# ");
				else
					System.out.print("$ ");

			}		
			System.out.println();
		}
	}
}