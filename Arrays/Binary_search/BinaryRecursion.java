import java.util.Arrays;
class Main2 {
    public static void main(String[] args)
    {
        
        Main2 main = new Main2 ();
        int arr[]= new int []{-12,23,45,12,-9,56,36,9,89,-4};
        Arrays.sort(arr);
        int search= 45;
        String res=main.binarySearch(arr,search,0,arr.length-1,0);
        System.out.println(res);
    }
    
String  binarySearch(int arr[],int sr,int f, int l,int mid)
    {
      mid =(f+l)/2;
      //System.out.println(mid);

   if(f>l){
  System.out.println("element not found");
   }
  

 else{
       //m=((f+l/)2);
  
  if(arr[mid]==sr)
     {
      return "element found";
          
     }
   else if (sr>arr[mid])
       f=mid+1;

      //f=m+1;
   else{
          l=mid-1;
         }

 }
      return  binarySearch( arr, sr, f, l,mid)  ; 
  
  
    }
}











