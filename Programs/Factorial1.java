import java.util.Scanner;
class Factorial1
{
	static void findFact()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. : ");
		int fact = 1;
	    int n = sc.nextInt();
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
	}
	
	public static void main(String[] args)
	{
		findFact();
	}
}