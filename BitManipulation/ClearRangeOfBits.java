package BitManipulation;

public class ClearRangeOfBits {
    public static int clearRangeOfBits(int n,int i,int j)
    {
        int a = (~0<<(j+1));
        int b = (1<<i)-1;

        int maskBit = a|b;

        return n & maskBit;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10, 2, 4));
        
    }
    
}
