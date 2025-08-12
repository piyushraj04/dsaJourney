import java.util.*;
public class LargestNumber {

    static int largestNum(int n[])
    {
        int num = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;

        for(int i = 0;i<n.length;i++)
        {
            if(num<n[i])
            {
                num = n[i];
            }
           
        }
        for(int i = 0;i<n.length;i++)
        {
            if(num2>n[i])
            {
                num2 = n[i];
            }
           
        }
        System.out.println("Smallest number is : "+num2);

        return num;
    }

    public static void main(String[] args) {
        int n [] = {6,559,985,869,5,6,5,2,96,5,956,454};
        int largestNum = largestNum(n);
        System.out.println("Largest value in the array is:"+largestNum);
    }
    
}
