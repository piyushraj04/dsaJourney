package SortingAlgos.Ascorder;

public class SelectionSortEx {
    static int[] selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i = 0;i < n-1;i++)
        {
            int minPos = i;
            for(int j = i+1; j<n-1;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {5,9,3,8,3,8,9,5,7,6,1,5,9,3,45,4,5,8,5,7,5,5,75};
        selectionSort(arr);
        for(int i = 0;i <arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
