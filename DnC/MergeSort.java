package DnC;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei) {
        // base condition
        if (si >= ei) {
            return;
        }
        // mid
        int mid = si + ((ei - si) / 2);
        // merge sort left
        mergeSort(arr, si, mid);
        // merge sort right
        mergeSort(arr, mid + 1, ei);
        // combines
        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si + 1];
        int i = si; // iterator for left sorted arr
        int j = mid + 1; // iterator for right sorted arr
        int k = 0; // iterator for temporary arr

        // sorted copy in temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // remaining elements of left arr
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //remaining elements of right arr
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy inti arr
        for( k = 0, i = si; k < temp.length; k++,i++)
        {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,6,8,7,56,595,545,884,7,9,2,1,3,9};
         for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length-1);
        System.out.println("<<<--- After Sorting--- >>>");
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }

}
