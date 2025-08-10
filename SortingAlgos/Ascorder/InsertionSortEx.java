package SortingAlgos.Ascorder;

public class InsertionSortEx {

    // Method to perform insertion sort
    // This method sorts an array in Ascending Order
    public static int[] insertionSort(int arr[]) {

        // Loop through each element starting from index 1
        // because the first element (index 0) is already "sorted"
        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i]; // Current element to be compared and placed in correct position
            int prev = i - 1;  // Index of the previous element in the sorted part

            // Shift all elements in the sorted part that are greater than 'curr'
            // to the right, to make space for 'curr'
            // For ascending order: arr[prev] > curr
            // For descending order: arr[prev] < curr
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // Shift element to the right
                prev--; // Move left in the sorted portion
            }

            // Insert the current element into the correct position
            arr[prev + 1] = curr;
        }

        return arr; // Return the sorted array
    }

    public static void main(String[] args) {

        // Example array
        int arr[] = {5, 9, 7, 3, 4, 6, 6, 9, 2};

        // Call insertion sort method
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Array in Ascending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
