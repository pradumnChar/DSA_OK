//hard GFG 
//NAIVE APPROCH
class now{
    public static void main(String[] args) {
        int arr[] ={1, -2, 1, 0, 5};
        int sum=0;
        int c=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                    int s=arr[i]+arr[j]+arr[k];
                    if(s==sum)
                    {
                        c++;
                        break;
                    }
                }
            }
        }
        System.out.println(c);
    }
}*/