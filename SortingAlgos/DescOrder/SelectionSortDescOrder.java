package SortingAlgos.DescOrder;

public class SelectionSortDescOrder {

    // Method to perform selection sort in descending order
    public static void selectionSortdescorder(int[] arr) {

        // Outer loop → Runs for each element except the last one
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current position (i) has the largest value
            int maxPos = i;

            // Inner loop → Find the actual largest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {

                // If we find a value larger than the current max, update maxPos
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }

            // Swap the largest found element with the element at position i
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        // Call sorting method
        selectionSortdescorder(arr);

        // Print sorted array
        System.out.println("Array after Selection Sort (Descending Order):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
