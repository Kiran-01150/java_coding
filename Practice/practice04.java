class Main {
    public static void main(String[] args)
   {
        Main main = new Main();
        int res[]=main.sort(new int []{1,-6,9,8,3,-9,0,8,8});
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
    int[] sort(int a[])
    {  
        for(int x =0;x<a.length-2;x++)
        {
            for(int i=x+1;i<=a.length-1;i++)
            {
                if(a[x]<a[i])
                {
                    int t = a[x];
                    a[x]=a[i];
                    a[i]=t;
                   
                }
               
            }
               
        }
         
         return a;
    }
}