import java.util.Scanner;
class Factorial
{
	static void findFact(int n)
	{
		int fact = 1;
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("The the no. : ");
		findFact(n=sc.nextInt());
	}
}