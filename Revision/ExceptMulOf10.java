import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptMulOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :-");
        int n;
        int cnt = 0;
        try{
            do{
            n = sc.nextInt();
            
             if(cnt==5) break;
            if(n%10==0)
            {
                cnt++;
                continue;
            }
            else
            {
                System.out.println("the num is:-"+n);
            }
        }while(cnt<=5);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input entered...");
        }
        finally{
            sc.close();
        }
        
    }
}
