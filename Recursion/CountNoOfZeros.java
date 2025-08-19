package Recursion;

public class CountNoOfZeros {
    public static int cntzeros(int n,int lastDigit,int cnt)
    {
        if(n==0)
        {
            return cnt;
        }
        if(lastDigit == 0)
        {
            cnt++;
        }
        return cntzeros(n/10, n%10, cnt);
    }
    public static void main(String[] args) {
        int n = 1000400;
        System.out.println(cntzeros(n/10, n%10, 0));
    }
    
}
