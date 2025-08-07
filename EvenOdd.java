import java.util.Scanner;
class EvenOdd
{
	public static void main(String [] args)
	{
		int even = 0;
		int odd = 0;
		
		while(true)
		{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. : ");
		int num = sc.nextInt();
		if(num>100)
		{
			System.out.println("The entered no. is not allowed due to greater than limit");
			break;
		}
		if(num%2==0)
		{
			even+=num;
		}
		else
		{
			odd+=num;
		}
	
		}
		System.out.println("The sum of even no. is : "+ even);
		System.out.println("The sum of odd no. is : "+ odd);
	
	}
}