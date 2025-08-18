package Recursion;

public class Factorial {
    public static int factorial(int n,int fact)
    {
        if(n==1)
        {
            fact *= n;
            return fact;
        }
        fact = fact * n;
        return factorial(n-1, fact);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5, 1));
    }
    
}
