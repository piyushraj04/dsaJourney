package String;

public class LeftSubsThenRightSubs {
    private static void leftSubsThenRightSubs(String s)
    {
        int l = 0, h = s.length();
        for(int i = 0 ; i < s.length(); i++)
        {
            if(i%2==0)
            {
                h--;
            }
            else
            {
                l++;
            }
            String temp = "";
            for(int j = l ; j <= h; j++)
            {
                temp = temp + s.charAt(j);
            }
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        String s = "JSPIDERS";
        leftSubsThenRightSubs(s);
    }
    
}
