package String;

public class PallindromicSubString {
    private static boolean isPallindrome(String s)
    {
        String rev = "";
        for(int i = 0; i < s.length();i++)
        {
            rev = s.charAt(i)+rev;
        }
        return s.equals(rev);
    }

    private static void isPallindromicSubString(String s)
    {
        for(int i = 0; i < s.length();i++)
        {
            String temp = "" + s.charAt(i);
            for(int j = i+1; j < s.length();j++)
            {
                temp += s.charAt(j);
                if(isPallindrome(temp))
                {
                    System.out.println(temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        String s = "aabbajkjyuhuyhkj";
        isPallindromicSubString(s);

    }
    
}
