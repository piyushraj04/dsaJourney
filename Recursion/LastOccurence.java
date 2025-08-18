package Recursion;

public class LastOccurence {
    public static int lastOccurence(int arr[],int i,int k)
    {
        if (i < 0) {
            return -1;
        }
        if(arr[i]==k)
        {
            return i;
        }
        return lastOccurence(arr, i-1, k);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,17,9,7,6,6,8,6,5,4,3,2,1,9,8,7,6,6,7};
        System.out.println(lastOccurence(arr, arr.length-1, 17));
    }
    
}
