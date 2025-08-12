import java.util.Scanner;
class PrintButNotDivisibleOf10
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		
	
		do
		{
			System.out.println("Enter the no. : ");
		    int num = sc.nextInt();	
			if(num%10==0)
			{
				System.out.println("Out of Loop");
				break;
			}
			System.out.println(num);
		}while(true);
	}
}