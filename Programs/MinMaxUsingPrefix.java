public class MinMaxUsingPrefix {

    public static void findSubArrays(int numbers[]) {
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int prefix[] = new int [numbers.length];
        prefix[0]= numbers[0];
        //calculate prefix array
        for(int i = 1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = i==0?prefix[j]: prefix[j]-prefix[i-1];
                if (minNum > sum) {
                    minNum = sum;
                }
                if (maxNum < sum) {
                    maxNum = sum;
                }
                sum = 0;
            } 
        }
        System.out.println("The Max Sum Of SubArrays is : " + maxNum);
        System.out.println("The Min Sum Of SubArrays is : " + minNum);
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        findSubArrays(numbers);
    }
}
