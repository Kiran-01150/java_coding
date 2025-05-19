class Main
{
		public static void main (String args[])
		{
			int rows=5,col=5;
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=col;c++)
				{
					if(r==1||c==1||r==rows||c==col)
						System.out.print("#");
					else
						System.out.print("$");

				}
				System.out.println();

			}
		}
}



/*

public static void main(String args[])
    {   int rows=5,col=5,temp=1;
        for(int r =1;r<=rows;r++)
        {
            for(int c=1; c<=col;c++)
            {
                //if(c>=col)
                System.out.print(temp+" ");
               // System.out.print("$"+" ");
               
            }
            temp++;
            System.out.println();
        }
    }
*/