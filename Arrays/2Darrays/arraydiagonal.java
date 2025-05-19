import java.util.Arrays;
class ArrayDiagonal
{
	public static void main(String args[])
	{
		ArrayDiagonal diagonal	= new ArrayDiagonal();
		int arr[][]= new  int [][]{{2,5,6},{5,8,2},{9,8,6}};
		diagonal.diag(arr);



	}
	void diag(int array[][])
	{
		for(int r=0;r<=array.length-1;r++)
		{
			for(int c=0;c<=array[r].length-1;c++)
			{
				if(c==r||c+r==array.length-1)
				{
					System.out.print(array[r][c]);
					
				}
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	
	}
}
