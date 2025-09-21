import java.util.Scanner;

public class DecToBin {
    private static int power(int base,int ex)
    {
        int pow = 1;
        for(int i = 1; i <= ex; i++)
        {
            pow*=base;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dec :- ");
          int decNum = sc.nextInt();
          int binNum = 0;
          int pow = 0;
          while(decNum!=0)
          {
            int rem = decNum%2;
            binNum = binNum + (rem * power(10, pow));
            pow++;
            decNum/=2;
          }
          System.out.println("The binary repr is :" + binNum);
          
    }
}
