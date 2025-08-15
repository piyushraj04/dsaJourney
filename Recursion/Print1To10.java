package Recursion;

public class Print1To10 {
     private static int print(int n)
    {
        if(n==10)
        {
            return 10;
        }
        System.out.println(n);
        return print(n+1);
    }
    public static void main(String[] args) {
        System.out.println(print(1));
    }
    
}
