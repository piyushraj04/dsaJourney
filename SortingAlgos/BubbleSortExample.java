package SortingAlgos;

public class BubbleSortExample {

    public static void buubleSort(int arr[])
    {
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0 ; i < n-1 ; i++)
        {
            for(int j = 0; j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int arr [] = {4,6,3,28,9,91};
        System.out.println("Before Sorting : " );
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Sorting : ");
        buubleSort(arr);
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
