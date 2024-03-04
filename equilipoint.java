import java.util.Arrays;

public class equilipoint {
    public static void main(String[] args) {
        int arr[] ={1,3,5,2,2};
        int n=arr.length;
        int leftsum = 0;
        int totalsum = 0;
        for(int i = 0 ; i < n ; i++){
            totalsum += arr[i];
        }
        for(int i = 0 ; i< n; i++){
            totalsum -=arr[i];
            if(leftsum == totalsum){
                System.out.println(i+1);
            }
            leftsum +=arr[i];
        }
    }
}
