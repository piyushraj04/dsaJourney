import java.util.Scanner;
class LinearSearch
{
	
	static int linearSearch(int numbers[],int key)
	{
		for(int i = 0; i < numbers.length;i++)
		{
			if(numbers[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] numbers = {10,12,14,16,18,20};
		int key = sc.nextInt();
		int index = linearSearch(numbers,key);
		if(index == -1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Key at index :"+index);
		}
		
		
	}
}