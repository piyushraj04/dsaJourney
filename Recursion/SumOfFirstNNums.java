package Recursion;

public class SumOfFirstNNums {
    public static int sum(int n,int sum)
    {
        if(n==1)
        {
            sum+=n;
            return sum;
        }
        sum = sum+n;
        return sum(n-1,sum);
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 0));
        
    }
    
}
