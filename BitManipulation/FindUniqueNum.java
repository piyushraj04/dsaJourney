package BitManipulation;

public class FindUniqueNum {
    public static int uniqueNum(int arr[])
    {
        int unique = 0;
        for(int n : arr)
        {
            unique ^= n;
        }
        return unique;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,2,3,6,4};
        System.out.println(uniqueNum(arr));   
    }
    
}
,