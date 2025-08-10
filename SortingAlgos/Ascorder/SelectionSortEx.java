package SortingAlgos.Ascorder;

public class SelectionSortEx {

    // Method to perform Selection Sort in ascending order
    static int[] selectionSort(int arr[]) {
        int n = arr.length; // Get the size of the array

        // Outer loop → moves the boundary of the unsorted part
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position (i) has the smallest element
            int minPos = i;

            // Inner loop → find the actual smallest element in the remaining array
            // Starts from i+1 because elements before i are already sorted
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    // Found a smaller element → update minPos
                    minPos = j;
                }
            }

            // Swap the smallest element found with the element at index i
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) {

        // Example array
        int arr[] = {5, 9, 3, 8, 3, 8, 9, 5, 7, 6, 1, 5, 9, 3, 45, 4, 5, 8, 5, 7, 5, 5, 75};

        // Call the sorting method
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Array after Selection Sort (Ascending Order):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
