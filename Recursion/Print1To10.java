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

    private static void printInc(int n)
    {
        if(n==10)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printInc(n+1);
    }

    static void printInc2(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        printInc2(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        //System.out.println(print(1));
        printInc2(10);
    }
    
}
