import java.util.Scanner;

public class AvgOfThreeNo {

    public static double avg(int a, int b, int c) {
        double avg = (a + b + c) / 2;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num : ");
        int a = sc.nextInt();
        System.out.println("Enter The Num : ");
        int b = sc.nextInt();
        System.out.println("Enter The Num : ");
        int c = sc.nextInt();
        System.out.println(avg(a,b,c));

    }
}
