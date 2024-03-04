import java.util.*;
class longSt{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String str[] ={"apple", "orange", "strawberry", "banana"};
        for(int i=0; i<str.length; i++)
        {
           if(! map.containsKey(str[i]))
           {
              map.put(str[i],str[i].length());
           }
        }
        int maxLength=0;
        // int ans=0;
        for(int currLength: map.values())
        {
             maxLength = Math.max(maxLength,currLength);
        }
        System.out.println(maxLength);
    }
}