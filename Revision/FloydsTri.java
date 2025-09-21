import java.util.Scanner;

public class FloydsTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pr = 1;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0; j <= i;j++)
            {
                System.out.print(pr+" ");
                pr++;
            }
            for(int j = 0 ; j < n-i-1 ; j++)
            {
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
