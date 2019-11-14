import java.util.*;
class SubAray
{
  public static void main(String[] args)
   {
      int[] arr= {10,20,30,40,50};
      Scanner s = new Scanner(System.in);
       System.out.println("Enter key");
       int n = s.nextInt();
       int size = 5;
       int i,j=0;
     
       for(i=0;i<size;i++)
        { 
           
         
           System.out.print(arr[i]);
            if(i==size-1)
               { 
                  j=j+1;
                   if(size-j>=n-1)
                 {
                   size= size-1;
                   i=-1;
                  System.out.println("\n");
                } 
               
        }
       }
   

	



}

}