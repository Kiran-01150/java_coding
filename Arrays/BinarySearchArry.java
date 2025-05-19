import java.util.Arrays;
class Main {
    public static void main(String[] args)
    {
        Main main = new Main ();
        int arr[]= new int []{-12,23,45,12,-9,56,36,9,89,-4};
        Arrays.sort(arr);
        int search= 89;
        main.binarySearch(arr);
    }
    
    void binarySearch(int arr[])
    {
            int f=0,l=arr.length-1,m=0,sr=0;
        while(f<=l)
         {
                m=(f+l)/2;
            
            if(sr==arr[m])
            {
                System.out.println("element found");
                break;
            }
            else if (sr>arr[m])
                f=m+1;
            else
            l=m-1;
         }    
            if(f>l)
                System.out.println("element not found");
            
    }
}    
       