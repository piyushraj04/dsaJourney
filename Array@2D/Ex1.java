import java.util.Scanner;

public class Ex1
{
    public static void maxMin(int matrix[][])
    {
        int max  = matrix[0][0];
        int min = matrix[0][0];
        
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min)
                {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element is :"+min);
        System.out.println("Largest Element is :"+max);
    }
    public static void search(int matrix[][],int key)
    {
        
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Element found at index :"+i+","+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter m Size :");
        int m = sc.nextInt();
        System.out.println("Enter n Size");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];

        System.out.println("The row size is : "+matrix.length);
        System.out.println("The cols sze is : "+matrix[0].length);

        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                System.out.println("Enter the value of "+i+" "+j);
                matrix[i][j]=sc.nextInt();
            }
        }

        
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 6);
        maxMin(matrix);
    }
}