package Recursion;

public class ReverseOfNumber {
    public static int reverse(int n,int rev,int lastDigit)
    {
        if(n==0)
        {
            rev =rev*10+lastDigit;
            return rev;
        }
        rev = rev*10+lastDigit;
        return reverse(n/10, rev, n%10);
    }
    public static void main(String[] args) {
        int n = 15487979;
        System.out.println(reverse(n/10, 0, n%10));
    }
    
}
