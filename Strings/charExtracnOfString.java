import java.util.Arrays;
class Main{
    public static void main(String args[])
    {  
       String s="vital information resoutces under sieze",s2="";
       String str[]= s.split(" ");
       
       for(int x=0; x<=str.length-1;x++)
       {
          s2+=str[x].charAt(0);
          
       }
       System.out.println(s2);
            
    }
}    