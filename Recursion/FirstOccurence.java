package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int arr[],int i,int key)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOccurence(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[] = {2,8,9,8,6,56,66,6,65,6,3,87};
        System.out.println(firstOccurence(arr, 0, 9));
        
    }
    
}
