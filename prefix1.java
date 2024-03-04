public class prefix1 {
    public static void main(String[] args) {
        long a[ ] = {-1, 2, 3, -5};
         long l[ ] = {0,3};
          long r[ ] = {1,3} ;
 int Q=2;
// int p=0;
// int k=0;
// int sum[ ]= new int[Q+1]; 
// int sum1[ ]= new int[Q+1];
int ans=0;
int ans1=0;
int p=(int)l[0];//0
int k=(int)r[0];//1
long sum[]= new long[5]; 
//int sum1[ ]= new int[Q+1];
for(int i = p; i <= Q; i++)
{
ans+=a[ i ];
}
for(int i = k; i <=Q; i++)
{
ans1+=a[ i ];
}
sum[0] = ans;
sum[1]=ans1;
// for(int i = 1; i <= Q; i++)
// {
//     p+= a[ i ];
// }
// sum[0]= p;
 
  System.out.println(sum[1]);
 
  
        //System.out.println(k);
  

    }
}
