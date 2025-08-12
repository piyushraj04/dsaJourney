import java.util.Scanner;
class FindPrimeNo
{
	static boolean primeNo()
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//boolean isPrime = true;
		int count = 0;
		for(int i = 1;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				//isPrime=false;
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String [] args)
	{
		System.out.println(primeNo());
	}
}