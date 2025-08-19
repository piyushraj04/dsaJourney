package Recursion;

public class CountSteps {
    public static int noOfSteps(int n)
    {
        return helper(n, 0);
    }
    public static int helper(int n,int steps)
    {
        if(n==0)
        {
            return steps;
        }

        if(n%2==0)
        {
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
    public static void main(String[] args) {
        int n = 14;
        System.out.println(noOfSteps(n));

    }
    
}
