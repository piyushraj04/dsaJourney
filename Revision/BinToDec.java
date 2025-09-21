import java.util.Scanner;

public class BinToDec {
    static int power(int base,int ex)
    {
        int pow = 1;
        for(int i = 1; i <= ex; i++)
        {
            pow = pow*base;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        int decNum = 0;
        int pow = 0;
        while(binNum!=0)
        {
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit*power(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("the decimal num is : " + decNum);

    }
}
