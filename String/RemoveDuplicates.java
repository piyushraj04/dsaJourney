package String;

public class RemoveDuplicates {
    public static String removeDuplicate(String s)
    {
        String res  = "";
        for(int i = 0; i < s.length()-1; i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                continue;
            }
            else
            {
                res = res + s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("appnnacolllege"));
        
    }
    
}
