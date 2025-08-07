import java.util.Scanner;
class ReverseOfGivenNumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the no. : ");
		int num = sc.nextInt();	
		int reverse = 0;
		while(num>0)
		{		
		    reverse = (reverse*10)+num%10; //num%10 gives us the lastDigit
			num = num/10; //remove last digit
		}
		System.out.println("The reverse no. is : "+reverse);
	}
}