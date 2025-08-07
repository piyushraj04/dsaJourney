import java.util.Scanner;

public class MathFunctionsExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // 2. Using Math methods
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        double avg = (num1 + num2) / 2.0;
        double sqrtMax = Math.sqrt(max);
        int absDiff = Math.abs(num1 - num2);
        double squareOfMin = Math.pow(min, 2);

        // 3. Output results
        System.out.println("\n--- Results ---");
        System.out.println("Smaller number: " + min);
        System.out.println("Larger number: " + max);
        System.out.println("Average: " + avg);
        System.out.println("Square root of larger number: " + sqrtMax);
        System.out.println("Absolute difference: " + absDiff);
        System.out.println("Square of smaller number: " + squareOfMin);
    }
}
