class p{
// {
//     static {
//         int c=0;
//         System.out.println(c);
//     }
    public static void main(String[] args) {
        String str3="";
        String str2="forgeeksgeeks";
        for(int i=str2.length()-1;i>=0;i--)
        {
            str3+=str2.charAt(i);
        }
        System.out.println(str3);
    }
}