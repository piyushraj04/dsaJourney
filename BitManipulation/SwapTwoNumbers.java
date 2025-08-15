package BitManipulation;

public class SwapTwoNumbers {
    public static void swapNum(int a,int b)
    {
        System.out.println("Previous a : "+a);
        System.out.println("Previous b : "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap a : "+a);
        System.out.println("After swap b : "+b);
    }

    public static void main(String[] args) {
        swapNum(5,4);
    }
    
}
