package SortingAlgos.DescOrder;

public class CountingSortDescorder {

    // Function to sort the array in descending order using Counting Sort
    public static void countingSortDescOrder(int arr[]) {

        // Step 1: Find the maximum value in the array (needed for count array size)
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { // Update max if a bigger number is found
                max = arr[i];
            }
        }

        // Step 2: Create the count array (size = max + 1)
        // This array will store the frequency of each number
        int[] count = new int[max + 1];

        // Step 3: Count the frequency of each element in the input array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // Increase the count of the number at index arr[i]
        }

        // Step 4: Place elements back into the original array in descending order
        int index = 0; // Keeps track of the position in the original array
        // Start from the highest value (max) down to 0 for descending order
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) { // If the number i occurs in the array
                arr[index] = i;   // Place i into the original array
                index++;          // Move to the next position
                count[i]--;       // Decrease the frequency count
            }
        }
    }

    // Main method to test the sorting function
    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        // Call the sorting function
        countingSortDescOrder(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
