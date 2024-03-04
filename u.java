import java.util.*;
class u{
    public static void main(String[] args) {
       
        int nums[]={9,5,7,3};
        int k=6;
        if(nums.length % 2 != 0)
        {
           System.out.println(false);
        }
      
        HashSet<Integer> hs=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            int need = k-nums[i]%k;
            if(hs.contains(need))
            {
               hs.remove(need);
               continue ;
            }
            hs.add(nums[i]%k ==0?k:nums[i]%k );
        }
        System.out.println(hs.isEmpty());
       
    }
    
}
  