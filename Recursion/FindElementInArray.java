package Recursion;

public class FindElementInArray {
    public static boolean elementInArr(int arr[],int i,int key)
    {
        if(i==arr.length)
        {
            return false;
        }
        if(arr[i]==key)
        {
            return true;
        }
        return elementInArr(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,9,6,3};
        System.out.println(elementInArr(arr, 0, 17));
        
    }
    
}
