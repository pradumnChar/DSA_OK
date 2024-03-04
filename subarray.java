
class subarray{
    public static void main(String[] args) {
        int[] arr={1,4,0,0,3,10,5};
        int sum=7;
        int n=0;
        int c=0;
        // Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            n=arr[i];
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>sum)
                {
                    break;
                }else{
                n+=arr[j];
                }
                if(n==sum)
                {
                    System.out.println(i+" "+j+"THE INDEXES");
                    c++;
                }else
                if(n>sum)
                {
                    break;
                }
            }
            if(c>0)
            {
                break;
            }
        }
        if(c==0)
        {
            System.out.println("ERROR: SUBARRAY NOT FOUND");
        }
    }
}

//check GFG FOR BETTER CODE 