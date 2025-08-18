package Recursion;

public class BinaryString {
    public static void binaryString(int n, int lastDigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, 0, str + "0");
        if (lastDigit == 0) {
            binaryString(n - 1, 1, str + "1");
        }
    }

    public static void binaryStringApp2(int n, int lastDigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastDigit == 0) {
            binaryString(n - 1, 0, str + "0");
            binaryString(n - 1, 1, str + "1");
        } else {
            binaryString(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        binaryString(2, 0, "");
        System.out.println("-------");
        binaryStringApp2(3, 0, "");
    }
}
