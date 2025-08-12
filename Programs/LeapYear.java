import java.util.Scanner;

class LeapYear
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();

        boolean x = (year % 4 ==0);
        boolean y = (year%100!=0);
        boolean z = (year%100==0 && year%400==0);

        System.out.println(((x&&(y||z))) ?"leap year":"not a leap year");
        /*
         
        if(x && (y || z ))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
        System.out.println((year + " is not a leap year"));
        }
         */
    }
}