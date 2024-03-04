class numberPairs
{
    public static void main(String[] args) {
        int a1[] ={2,3,4,5};
        int a2[] ={1,2,3};
        int c=0;
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    break;
                }
                else
                {
                 int   p=(int)Math.pow(a1[i],a2[j]);
                 int q= (int)Math.pow(a2[j],a1[i]);
                 if(p>q)
                 {
                    c++;
                 }
                }
            }
        }
        System.out.println(c);
    }
}