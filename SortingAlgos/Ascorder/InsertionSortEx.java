package SortingAlgos.Ascorder;

public class InsertionSortEx {

    public static int[] insertionSort(int arr[])
    {
        for(int i = 1;i<arr.length;i++)
        {
            int curr = arr[i]; //current element with with check
            int prev = i-1; //which wants to check

            //to replace the position 
            while(prev>=0&&arr[prev]<curr)   //< for desc or > for asc
            {
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=curr;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {5,9,7,3,4,6,6,9,2};
        insertionSort(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        };

    }
    
}
