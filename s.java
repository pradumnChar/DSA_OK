import java.util.*;
class o{
    public static void main(String[] args) {
       int N = 5;
int arr[] = {5, 1, 2, 3, 4};
       int p=arr[arr.length-1];

int ans=0;
int w=0;
if(p < arr[0])
{
w++;
}
Arrays.sort(arr);
if(w>0)
{
for(int i=arr.length-1;i>=0;i--) {
    if(arr[i] == p)
    {
        break;
    }
    ans++;
}
}
        System.out.println(ans);
    }
        
    }