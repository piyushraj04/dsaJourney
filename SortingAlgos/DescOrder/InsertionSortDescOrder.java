package SortingAlgos.DescOrder;

public class InsertionSortDescOrder {

    // Method to perform insertion sort in descending order
    public static void insertionSort(int arr[]) {
        
        // Loop starts from the 2nd element (index 1) 
        // because the first element (index 0) is already "sorted"
        for (int i = 1; i < arr.length; i++) {
            
            int curr = arr[i]; // Store the current element to be placed in the correct position
            int prev = i - 1;  // Start comparing with the previous element

            // Shift elements of the sorted part to the right
            // as long as they are smaller than 'curr'
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev]; // Shift element one position to the right
                prev--; // Move left in the sorted portion
            }

            // Place the current element (curr) in its correct position
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        
        // Sample array
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        // Call the sorting method
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Array in Descending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
