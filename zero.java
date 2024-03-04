class i{
    public static void main(String[] args) {
        int c=0;
      int l=0;
      int r;
      int n = 5;
int arr[] = {3, 5, 0, 0, 4};
        while(l<n)
      {
          l=0;
          r= n-(l+1);
          if(arr[l]==0)
          {
              c=arr[r];
              arr[r]=arr[l];
              arr[l]=c;
              l++;
              r--;
              //n--;
          }
          l++;
         // n--;
         // System.out.println(arr[l]);
      }
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }
    }
}