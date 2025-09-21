import java.util.InputMismatchException;
import java.util.Scanner;

public class DivOf10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.println("Enter the no:-");
                int n = sc.nextInt();
                if (n % 10 == 0) {
                    System.out.println("Correct Choice...\nOut of loop:");
                    break;
                } else {
                    System.out.println(n + " is not valid...");
                }
            } while (true);
        } catch (InputMismatchException e) {
            System.out.println("Try Catch executed... Invalid  input:");
        } finally {
            sc.close();
        }
    }
}
