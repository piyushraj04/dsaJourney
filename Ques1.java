import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 1st value : ");
        int a = scn.nextInt();
        System.out.println("Enter the 2nd value : ");
         int b = scn.nextInt();
        System.out.println("Enter the 3rd value : ");
         int c = scn.nextInt();

         int sum = a + b + c;
         double avg = sum / 3;
         System.out.println("the avg of above numbers is : "+avg);

    }
}
