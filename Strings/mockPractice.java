import java.util.Arrays;
class Main{
    public static void main(String args[])
    { 
        int rev,i=100,temp;
        for(int x=1;x<=i;x++)
        {	temp=x;
		rev=0;
            while(temp!=0)
            {
                int rem= temp%10;
                rev = rev*10+rem;
                temp=temp/10;
                //System.out.println(temp);

            }
            if(x==rev)
            System.out.println(x+" is a palindrome ");
        }
          }
}    