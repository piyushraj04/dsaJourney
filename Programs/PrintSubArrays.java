public class PrintSubArrays {
    public static void subArrays(int numbers[])
    {
        int noOfSubArrays = 0;
        
        for(int i = 0;i<numbers.length;i++)
        {
            for(int j = i;j<numbers.length;j++)
            {
               for(int k = i;k<=j;k++)
               {
                System.out.print(numbers[k]+" ");
               }
               System.out.println();
               noOfSubArrays++;
            }
            System.out.println();
        }
        System.out.println("no of subArrays : "+noOfSubArrays);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subArrays(numbers);
    }
    
}
