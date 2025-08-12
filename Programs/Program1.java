import java.util.Scanner;
class Program1
{
	public static int multiply(int a, int b)
	{
		return a*b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 'a' : ");
		int a = sc.nextInt();
		System.out.println("enter 'b' : ");
		int b = sc.nextInt();
		int product = multiply(a,b);
		System.out.println("Product is : " + product);
	}
}