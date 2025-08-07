public class TrappingRainwater {

    static int trappingRainwater(int height[]){
        int n = height.length;
        //Calculate Left Max Boundary
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i = 1;i<n;i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        /*
        for(int i = 0;i<leftMax.length;i++)
        {
            System.out.print(leftMax[i]+" ");
        }
        System.out.println(); 
         */
        //Calculate Right Max Boundary
        int rightMax[] = new int[n];
        rightMax[height.length-1]=height[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        /*
        for(int i = 0;i<n;i++)
        {
            System.out.print(rightMax[i]+" ");
        }
         */
        //Loop
        int trappedRainwater = 0;
       // int waterLevel = 0;
        for(int i = 0;i<n;i++)
        {
            //Calculate WaterLevel
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //Calculate Trapping Rainwater
            trappedRainwater += ( waterLevel - height[i])*1;
        }
        return trappedRainwater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("total trapped water : "+trappingRainwater(height));
    }
    
}
