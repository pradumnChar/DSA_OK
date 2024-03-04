import java.util.*;
class rearrangeAlter
{
    public static void main(String[] args) {
        long[] arr= {1,2,3,4,5,6};
        int n=arr.length;
        // int l=0;
        // int r=0;
        // int k=0;
        // int n=arr.length-1;//5
        // int arr1[] = new int[arr.length];
        // arr1[k++]=arr[arr.length-1];
        // arr1[k++]=arr[0];
       
        //     l=1;
        //     r=n-1;
        //     while(l<r)
        //     {
        //   arr1[k++]=arr[r];
        //   r--;
        //   arr1[k++]=arr[l];
        //   l++;
        //     } 
        //     arr[0]=arr1[0];
        //     System.out.println(arr[0]);   
            //my code

            //copy 
        int min=0;
        int max=n-1;
        long me=0;
        me=arr[n-1]+1;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i]+(arr[max]%me)*me;
                max--;
            }else
            {
                 arr[i]=arr[i]+(arr[min]%me)*me;
                 min++;
            }
        }
        
        for(int p=0;p<arr.length;p++)
        {
              arr[p]=arr[p]/me;
        }
      
    }
}
//Bhai medium level khhud se liya without anyhekp with best optimize code time and soace