package Recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n ,int sum)
    {
        //base
        if(n==0)
        {
            sum+=n;
            return sum;
        }
        int ld = n%10;
        sum+=ld;
        return sumOfDigits(n/10, sum);
    }
    public static void main(String[] args) {
        int n  = 1245;
        System.out.println(sumOfDigits(n,0));
    }
    
}
