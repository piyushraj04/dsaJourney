import java.util.Scanner;
public class SumOfDigit {

    public static int sumOfDigits(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum+=num%10;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println("the sum of the digit is :"+sumOfDigits(n));
    }
}
