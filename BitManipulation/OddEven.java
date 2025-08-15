package BitManipulation;

import java.util.Scanner;

public class OddEven {
    public static void oddOrEven(int n)
    {
        int res = n&1;
        if(res==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        oddOrEven(2);
        oddOrEven(0);
        oddOrEven(5);
        oddOrEven(7);
        
    }
    
}
