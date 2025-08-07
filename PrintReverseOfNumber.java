import java.util.Scanner;
class PrintReverseOfNumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the no. : ");
		int num = sc.nextInt();	
		while(num>0)
		{		
			System.out.print(num%10);
			num = num/10;
		}
	}
}