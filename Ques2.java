import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = scn.nextInt();
        int area = side * side;
        System.out.println("The area of square is : " +  area);
    }
}
