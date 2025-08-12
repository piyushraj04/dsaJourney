public class MaxsubarraySumUsingKadanesAlgoForNegativeInt {
      public static void kadanes(int numbers[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++)
        {
            currSum = currSum+numbers[i];
            if(currSum<0)
            {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our Max Subarray Sum is : "+ maxSum);
    }

    //for All-Negative Arrays:
        public static void maxsubarraySumForNegativeInt(int numbers[])
        {
            int  currSum = numbers[0]; // don't start with 0
            int maxSum = numbers[0];
            for(int i = 1;i<numbers.length;i++)
        {
            currSum = Math.max(numbers[i],currSum + numbers[i]);// carry or restart
            maxSum = Math.max(currSum,maxSum);// update max
        }
        System.out.println("Max Sum is : "+maxSum);
        }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        int numbersOnlyNegative[]={-6,-5,-12,-31,-8,-9,-98};
        kadanes(numbers);
        maxsubarraySumForNegativeInt(numbersOnlyNegative);
    }
    
}
