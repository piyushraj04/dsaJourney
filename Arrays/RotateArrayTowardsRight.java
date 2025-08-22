package Arrays;

public class RotateArrayTowardsRight {
    private static void rightRotateArray(int[] arr,int rotate)
    {
        int temp = arr[arr.length-1]; //to store 1st element
        for(int i = arr.length-1;i >= 1; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        int rotate = 3;
        for(int i = 1; i <= rotate ; i++)
        {
            rightRotateArray(arr, rotate);
        }
        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }
    }
}
