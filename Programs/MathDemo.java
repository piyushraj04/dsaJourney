public class MathDemo {
    public static void main(String[] args) {
        int a = 10, b = 20, n = -50;

        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Sqrt of 25: " + Math.sqrt(25));
        System.out.println("2 raised to 3: " + Math.pow(2, 3));
        System.out.println("Average: " + (a + b) / 2.0); // No Math.avg()
        System.out.println("Absolute of -50: " + Math.abs(n));
    }
}
