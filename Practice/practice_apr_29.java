class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Main main = new Main();
        int res[]=main.sort(new int []{1,-6,9,8,3,-9,0,8,8});
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
    int sort(int a[])
    {   int rev=0;
        for(int x =0;x<a.length;x++)
        {
            for(int i=x+1;i<=a.length-2;i++)
            {
                if(a[x]<a[i])
                {
                    int t = a[x];
                    a[x]=a[i];
                    a[i]=t;
                    //rev=rev*10+a[x];
                }
               // rev=rev*10+a[x];
            }
               
        }
         //System.out.println(rev);
         return a;
    }
}