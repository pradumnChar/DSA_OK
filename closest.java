import java.util.*;
class ok{
    public static void main(String[] args) {
       
int arr[ ] = {1 ,2, 3};
int l=0;
int r=0;
int c=0;
for(int i=0;i<arr.length;i++)
{
   l=i;
   r=i+1;
   while(l<r)
   {
       if(arr[l]>arr[r])
       {
           if(l>0)
           {
               if(arr[l]>arr[l-1])
               {
                    c++;
                   System.out.println(1);
                   break;
               }
           }
          // c++;
       }
   }
}
if(c==0)
{
     System.out.println(0);
}
    }
}