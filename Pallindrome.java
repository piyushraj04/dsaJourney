import java.util.Scanner;
public class Pallindrome {

    public static boolean isPallindrome(int n)
    {
        int pallindrome = n;
        int reverse = 0;
        while(n>0)
        {
          int remaider = n % 10;
          reverse = reverse * 10 + remaider;
          n = n/10;
          System.out.println(reverse);
        }
        if(pallindrome==reverse)
        {
            return true;
        }
        else
        {
            return false;
          
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        
        if(isPallindrome(a))
        {
            System.out.println("The number "+a+" is a Pallindrome");
        }
        else
        {
            System.out.println(a+" is a not a Pallindrome");
        }
        
    }
}
