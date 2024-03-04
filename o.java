class p{
    public static void main(String[] args) {
       
        String S = "geeksforgeeks";
     //  StringBuilder sb = new StringBuilder();
      //
       int l = 0;
       int c=0;
        int r=S.length()-1;
        int p=S.length()/2;
         while(l<p)
         {
            char c1= S.charAt(l);
            char c2= S.charAt(r);
            {
                if(c1 != c2)
                {
                  l++;
                  r--;
                  c++;
                }
                }
            }
        
        System.out.println(c);
    }
    };