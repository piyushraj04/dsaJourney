public class SpiralMatrix {

    // Method to print elements of a 2D array in spiral order
    public static void printSpiral(int arr[][]) {

        // Define boundaries of the spiral
        int startRow = 0;                  // Starting row index
        int startCol = 0;                  // Starting column index
        int endRow = arr.length - 1;       // Last row index
        int endCol = arr[0].length - 1;    // Last column index

        // Loop until the start boundaries cross the end boundaries
        while (startRow <= endRow && startCol <= endCol) {

            // 1️⃣ Print the top row (left → right)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // 2️⃣ Print the right column (top → bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // 3️⃣ Print the bottom row (right → left)
            // Check to avoid reprinting the same row in single-row case
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) { // Prevent duplicate printing in last row
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // 4️⃣ Print the left column (bottom → top)
            // Check to avoid reprinting the same column in single-column case
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) { // Prevent duplicate printing in last column
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            // Move inward to the next layer of the spiral
            startRow++;
            startCol++;
            endRow--;
            endCol--;

            // Optional line break to separate layers visually (can be removed)
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Example matrices for testing

        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int arr2[][] = {
            { 1,  2,  3,  4,  5,  6,  7},
            { 8,  9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42},
            {43, 44, 45, 46, 47, 48, 49}
        };

        int arr3[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int arr4[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        // Call method with your chosen array
        printSpiral(arr4);
    }
}
