package ArrayAssignments;
import java.util.*;
public class DistinctsTriplets {
    public static void triplets(int arr[])
    {
        ArrayList <Integer> a = new ArrayList<Integer>();
        

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                for(int k = j+1;k<arr.length;k++)
                {
                        if(((arr[i]+arr[j]+arr[k])==0))
                    {
                         if(i!=j && i!=k && j!=k)
                         {
                            //System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                            a.add(arr[i]);
                            a.add(arr[j]);
                            a.add(arr[k]);
                            System.out.println(a);
                         }
                    }
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {-1, 0,  1, 2, -1, -4};
        triplets(arr);
    }
    
}
