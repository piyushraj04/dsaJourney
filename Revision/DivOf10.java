import java.util.Scanner;

public class DivOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        while(n%10!=0)
        {
            System.out.println("Enter the num again:");
            n = sc.nextInt();
        }
        if(n%10==0)
        {
            System.out.println(n+" is multiple of 10");
        }
    }
}
