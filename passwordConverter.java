import java.util.*;
class pass{
         public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);
            {
                String str = sc.next();
                char arr[] = str.toCharArray();
                String curr="";
                int ans;
               int ok=0;
                String res="";
                for(int i=arr.length-1; i>=0; i=-2)
                {
                    curr="";
                     ok=arr[i]+arr[i-1];
                     curr+=ok;
                      //to convert string to integer we could use interger.parseint() method
                      ans = Integer.parseInt(curr);
                      if(ans == 32)
                      {
                        res+=" ";
                      }else if((ans>=65 && ans<=90) || (ans>=97 && ans<=99))
                      {
                        res+= (char)ans;
                      }else
                      {
                        if(i-2 < 0)
                        break;
                        curr+= arr[i-2];
                        ans= Integer.parseInt(curr);
                        res+= (char)ans;
                        i--;
                      }
                
                    }
                    System.out.println(res);

            }
         }
}