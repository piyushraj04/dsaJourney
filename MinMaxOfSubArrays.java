public class MinMaxOfSubArrays {

    public static void findSubArrays(int numbers[])
    {
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j = i;j<numbers.length;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    sum+=numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
                System.out.println("Sum is -->"+sum);
                // System.out.print((maxNum<sum)?maxNum=sum:" ");
                // System.out.print((minNum>sum)?minNum=sum:" ");
                if(minNum>sum){
                    minNum= sum;
                }
                if(maxNum<sum){
                    maxNum=sum;
                }
                sum=0;
                //System.out.println();
            }
            System.out.println("___________________________");
        }
        System.out.println("The Max Sum Of SubArrays is : "+maxNum);
        System.out.println("The Min Sum Of SubArrays is : "+minNum);

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        findSubArrays(numbers);
    }
    
}
