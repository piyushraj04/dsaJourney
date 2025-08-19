package BitManipulation;

import java.util.Scanner;

public class SumOfNthRow {
    public static void main(String[] args) {
        int num[] = {
            1,
            1,1,
            1,2,1,
            1,3,3,1,
            1,4,6,4,1,
            1,5,10,10,5,1
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int n = sc.nextInt();
        int ans = 1 << (n-1);
        System.out.println(ans);
    }
    
}
