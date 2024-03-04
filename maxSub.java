import java.util.*;

public class maxSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            // int arr[] = {2, -3, 7, -4, 2, 5, -8, 6, -1};
            // int sum=0;
            // int max=0;
       int ok[]= {1, 2, 2, 5, 5};
       int op[]= new int[ok.length +1];
            // for(int i=0; i<arr.length; i++)
            // {
            //  sum=Math.max(arr[i],arr[i]+sum);
            //  max=Math.max(max,sum);
            // }
            
            // System.out.println(max);
            for(int i=1;i<=ok.length;i++)
            {
                if(i>ok.length)
                {
                    break;
                }
                
               op[i]=i;
                //  System.out.println(op[i]);
            }
            for(int i=1;i<=ok.length;i++)
            {
                if(i>ok.length)
                {
                    break;
                }
               if(op[i]!=ok[i])
               {
                System.out.println(ok[i]);
             }
        }
            
        }
    }
}
//t(n) =n
//S=n