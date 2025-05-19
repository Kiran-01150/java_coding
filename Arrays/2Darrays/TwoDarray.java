import java.util.Arrays;
class TwoDArrays
{
	public static void main (String args[])
	{
		int[][] array= new int[][]{{2,3,5,6,7},{2,4,6,7,8},{7,4,2,2,6},{3,2,7,9,1},{7,5,9,0,6}};
		System.out.println(array.length);
		
		int e_max=Integer.MIN_VALUE,l_max=Integer.MIN_VALUE,r_max=Integer.MIN_VALUE;
		for(int r=0; r<=array.length-1;r++)
		{
			int row_max=Integer.MIN_VALUE;
			for(int c=0;c<array[r].length;c++)
			{
				if(e_max<array[r][c])
					e_max=array[r][c];
				if(row_max<array[r][c])
					row_max=array[r][c];
					System.out.print(array[r][c]+" "); 
				if(r==c)
				{
					if(l_max<array[r][c])
						l_max=array[r][c];
				}
				if(r+c==array.length-1)
				{
					if(r_max<array[r][c])
						r_max=array[r][c];
				}
				
			}
			System.out.println(" Max element of row is "+row_max);
		}
			System.out.println("Entire max element is "+e_max);
			System.out.println(" Left diagonal max element is "+l_max);
			System.out.println(" Right diagonal max element is "+r_max);
	}

}