package Assignments;

public class traverseArray {
    public static void printMatrix(int[][] matrix)
    {
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 4, 7, 8 }, { 8, 8, 7 } };
        int row = arr.length;
        int col = arr[0].length;

        printMatrix(arr);
        int[][] traverse = new int[col][row];

        System.out.println("-------------");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                traverse[j][i] = arr[i][j];
            }
        }
        printMatrix(traverse);


       

    }

}
