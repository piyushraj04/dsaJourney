import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Pencil's Price");
        float pencil = scn.nextFloat();
        System.out.println("Enter the Pen's Price");
        float pen = scn.nextFloat();
        System.out.println("Enter the Eraser's Price");
        float eraser = scn.nextFloat();

        float sum = pencil + pen + eraser;
        float total = sum + sum * 18 / 100;
        System.out.println("the total cost after 18% gst is : " + total);

        /*
         * int $= 10;
         * System.out.println($);
         */

    }
}
