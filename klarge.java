import java.util.*;
public class klarge {
    public static void main(String[] args) {
          int sum=0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        int N=5;
int K=3;
int p=0;
int arr[]={-4,5,-1,0,3};
        for(int i=0;i<N;i++)
        {
            a.add(arr[i]);
              sum = arr[i];
            for(int j=i+1;j<N;j++)
            {
              sum=sum+arr[j];
              a.add(sum);
                
            }
            sum=0;
        }
       Collections.sort(a,Collections.reverseOrder());
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println(a.get(K));
        
    }
    }

