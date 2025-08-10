package SortingAlgos.Ascorder;

public class CountingSortEx {

    // Counting Sort method
    public static void countingSort(int arr[])
    {
        // STEP 1: Find the maximum element in the array
        // This helps us decide the size of the 'count' array
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i]; // update max if current element is greater
            }
        }

        // STEP 2: Create the count array of size (max+1)
        // We add +1 because array index starts from 0
        // Initially, all values will be 0
        int[] count = new int[max + 1];

        // STEP 3: Store the frequency of each element from arr[] into count[]
        // Example: if arr[i] = 3, then increase count[3] by 1
        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++; // increment frequency of that number
        }

        // STEP 4: Place elements back into arr[] in sorted order
        // 'index' is used to track the position in the original array
        int index = 0;
        for(int i = 0; i < count.length; i++)
        {
            // If count[i] > 0, it means the number 'i' exists in arr[]
            // We put 'i' into arr[] as many times as it appears
            while(count[i] > 0)
            {
                arr[index] = i; // place the number in arr
                index++;        // move to the next position in arr
                count[i]--;     // decrease the count since we have placed it
            }
        }
    }

    // Main method to test the counting sort
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1}; // input array

        countingSort(arr); // sort the array

        // Print sorted array
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
