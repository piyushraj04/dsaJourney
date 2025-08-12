import java.util.Scanner;
class SkipThirdIteration
{
	static void useOfContinue(int n)
	{
		for(int i = 0;i<n;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		useOfContinue(sc.nextInt());
		//System.out.println();
	}
}