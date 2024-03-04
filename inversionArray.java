public class inversionArray {
    public static void main(String[] args) {
        int c=0;
        int l=0;
        int r=0;
        int arr[] = {10, 10, 10};
        for(int i=0;i<arr.length;i++)
        {l=i;r=arr.length-1; while(l<r)
            {
                if(arr[l]>arr[r])
                {
                    c++;
                    r--;
                }else if(arr[l]<=arr[r])
                {
                    r--;
                }
            }
        }System.out.println(c);}}
        //my version only 100 text cased passed