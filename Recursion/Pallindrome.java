package Recursion;

public class Pallindrome {
    public static int reverse(int n,int rev,int lastDigit)
    {
        if(n==0)
        {
            rev = rev*10+lastDigit;
            return rev;
        }
        rev = rev*10 + lastDigit;
        return reverse(n/10, rev, n%10);
    }
    public static boolean pallindrome(int n,int reverse)
    {
        return (reverse==n)?true:false;
    }
    public static void main(String[] args) {
        int n = 121;
        int reverse = reverse(n/10, 0, n%10);
        System.out.println(pallindrome(n, reverse));
        
    }
    
}
