public class DiagonalSumBruteForce {
    public static int diagonalSum(int matrix[][])
    {
        int priDiaSum = 0;
        int secDiaSum = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(i==j)
                {
                    priDiaSum+= matrix[i][j];
                }
                if(i+j==(matrix.length-1))
                {
                    secDiaSum+=matrix[i][j];
                }
            }
        }
        System.out.println("Primary Diagonal Sum is : "+priDiaSum);
        System.out.println("Secondary Diagonal Sum is :" + secDiaSum);

        return priDiaSum+secDiaSum;
    }
    public static void main(String[] args) {
         int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(diagonalSum(matrix));
    }
    
}
