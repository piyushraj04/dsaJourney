import java.util.Scanner;
class SkipMultipleOf10
{
	static void useOfContinue()
	{
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n%10==0)
			{
				System.out.println("ContinueAccepted and skip the num");
				continue;
			}
			System.out.println(n);
		}
		
		//or
		
		/*
		do
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n%10==0)
			{
				System.out.println("skip");
				continue;
			}
			System.out.println("Print:"+n);
		}while(true);
		*/
	}
	
	public static void main(String[] args)
	{
	    
		useOfContinue();
	}
}