import java.util.Scanner;
class FindPrimeNo2
{
	static boolean primeNo(int num)
	{
		
		boolean isPrime = true;
		
		for(int i = 2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isPrime = false;
			}
		}
		
		if(isPrime==true)
		{
			System.out.println(num + " is a Prime Num");
			return true;
		}
		else
		{
			System.out.println(num + " is not a Prime Num");
			return false;
		}
	
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		boolean status= primeNo(sc.nextInt());
		
		System.out.println("The status of Prime is : "+status);
	}
}