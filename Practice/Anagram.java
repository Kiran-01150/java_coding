import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Main main = new Main();
       int a[]=new int []{1,2,3,4,5,6,0};
       int b[] = new int []{4,3,2,1,5,6,0};
       main.anagram(a,b);
       
       
            
    }
    void anagram(int a[],int b[])
    {
        int count=0;
        if(a.length==b.length)
        {
            for(int y=0;y<a.length;y++)
            {
                for(int x=0;x<b.length;x++)
                {
                    if(a[y]==b[x])
                    count++;
                }
            }
        }
        if (count==a.length)
        System.out.println("anamgram");
        else
         System.out.println(" not anamgram");
         
    }
}