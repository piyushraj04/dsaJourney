package SearchingAlgos;
import java.util.Arrays;
public class BinarySearchEx {

    public static int binarySearch(int arr[])
    {
        int start = 0,end = arr.length-1;
        int key = 10;
        for(int i = 0; i<arr.length;i++)
        {
            int midPos = (start+end)/2;
            if(arr[midPos]==key)
            {
                return midPos;
            }
            else if(arr[midPos]<key)
            {
                start = midPos+1;
            }
            else
            {
                end = midPos-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,65,87};
        //Arrays.sort(arr);
        System.out.println(binarySearch(arr));
        
    }
    
}
