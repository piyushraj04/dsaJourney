package BitManipulation;

public class FindNoOfDigits {
    public static void main(String[] args) {
        int number = 68765691;
        int base = 2; // give base 10 for decimal numbers or 2 for binary numbers
        int ans = (int) (Math.log(number)/Math.log(base))+1;
        System.out.println(ans);
    }
    
}
