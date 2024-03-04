class ok{

    
  3) using recursion
 static int fibo(int m,int a,int b)
   {
    if(m<0)
    {
        return 0;
    }
      int c=a+b;
      System.out.println(c);
      return fibo(m-2,b,c);
    }






    public static void main(String[] args) {
        int n=10;
        int q=1;
        int w=1;
        int c=0;
        System.out.println(q+" "+w);
        fibo(n,q,w);


      1) //iteration
        for(int i=0;i<n;i++)
        {
            q=w;
            w=c;
            c=q+w;
           System.out.println(c);
        }


        2) using Dunamic programmming
        int arr[]=new int[n+1];
         arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

       

    }
}