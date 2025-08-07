package ArrayAssignments;

public class twiceAppear {
    public static boolean checkTwiceAppearence(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
          for(int j = i+1; j < arr.length; j++)
          {
            if(arr[i] == arr[j]){
                return true;
            }
          }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        int arr1[] = {1, 2, 3, 4};
        int arr3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(checkTwiceAppearence(arr3));
        System.out.println(checkTwiceAppearence(arr1));
        System.out.println(checkTwiceAppearence(arr));
    }
    
}
