package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n)
    {
        //base condition
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return tilingProblem(n-1) + tilingProblem(n-2);
       /*
        *  //vertically
        int fnm1 = tilingProblem(n-1);
        //horizontally
        int fnm2 = tilingProblem(n-2);
        //total ways
        return fnm1 + fnm2;
        */
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
    
}
