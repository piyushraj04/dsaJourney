package SortingAlgos.Ascorder;

public class BubbleSortExample {

    // Method to perform Bubble Sort in Ascending Order
    public static void buubleSort(int arr[])
    {
        int n = arr.length; // Store the size of the array
        boolean swapped;    // Flag to check if swapping happened in a pass

        // Outer loop → Number of passes (n-1 passes needed for complete sorting)
        for(int i = 0 ; i < n-1 ; i++)
        {
            swapped = false; // Reset swap flag for each pass

            // Inner loop → Compare each adjacent element in the array
            // After each pass, the largest element of the unsorted part moves to the end
            // Hence we do (n-1-i) comparisons instead of (n-1) every time
            for(int j = 0; j < n-1-i; j++)
            {
                // If current element is greater than the next element → Swap them
                if(arr[j] > arr[j+1])
                {
                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true; // Mark that swapping happened in this pass
                }
            }

            // Optimization: If no swapping happened in the current pass → Array is already sorted
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int arr [] = {4, 6, 3, 28, 9, 91}; // Example array

        System.out.println("Before Sorting: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " "); // Print original array
        }
        System.out.println();

        // Perform Bubble Sort
        buubleSort(arr);

        System.out.println("After Sorting: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " "); // Print sorted array
        }
    }
}
