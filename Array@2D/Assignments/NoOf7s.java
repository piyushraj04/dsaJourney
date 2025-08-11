package Assignments;

public class NoOf7s {
    public static int noOf7s(int array[][], int key) {
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(noOf7s(array, 7));
    }

}
