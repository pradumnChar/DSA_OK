public class triplets {
    public static void main(String[] args) {
        int arr[] ={1,2};
        int c=0;
        for(int i=0; i<arr.length; i++) 
        {
            for(int j=i+1; j<arr.length; j++)
            {
                for(int k=0; k<arr.length; k++) 
                {
                   if(arr[i]+arr[j]==arr[k]) 
                   {
                    c++;
                   }
                }
            }
        }
        if(c>0)
        System.out.println(c);
    }
}
// t(n3)


//optimize
