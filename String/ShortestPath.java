package String;

public class ShortestPath
 {

    public static double shortestPath(String str)
    {
        double dis = 0;
        int x2 = 0;
        int x = x2;
        int y2 = 0;
        int y = y2;
        for(int i = 0; i< str.length() ; i++)
        {
            if(str.charAt(i)=='N')
            {
                y2++;
            }
            else if(str.charAt(i)=='S')
            {
                y2--;
            }
            else if(str.charAt(i)=='E')
            {
                x2++;
            }
            else if(str.charAt(i)=='W')
            {
                x2--;
            }
        }
        dis = Math.sqrt((Math.pow((x2-x), 2))+(Math.pow((y2-y), 2)));
        return dis;
    }
  

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
    
}
