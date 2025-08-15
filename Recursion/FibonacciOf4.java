package Recursion;

public class FibonacciOf4 {
    public static int fib(int n) {
        // base cond:
        if (n <= 2) // fib(1)==0||fib(2)==1
        {
            return n - 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        // int fib1 = 0,fib2 = 1;
        System.out.println(fib(15));
    }
}
