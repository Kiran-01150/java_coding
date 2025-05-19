import java.util.Arrays;
import java.util.Scanner;
class Main
{
	public static void main(String []srgs)
	{
		Main main=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		//int row = sc.nextInt();
		int [][]ar =new int [][]{{22,56,45},{2,45,6},{12,35,12},{66,89,12}};
		Arrays.sort(ar);
		//int [][]br= new int[ar.length-1][];
		


		for(int r=0;r<=ar.length-1;r++)
		{	
			
			for(int c=0; c<=ar[r].length-1;c++)
			{
				System.out.println(ar[r][c]);
				//int col = sc.nextInt();
				//br[r][c]=ar[r][c];
				
			}
			System.out.println();
		}
/*
		for(int a=0;a>=br.length-1;a++)
		{
			for(int c=0;c<=br[a].length-1;c++)
			{
				System.out.print(br[a][c]);
			}
			System.out.println();
		}
*/
	}
}



	