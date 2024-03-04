import java.util.*;
class ksmallest{
    public static void main(String[] args) {
    // int c=0;
    // int p=0;
    // int l,r=0;
    int k=3;
    int arr[] ={7 ,10 ,4 ,3,20 ,15};
    PriorityQueue <Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i =0;i<arr.length;i++)
    {
        maxheap.add(arr[i]);
        if(maxheap.size() > k)
        {
            maxheap.remove();
        }
    } 
    System.out.println(maxheap.peek());

    }}