package Recursion;

public class FindPowerInLogN {
    public static int optimizedPower(int x, int n) {
        if(n==1)
        {
            return x;
        }
        int halfSqaure = optimizedPower(x, n/2);
        if(n%2!=0)
        {
            return x * halfSqaure * halfSqaure;
        }
        return halfSqaure * halfSqaure;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));

    }

}
