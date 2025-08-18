package Recursion.Assignments;

public class OccurenceOfKey {
    public static void occurenceOfkey(int arr[] ,int i, int key)
    {
        if(i == arr.length)
        {
            return;
        }
        if(key==arr[i])
        {
            System.out.print(i+" "); 
        }
        occurenceOfkey(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[] =  {3, 2, 4, 5, 6, 2, 7, 2, 2};
        occurenceOfkey(arr, 0 ,2);
        
    }
    
}
