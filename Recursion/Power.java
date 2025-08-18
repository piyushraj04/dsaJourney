package Recursion;

public class Power {
    static int findPower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x * findPower(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(findPower(2, 10));
    }
    
}
