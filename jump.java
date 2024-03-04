public class jump {
    public static void main(String[] args) {
       
int N = 6;
int A[] = {1, 2, 0, 3, 0, 0} ;
int L=A[0];
//int A[] = {1, 2, 0, 3, 0, 0} ;
int p=0;
while(L<N)
{

    p=A[L];
    p+=L;
    if(p==N)
    {
        
      System.out.println("1");
      break;
    }
    L+=p;
}
    }
}
