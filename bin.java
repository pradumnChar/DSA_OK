import java.util.*;
public class bin {
    public static void main(String[] args) {
        
    
    int N = 9;
int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
int key = 10;
int c=0;
int l = 0 , h = 8;
int mid =(l+h)/2;
Arrays.sort(arr);
    while(arr[mid]!= key && l<=h)
        {
            if(arr[mid]<key)
            {
                l=mid+1;
            }else if(arr[mid]> key)
            {
                l=mid+1;
            }
           
            mid =(l+h)/2;
        }
         if(arr[mid] == key)
            {
                //c++;
                System.out.println(mid);
            }
if(l>h){
System.out.println("njh");
}
    }
}
