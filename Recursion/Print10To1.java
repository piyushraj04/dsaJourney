package Recursion;

public class Print10To1 {
    public static int print(int n)
    {
        if(n==1)
        {
            return 1;
        }
        System.out.println(n);
        return print(n-1);
    }
   
    
    public static void main(String[] args) {
        System.out.println(print(10));
    }

    
}
