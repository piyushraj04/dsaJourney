import java.util.Scanner;

class BinomialCoeff
{
	//Factorial_Method
	public static int factorial(int num)
	{

	   System.out.println("Value is : " + num);
		int fact = 1;
		while(num>0)
		{
			fact*=num;
			num--;
		}
		System.out.println("Factorial of current num is : " + fact);

		return fact;
	}
	
	public static int binomialCoefficient(int n,int r)
	{
	    Scanner sc = new Scanner (System.in);
		
		int fact_n = factorial(n);
		System.out.println("factorial of "+n+" is : " + fact_n);
		System.out.println();
		
		int fact_r = factorial(r);
		System.out.println("factorial of "+r+" is : " + fact_r);
		System.out.println();
		
		int fact_nmr = factorial(n-r);
		System.out.println("factorial of "+(n-r)+" is : " + fact_nmr);
		System.out.println();
		
		int binmCoeff = fact_n / (fact_r * fact_nmr);
		System.out.println();
		
		return binmCoeff;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter 'n' : ");
	    int n = sc.nextInt();
		
		System.out.println("enter 'r' : ");
		int r = sc.nextInt();
		
		System.out.println();
		
		int finalResult = binomialCoefficient(n,r);
		System.out.println("binomialCoefficient is : "+ finalResult);
	}
}