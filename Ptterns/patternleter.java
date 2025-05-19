class Binarysearch

{

    public static void main(String args[])
    {   char rows=5,col=5;
       char temp2='A';
        for(int r =1;r<=rows;r++)
        {   int temp1=2;
            for(int c=1; c<=col;c++)
            {
                if(r%2!=0)
                {
                   System.out.print(temp2+" ");
                  temp2++;
                }
                
               else
               {
                System.out.print((int)temp1+" ");
                temp1++;
               }
               //System.out.println();
            }
           
            System.out.println();
            temp1++;
        }
            
    }
}    
