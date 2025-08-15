package BitManipulation;

public class IsPowerOf2orNot {
    public static boolean isPowerOf2(int n)
    {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOf2(10));
        System.out.println(isPowerOf2(16));
    }
}
