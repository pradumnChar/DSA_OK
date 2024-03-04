import java.util.*;
class pas{
  static void ans(char a[], int fi)
    {
       if(fi == a.length-1)
       {
        System.out.println(a);
        return;
       }
       for(int i=fi;i<a.length;i++)
       {
        swap(a, i, fi);
        ans(a,fi+1);
         swap(a, i, fi);
       }
    }
    static void swap(char a[], int i,int fi)
    {
        char temp = a[i];
        a[i] = a[fi];
        a[fi] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            String s= sc.next();
            char []a = s.toCharArray();
            ans(a, 0);
        }
    }
}