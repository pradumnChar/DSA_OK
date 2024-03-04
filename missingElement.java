public class missingElement
{
    public static void main(String[] args)
    {
      //  int n=arr.length;
    //    for(int i=0;i<n;i++)
    //    {
    //    System.out.print(arr[i]);
    //    }
     /*  1st method
       int expected_num= n+1;//5+1=6
       int sum=0;
       int total_Sum_including_missing= (n*expected_num)/2;//=15
       for(int i=0;i<n;i++)
       {
        sum=sum+arr[i];
       }
       System.out.println(sum-total_Sum_including_missing);  */
/*2nd M */
   int array[] ={1,2,4,5,5,6,8,3,15,2};
  
   int[] copy = new int[16];
   for(int i: array) 
   {
      copy[i] =1;
   }
   for(int i=0; i<copy.length; i++)
   {
     if(copy[i] == 0)
     {
      System.out.println(i);
     }
   }

    }
}
