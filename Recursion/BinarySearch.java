package Recursion;

public class BinarySearch {
    public static int search(int arr[],int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]<target)
        {
            return search(arr, target, mid+1, e);
        }
        else
        {
            return search(arr, target, s, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,12,16,18,65,67};
        System.out.println(search(arr, 67, 0, arr.length-1));
    }
    
}
