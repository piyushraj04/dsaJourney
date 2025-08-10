package SortingAlgos.DescOrder;

public class BubbleSortDescEx {

    // Bubble Sort in Descending Order
    public static void bubbleSortDesc(int arr[])
    {
        boolean swapped; // This will check if any swap happened in a pass

        // Outer loop → Runs for n-1 passes
        // After each pass, the largest element among the unsorted part
        // moves toward the front (since we are sorting in DESCENDING order)
        for (int i = 0; i < arr.length - 1; i++)
        {
            swapped = false; // Reset swap status at the start of each pass

            // Inner loop → Compares adjacent elements
            // We do arr.length-1 comparisons because we compare arr[j] with arr[j+1]
            for (int j = 0; j < arr.length - 1 -i; j++)
            {
                // For descending order → Swap if the left element is smaller
                if (arr[j] < arr[j + 1])
                {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // A swap happened
                }
            }

            // If no swap happened in this pass → Array is already sorted
            // So we break early (optimization)
            if (!swapped)
            {
                break;
            }
        }

        // After sorting, the array is arranged in descending order
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        // Call the sorting function
        bubbleSortDesc(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
