package ArrayAssignments;


import java.util.Scanner;

public class Solution {
    static boolean primeNo(int n)
    {
        int count = 0;
        for(int i =1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int tar = 0;
        for(int i=0; i<arr.length; i++){
            if(primeNo(arr[i])){
                tar += arr[i];
                cnt++;
            }
            if(tar>=target){
                break;
            }
        }
        System.out.println(cnt);
    }
}
